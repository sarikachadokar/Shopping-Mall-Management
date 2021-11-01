package com.shoppingmall.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.shoppingmall.dao.DaoImpl;
import com.shoppingmall.pojo.Register;
import com.shoppingmall.pojo.Shop;
import com.shoppingmall.pojo.User;
import com.shoppingmall.pojo.UserLogin;
import com.shoppingmall.service.DataAccessService;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLogin")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/userlogin.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		User user= new User();
	     user.setEmailId(email);
		user.setPassword(password);
		
		DataAccessService dataservice = new DaoImpl();
		dataservice.registerUser(user);
		if(user!=null)
		{
			HttpSession s=request.getSession();
			s.setAttribute("name",user);
			response.sendRedirect("pages/admin.html");
		}
		else
		{
			response.sendRedirect("pages/userlogin.jsp");
		}
		
		
	}
}

/*
 * UserLogin login = new UserLogin();
 * 
 * login.setEmailId(request.getParameter("email"));
 * login.setPassword(request.getParameter("password"));
 * 
 * 
 * System.out.println(login.toString()); System.out.println(shop.getShopName());
 * // Validation check
 * 
 * 
 * if
 * (request.getParameter("email").equals(login.setEmailId(request.getParameter(
 * "email")) &&
 * request.getParameter("password").equals(login.setPassword(request.
 * getParameter("password"))){ response( response, "login ok"); } else {
 * response(response, "invalid login"); }
 * 
 * if (request.getParameter("email") == null ||
 * "".equals(request.getParameter("email")) || request.getParameter("password")
 * == null || "".equals(request.getParameter("password"))) {
 * 
 * request.setAttribute("errMsg", "One or both fields are empty");
 * 
 * RequestDispatcher rd = request.getRequestDispatcher("/pages/admin.html");
 * rd.include(request, response);
 * 
 * }
 * 
 * 
 * 
 * 
 * // use to store data in database DataAccessService dataservice = new
 * DaoImpl(); dataservice.loginUser(login); // return response PrintWriter
 * writer = response.getWriter();
 * 
 * // build HTML code String htmlRespone = "<html>";
 * 
 * htmlRespone += "<h2>Your username is: " + register.getName() + "<br/>";
 * htmlRespone += "Your email is: " + register.getEmailId() + "</h2>";
 * 
 * htmlRespone += "</html>";
 * 
 * htmlRespone += "<h2>Enter Email:" + login.getEmailId() + "</br>"; htmlRespone
 * += "Password:" + login.getPassword() + "</h2>";
 * 
 * htmlRespone += "</html>";
 * 
 * // return response writer.println(htmlRespone); }
 * 
 * private void response(HttpServletResponse response, String string) { // TODO
 * Auto-generated method stub
 * 
 * } }
 */
