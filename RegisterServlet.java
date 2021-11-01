package com.shoppingmall.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shoppingmall.dao.DaoImpl;
import com.shoppingmall.hibernateutils.HibernateConnectionUtil;
import com.shoppingmall.pojo.Register;
import com.shoppingmall.pojo.Shop;
import com.shoppingmall.pojo.User;
import com.shoppingmall.service.DataAccessService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/userregister.jsp");
		 dispatcher.forward(request, response);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();

		String uname = request.getParameter("uname");
		String role = request.getParameter("role");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Shop shop = new Shop();
		shop.setShopId(Integer.parseInt(request.getParameter("Shop")));
		user.setShop(shop);
		

		user.setUserName(uname);
		user.setUserRole(role);
		user.setEmailId(email);
		user.setPassword(password);
		System.out.println(user.toString());
		
		if(uname.isEmpty() || role.isEmpty() || email.isEmpty() || password.isEmpty() ) {
			//response.sendRedirect("/pages/adminaccess.html");
			//response.sendRedirect("pages/user.jsp");
			response.sendRedirect("pages/userlogin.jsp");
			
			}
			else {
				//response.sendRedirect("pages/userlogin.jsp"); 
				response.sendRedirect("pages/adminaccess.html");
			}
		
			/*
			 * if(email.equals(email) && password.equals(password)) {
			 * //response.sendRedirect("/pages/adminaccess.html");
			 * 
			 * }
			 */

		DataAccessService dataservice = new DaoImpl();
		dataservice.registerUser(user);
		
		
		
		
		
		/*
		 * user.setUserName(request.getParameter("uname"));
		 * user.setUserRole(request.getParameter("role"));
		 * user.setEmailId(request.getParameter("email"));
		 * user.setPassword(request.getParameter("password"));
		 * 
		 * Shop shop = new Shop();
		 * shop.setShopId(Integer.parseInt(request.getParameter("Shop")));
		 * user.setShop(shop);
		 
		System.out.println(user.toString());*/
		/* System.out.println(shop.getShopName()); */
		// Validation check
		
		 if (request.getParameter("uname") == null ||
		 "".equals(request.getParameter("uname")) || request.getParameter("email") ==
		 null || "".equals(request.getParameter("email"))) {
		 
		 request.setAttribute("errMsg", "One or both fields are empty");
		 
		 RequestDispatcher rd = request.getRequestDispatcher("/pages/admin.html");
		 rd.include(request, response);
		 
		 }
		 

		// use to store data in database
		/*
		 * DataAccessService dataservice = new DaoImpl();
		 * dataservice.registerUser(user);
		 */
		// return response
		PrintWriter writer = response.getWriter();

		// build HTML code
		String htmlRespone = "<html>";
		/*
		 * htmlRespone += "<h2>Your username is: " + register.getName() + "<br/>";
		 * htmlRespone += "Your email is: " + register.getEmailId() + "</h2>";
		 */
		/* htmlRespone += "</html>"; */

		htmlRespone += "<h2>Enter UserName:" + user.getUserName() + "</br>";
		htmlRespone += "Email:" + user.getEmailId() + "</h2>";

		htmlRespone += "</html>";

		// return response
		writer.println(htmlRespone);
	}
}
