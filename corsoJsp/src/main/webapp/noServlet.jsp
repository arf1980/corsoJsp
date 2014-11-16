<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>No Servlet</title>
</head>
<body>
	<jsp:include page="frame/header.jsp"></jsp:include>

	<% 
	String nome = request.getParameter("nome");
	String cognome = request.getParameter("cognome");
	%>
	
	Non facendo uso della servlet restituisco i parametri: <br>
	Nome: <%= nome %> <br>
	Cognome: <%= cognome %>
</body>
</html>