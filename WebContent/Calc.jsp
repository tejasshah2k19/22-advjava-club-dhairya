<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<form action="CalcServlet" method="post">
	No1 : <input type="text" name="n1"/>
	${n1Error}
	<br><br>
	No2 : <input type="text" name="n2"/>	${n2Error}<br><br>

	<input type="Submit" value="Addition"/>
</form>

</body>
</html>