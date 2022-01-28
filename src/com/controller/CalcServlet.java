package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		
		int no1  = Integer.parseInt(request.getParameter("n1"));
		int no2 = Integer.parseInt(request.getParameter("n2"));
		
		int ans = no1 + no2; 
		
		request.setAttribute("ans", ans);

		request.getRequestDispatcher("CalcAns.jsp").forward(request, response);
	}
}
