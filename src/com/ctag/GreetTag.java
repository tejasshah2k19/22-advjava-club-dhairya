package com.ctag;

import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetTag extends TagSupport {

	// <greet>
	public int doStartTag() throws JspException {

		Date d = new Date();
		int h = d.getHours();
		JspWriter out = pageContext.getOut();
		try {
			if (h >= 0 && h <= 11) {
				out.print("Good Morning");
			} else if (h >= 12 && h <= 17) {
				out.print("Good Noon");
			} else {
				out.print("Good Evening");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return EVAL_BODY_INCLUDE; //EVAL_BODY_INCLUDE; SKIP_BODY;
	}

	// </greet>
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
//		return EVAL_PAGE; // SKIP_PAGE EVAL_PAGE
		return SKIP_PAGE;
	}
}
