package com.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * 持久化类操作工具,管理绘画的开启
 * @author Administrator
 *
 */
public class HibernateUtils {
	private static final Configuration CONFIGURATION;
	private static final SessionFactory FACTORY;
	
	//静态代码块
	static{
		//加载XML配置文件
		CONFIGURATION=new Configuration().configure();
		//构造工厂
		FACTORY =CONFIGURATION.buildSessionFactory();
	}
	public static Session getSession(){
		return FACTORY.openSession();
	}
	
	
}
