<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "database.DatabaseFacade" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete word JSP</title>
<link rel="stylesheet" href="w3.css">
</head>
<body class="w3-light-grey ">
<div class="w3-container w3-blue-grey w3-opacity w3-left-align 	">
        <h1 class = "w3-xxxlarge">Delete word</h1>
    </div>
<div class = "w3-xlarge w3-container w3-center">
<%
	String en = request.getParameter("en");
	if(!en.equals(""))
	{
	DatabaseFacade.getStatment().execute("delete from words.words where(en='"+ en + "');");
%>
<br>Done!<br>
<% }
	else
	{
		%>
		<br>Can`t delete nothing!<br>
		<%
	}
%>
<div class = "w3-flex">
<button class = "w3-btn w3-hover-green w3-round-large"onclick="location.href='deleteWord'">Delete more</button>
<button class="w3-btn w3-hover-red w3-round-large w3-margin-top"onclick="location.href='index.html'">Back</button>
</div>

</div>
</body>
</html>