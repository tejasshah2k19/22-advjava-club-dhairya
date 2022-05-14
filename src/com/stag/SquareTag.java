package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SquareTag extends SimpleTagSupport {

	//attribute --> instance variable --> getters setters 
	int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut(); 
		out.print(num*num);
	}
}
