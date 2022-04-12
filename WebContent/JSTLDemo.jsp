<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>

	<h3>Variale declaration</h3>
	<%
		int a = 10;
	%>
	<c:set var="b" value="10"></c:set>


	<h3>Print</h3>
	<%=a%>
	<c:out value="${b}"></c:out>


	<%
		if (a % 2 == 0) {
	%>
	EVEN
	<%
		}
	%>

	<h3>Condition</h3>
	<c:if test="${b%2==0}">
	EVEN 
</c:if>

	<h3>Loop</h3>
	<c:forEach var="x" begin="1" end="10" step="2">
	${x}<br>
	</c:forEach>



	<h3>Loop 2</h3>
	<c:set var="days" value="sun,mon,tue,wen,thus,fri,sat"></c:set>


	<c:forTokens items="${days}" delims="," var="d">
${d }<br>
	</c:forTokens>


	<h3>SwitchCase</h3>

	<c:choose>
		<c:when test="${b==1}">
			case 1
		</c:when>

		<c:when test="${b==2 }">
			case 2
		</c:when>

		<c:otherwise>
			Default
		</c:otherwise>
	</c:choose>




</body>
</html>