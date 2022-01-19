package com.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//servlet-api.jar 
public class SignupServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println("SignupServlet::service()");
		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);
	}
}
