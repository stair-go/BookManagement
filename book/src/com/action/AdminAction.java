package com.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.AdminDao;
import com.domain.Admin;
import com.domain.Customer;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.utils.HibernateUtils;

public class AdminAction extends ActionSupport implements ModelDriven<Admin>{
	Map<String, Object> context = ActionContext.getContext().getApplication();
	private String text;
	int temp=0;
	int zy=0;
	int pt=0;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	Admin admin=new Admin();
	public Admin getModel() {
		return admin;
	}
	/**
	 * 登录功能,获取传递的Model,再通过DAO层,判断是否有这个用户
	 * @return
	 */
	public String login(){
		Admin admin2=new AdminDao().findByNameAndPwd(getModel());
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		if (admin2!=null) {
			if(temp==0){
				pt=0;
				zy=0;
				context.put("msg2"," ");
			}
			if (admin2!=null) {
				List<Customer>list=new  ArrayList (admin2.getCustomers());
				for (Customer customer : list) {
					if(customer.getGj1()==null && customer.getGj2()==null && customer.getGj3()==null){
						context.put("msg2", context.get("msg2").toString()+customer.getUsername()+" ");
						temp++;
					}
					if(customer.getZy().equals("重要")){
						zy++;
					}
					else if(customer.getZy().equals("普通")){
						pt++;
					}
				}
				if (context.get("msg2")!=null||temp!=0){
					context.put("msg2","有未跟进客户!"+context.get("msg2").toString()+"注意查看,跟进!");
					valueStack.set("msg2", context.get("msg2").toString());
				}
				if(temp==0){
					context.put("msg2"," ");
				}
				context.put("zy", zy);
				context.put("pt", pt);
				context.put("user", admin2);
				return "login";
			}
		}
		else 
			valueStack.set("msg", "用户名或密码错误,请重新输入");
		return "againenter";
	}
	public String text(){
		Admin admin2= (Admin) context.get("user");
		
		System.out.println(admin.getText());
		admin2.setText(admin.getText());
		new AdminDao().updata(admin2);
		context.put("user", admin2);
		return SUCCESS;
	}
	
	public void addCus(Admin admin) {
		
		Session session=HibernateUtils.getSession();	     //开启对话
		Transaction transaction=session.beginTransaction();  //获取事务
		session.merge(admin);                              //保存customer
		transaction.commit();								 //提交事务
		session.close();									 //关闭对话
	}
	/**
	 * 注册
	 * @return
	 */
	public String logintwo(){
		
		System.out.println(admin.getPassword());
		new AdminDao().updata(admin);
		return login();
	}
	public String updata(){
		Admin admin2= (Admin) context.get("user");
		admin.setCustomers(admin2.getCustomers());
		new AdminDao().updata(admin);
		context.put("user", admin);
		return SUCCESS;
	}
}
