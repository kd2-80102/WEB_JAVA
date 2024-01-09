package com.app.utils;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class HibernateUtils {
	private static SessionFactory factory;
	static {
		System.out.println("Inside static init method");
	factory=new Configuration().//creates empty configuration object created
			configure().//reads hibernate configuration file:populate config
			buildSessionFactory();
	System.out.println("Session Factory created");
	}
	public static SessionFactory getFactory() {
		return factory;
	}
	public static void setFactory(SessionFactory factory) {
		HibernateUtils.factory = factory;
	}
	
}
