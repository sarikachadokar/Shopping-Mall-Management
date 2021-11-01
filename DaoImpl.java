package com.shoppingmall.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shoppingmall.hibernateutils.HibernateConnectionUtil;
import com.shoppingmall.pojo.Register;
import com.shoppingmall.pojo.Shop;
import com.shoppingmall.pojo.User;
import com.shoppingmall.pojo.UserLogin;
import com.shoppingmall.service.DataAccessService;

public class DaoImpl implements DataAccessService {

	private  SessionFactory sessionfactory = null;

	@Override
	public void registerUser(User user) {
		
		sessionfactory = HibernateConnectionUtil.getSessionFactory();
		Session session =sessionfactory.openSession(); 
		Transaction  transaction= session.beginTransaction();
		session.save(user); 
		transaction.commit(); 
		session.close();
	}
	public void loginUser(UserLogin login) {
		sessionfactory = HibernateConnectionUtil.getSessionFactory();
		Session session =sessionfactory.openSession(); 
		Transaction  transaction= session.beginTransaction();
		session.save(login); 
		transaction.commit(); 
		session.close();
		
	}

	@Override
	public Register findByEmail(String email) {
		sessionfactory = HibernateConnectionUtil.getSessionFactory();
		Session session =sessionfactory.openSession(); 
		Transaction  transaction= session.beginTransaction();
		Register register = (Register) 	session.get(Register.class, email);
		session.close();
		return register;
	}

	@Override
	public List<Shop> findAllShops() {
		// TODO Auto-generated method stub
		sessionfactory = HibernateConnectionUtil.getSessionFactory();
		Session session =sessionfactory.openSession(); 
		Transaction  transaction= session.beginTransaction();
		TypedQuery<Shop> query= session.createQuery("from Shop");
		List<Shop> shops=query.getResultList();
	System.out.println(shops.get(0).getShopName());
	session.close();
		return shops;
	}
	 
	

}
