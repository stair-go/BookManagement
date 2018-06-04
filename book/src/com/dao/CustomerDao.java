package com.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.domain.Admin;
import com.domain.Customer;
import com.opensymphony.xwork2.ActionContext;
import com.utils.HibernateUtils;

public class CustomerDao {
	
	Map<String, Object> context = ActionContext.getContext().getApplication();
	/**
	 * 新增图书一个图书信息
	 * @param book
	 */

	/**
	 * 获取所有客户信息,并返回List
	 * @return
	 */
	public List<Customer> findAll() {
		Session session = HibernateUtils.getSession();
		
		// 通过session,创建criteria,和book的反射,查询所有Book类
		Criteria criteria = session.createCriteria(Customer.class);
		//通过上方criteria 返回list<Book>
		List<Customer> list = criteria.list();
				
		session.close();
		return list;
	}
	/**
	 * 通过传入book的id,返回book对象
	 * @param book_id
	 * @return
	 */
	public Customer findById(Long cid) {
		Session session = HibernateUtils.getSession();
		return session.get(Customer.class, cid);
	}
	/**
	 * 通过传入book对象,进行book对象的修改
	 * @param customer
	 */
	public void upDate(Customer customer) {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		
		session.merge(customer);	   //修改对象
		
		tr.commit();
		session.close();
		
	}
	/**
	 * 删除Book信息
	 * @param customer2
	 */
	public void delete(Customer customer2) {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		
		session.delete(customer2);	//删除传入对象
		
		tr.commit();
		session.close();
	}
	public List<Customer> findByName(String name, String dean) {
		// QBC查询
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 查询
		Criteria criteria = session.createCriteria(Customer.class);
		
		// 添加查询的条件
		if(name != null && !name.trim().isEmpty()){
			// 添加查询的条件
			criteria.add(Restrictions.like("username", "%"+name+"%")); //查询带有关键字的对象
			criteria.add(Restrictions.like("sdean", "%"+dean+"%")); //查询带有关键字的对象
		}
		
		// 查询
		List<Customer> list = criteria.list();
		tr.commit();
		session.close();
		return list;
	}
	
	public void addCus(Customer customer) {
		
		Session session=HibernateUtils.getSession();	     //开启对话
		Transaction transaction=session.beginTransaction();  //获取事务
		
		session.saveOrUpdate(customer);                              //保存customer
		
		transaction.commit();								 //提交事务
		session.close();									 //关闭对话
		
	}
	
}
