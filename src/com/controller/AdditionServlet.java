package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int x, y, ans;
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		boolean isErrror = false;
		String err = "";
		if (n1 == null || n1.trim().length() == 0) {
			isErrror = true;
			err = err + "Please Enter N1 ";
		}

		if (n2 == null || n2.trim().length() == 0) {
			isErrror = true;
			err = err + "Please Enter N2 ";
		}

		if (isErrror) {

		} else {

		}

		PrintWriter out = response.getWriter();

		if (isErrror) {
			response.setContentType("text/html"); // MIME
			out.print("<html><body>");
			out.print(err);
			out.print("</body></html>");
		} else {
			x = Integer.parseInt(n1);
			y = Integer.parseInt(n2);
			ans = x + y;
			response.setContentType("text/html"); // MIME
			out.print("<html><body>");
			out.print("Addition = " + ans);
			out.print("</body></html>");
		}
	}
}
