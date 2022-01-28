package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalcFilter implements Filter {

	public void destroy() {

	}

	// logic
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");

		boolean isError = false;

		if (n1 == null || n1.trim().length() == 0) {
			isError = true;
			request.setAttribute("n1Error", "Please Enter N1");
		}
		if (n2 == null || n2.trim().length() == 0) {
			isError = true;
			request.setAttribute("n2Error", "Please Enter N2");
		}

		if (isError) {
			request.getRequestDispatcher("Calc.jsp").forward(request, response);
		} else {
			chain.doFilter(request, response);// next filter or servlet
		}

	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
