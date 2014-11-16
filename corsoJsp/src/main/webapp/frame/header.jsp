<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	
	<% 
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss.SSS");
	Date data = new Date();
	%>

	<h1>Corso JSP</h1>
	<hr>
	<%= sdf.format(data) %>
	<hr>
	<br>
	
