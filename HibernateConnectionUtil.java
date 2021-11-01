package com.shoppingmall.hibernateutils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConnectionUtil {
	public static SessionFactory getSessionFactory() {
	
		 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	     Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
	     
	     SessionFactory factory= meta.getSessionFactoryBuilder().build();
	     return factory;
	

}
}
