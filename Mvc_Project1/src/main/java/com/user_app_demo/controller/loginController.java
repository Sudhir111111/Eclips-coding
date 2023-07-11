package com.user_app_demo.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user_app_demo.models.DatabaseConnection;
import com.user_app_demo.models.Login;

@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response, Connection db)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Login lo=new Login();
		DatabaseConnection db1=new DatabaseConnection();
		Connection establishConnectin = db1.establishConnectin();
		
		boolean vr = lo.verifyLogin(email,password,establishConnectin);

		
		
		System.out.println(vr);
		

	}

}
