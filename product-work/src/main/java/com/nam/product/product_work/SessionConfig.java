package com.nam.product.product_work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionConfig {
	public static Session getSession()
	{
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Product.class);
    	SessionFactory sessionFactory = config.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	return session;
	}
}
