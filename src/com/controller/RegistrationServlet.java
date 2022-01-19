package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false;

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "<font color='red'>Please Enter FirstName</font>");
		}else {
			request.setAttribute("firstNameValue", firstName);
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "<font color='red'>Please Enter Eamil</font>");
		}else {
			request.setAttribute("emailValue", email);
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "<font color='red'>Please Enter Password</font>");
		}

		if (isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);

		}

	}
}
