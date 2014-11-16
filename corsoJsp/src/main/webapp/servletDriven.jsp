<%@page import="com.lenzi.fra.corsoJsp.beans.Utente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Servlet driven</title>
</head>
<body>
	<jsp:include page="frame/header.jsp"></jsp:include>

	<% 
	// recupero l'oggetto utente dalla sessione
	Utente utente = (Utente) session.getAttribute("utente");
	%>
	
	Faccio uso dell'oggetto utente che mi sono salvato in sessione graie alla sevlet: <br>
	Nome: <%= utente.getNome() %> <br>
	Cognome: <%= utente.getCognome() %>
</body>
</html>