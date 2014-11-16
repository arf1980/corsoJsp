<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Corso JSF</title>
</head>
<body>
	<% 
	String messaggio = (String) session.getAttribute("messaggio");
	if (messaggio == null){
		messaggio = "";
	}
	
	%>

	<script type="text/javascript">
	function doSubmit(page) {
		var form = document.getElementById("theForm");
		form.action = page;
		form.submit();
		
	}
	</script>

	<jsp:include page="frame/header.jsp"></jsp:include>
	<p style="color:red;">
		<%= messaggio %>
	</p>

	Ecco come lavora JSP:
	<br>

	<form id="theForm" method="post">
		Scrivi il tuo nome: <input type="text" name="nome" id="nome" /><br>
		Scrivi il tui cognome: <input type="text" name="cognome" id="cognome" /> <br>
		
		<input type="button" value="Senza Servlet" onclick="doSubmit('noServlet.jsp')">
		<input type="button" value="Con la Servlet" onclick="doSubmit('myServlet')">
	</form>


</body>
</html>