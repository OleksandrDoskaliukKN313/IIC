<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>

<%@page import = "database.DatabaseFacade" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All words</title>
<link rel="stylesheet" href="w3.css">
</head>
<body class="w3-light-grey ">
<div class="w3-container w3-blue-grey w3-opacity w3-left-align 	">
        <h1 class = "w3-xxxlarge">All words</h1>
    </div>
    <div class = "w3-xlarge w3-container w3-center">
    <%
	
	ResultSet resultSet = DatabaseFacade.getStatment().executeQuery("SELECT * FROM words.words");
	while(resultSet.next())
	{
		out.println(resultSet.getString(1) + " - " + resultSet.getString(2)+"<br>");
	}
	
%>
<button class="w3-btn w3-hover-red w3-round-large w3-large w3-margin-top" onclick="location.href='index.html' ">Back</button>
</div>

</body>
</html>