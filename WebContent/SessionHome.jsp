<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h2>Session Home </h2>
Welcome , <%=session.getAttribute("email") %>
<br><br>

<a href="SessionCart.jsp">SessionCart </a> | 
<a href="SessionOrder.jsp">SessionOrder </a> | 

<a href="SessionLogoutServlet">Logout </a> | 
</body>
</html>