package com.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.AdminDao;
import com.dao.CustomerDao;
import com.domain.Admin;
import com.domain.Customer;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
/**
 * 操作客户的action
 *
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	Map<String, Object> context = ActionContext.getContext().getApplication();
	private Long c_id;
	int temp=0;
	int zy=0;
	int pt=0;
	public Long getC_id() {
		return c_id;
	}

	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	//创建Javabean对象
	private Customer customer=new Customer();
	/**
	 * 获取请求输入的对象
	 */
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	public String save(){
		
		new CustomerDao().addCus(customer);
		Admin admin= (Admin) context.get("user");
		
		admin.getCustomers().add(customer);
		new AdminDao().addCus(admin);
		System.out.println("保存用户成功!");
		return SUCCESS;
	}
	/**
	 * 获取所有客户信息的list,并存储到值栈中
	 * @return
	 */
	public String list(){
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈
		Admin admin= (Admin) context.get("user");
		Admin admin2=AdminDao.getById(admin.getAdmin_id());
		context.put("user", admin2);
		List<Customer> list=new ArrayList<Customer>(admin2.getCustomers());
		
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
		context.put("zy", zy);
		context.put("pt", pt);
		vs.set("list", list);										//将值传入值栈
		
		return "list";												//返回结果
	}
	/**
	 * 初始化并传递到修改页面
	 * @return
	 */
	
	public String initedit(){
		System.out.println("-----------*********************-----------");
		System.out.println(getC_id());
		Customer customer2=new CustomerDao().findById(getC_id());//通过获取的id
		System.out.println(customer2.getGj3());
		//System.out.println(customer2.getUsername());	//打印获取到客户的名字[方便调试代码,可无视]
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈对象
		vs.set("customer", customer2); 									//压入客户对象
		
		return "initedit";
		
	}
		
	public String edit(){
		Admin admin= (Admin) context.get("user");
		customer.setAdmin(admin);
		System.out.println(customer.getGj3());
		new CustomerDao().upDate(customer);
		System.out.println("修改客户成功!");
		context.put("user", admin);
		return SUCCESS;
	}
	public String delete(){
		Customer customer2=new CustomerDao().findById(getC_id());			//通过获取的id
		new CustomerDao().delete(customer2);								//调用持久层对象,删除
		System.out.println("删除客户成功!");
		return SUCCESS;
	}
	/**
	 * 跟进客户,
	 * @return
	 */
	public String gj(){
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈
		Admin admin= (Admin) context.get("user");
		Admin admin2=AdminDao.getById(admin.getAdmin_id());
		context.put("user", admin2);
		if(admin2.getCustomers()!=null){
		List<Customer> list=new ArrayList<Customer>(admin2.getCustomers());
		
		vs.set("list", list);										//将值传入值栈
		System.out.println(list.get(0).getUsername());
		}
		return "gjlist";			
	}
	public String initgj(){
		
		System.out.println("-----------*********************-----------");
		System.out.println(getC_id());
		Customer customer2=new CustomerDao().findById(getC_id());//通过获取的id
		System.out.println(customer2.getUsername());	//打印获取到客户的名字[方便调试代码,可无视]
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈对象
		vs.set("customer", customer2); 	
		return "initgj";		
	}
	/**
	 * 跟進客戶
	 * @return
	 */
	public String gjsuccess(){
		Admin admin= (Admin) context.get("user");
		customer.setAdmin(admin);
		System.out.println(customer.getEmail());
		System.out.println(customer.getSdean());
		new CustomerDao().upDate(customer);
		System.out.println("跟进客户成功!");
		context.put("user", admin);
		return SUCCESS;
	}
	
	public String select(){
		List<Customer> list=new CustomerDao().findByName(customer.getUsername(),customer.getSdean());
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈
		vs.set("list", list);			
		return "list";
	}
}
