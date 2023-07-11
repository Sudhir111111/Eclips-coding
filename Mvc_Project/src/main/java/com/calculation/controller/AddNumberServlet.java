package com.calculation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calculation.models.AddNumbers;

@WebServlet("/AddNumberServlet")
public class AddNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddNumberServlet() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
		int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
AddNumbers ad=new AddNumbers();
int add = ad.add(num1, num2);
request.setAttribute("sa","the total is :"+add);
RequestDispatcher re = request.getRequestDispatcher("index.jsp");
re.forward(request, response);
		}
		catch(Exception e) {
			request.setAttribute("error","invalid format");
			RequestDispatcher re1 = request.getRequestDispatcher("index.jsp");
			re1.forward(request, response);

			

		}




	}

}
