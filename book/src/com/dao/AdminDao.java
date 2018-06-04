package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.domain.Admin;
import com.domain.Customer;
import com.opensymphony.xwork2.ActionContext;
import com.utils.HibernateUtils;

public class AdminDao {
	/**
	 * 通过用户名和密码查询数据库
	 * @param user
	 * @return
	 */
	public Admin findByNameAndPwd(Admin admin){
		// 先获取
		Session session = HibernateUtils.getSession();
		// 使用用户名和密码进行查询
		Query query = session.createQuery("from Admin where username = ? and password = ?");
		// 设置参数
		query.setParameter(0, admin.getUsername());
		query.setParameter(1, admin.getPassword());
		// 查询
		List <Admin> list = query.list();
		// 有数据
		if(list.size() > 0){
			Map<String, Object> context = ActionContext.getContext().getApplication();
			context.put("admin", list.get(0));
			return list.get(0);
		}
		return null;
	}
	
	public void addCus(Admin admin) {
		
		Session session=HibernateUtils.getSession();	     //开启对话
		Transaction transaction=session.beginTransaction();  //获取事务
		
		session.merge(admin);                              //保存customer
		
		transaction.commit();								 //提交事务
		session.close();									 //关闭对话
		
	}

	public static Admin getById(Long admin_id) {
		Session session = HibernateUtils.getSession();
		
		return session.get(Admin.class, admin_id);
	}

	public  void updata(Admin admin) {
		Session session=HibernateUtils.getSession();	     //开启对话
		Transaction transaction=session.beginTransaction();  //获取事务
		
		session.merge(admin);                              //保存customer
		
		transaction.commit();								 //提交事务
		session.close();	
	}

	public void addAdmin(Admin admin) {
		Session session=HibernateUtils.getSession();	     //开启对话
		Transaction transaction=session.beginTransaction();  //获取事务
		
		session.save(admin);                              //保存customer
		
		transaction.commit();								 //提交事务
		session.close();	
	}
}
