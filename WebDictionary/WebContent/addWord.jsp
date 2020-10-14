<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "database.DatabaseFacade" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new word</title>
<link rel="stylesheet" href="w3.css">
</head>
<body class="w3-light-grey ">
<div class="w3-container w3-blue-grey w3-opacity w3-left-align 	">
        <h1 class = "w3-xxxlarge">Add new word</h1>
    </div>
<div class = "w3-xlarge w3-container w3-center">
<%
	String en = request.getParameter("en");
	if(!en.equals(""))
	{
	String ua = new String(request.getParameter("ua").getBytes("ISO-8859-1"),"UTF8");
	
	DatabaseFacade.getStatment().execute("insert into words.words (en,ua,count_correct_en,count_correct_ua) values("+"'"+en+"',"
				+"'"+ua+"',"+"0,0);");
	
	
	%>
		<p>EN: <%=en  %></p>
        <p>UA: <%=ua  %></p>
        <p>Done!</p>
        <%
        }
	else
	{
		%>
		<p>Can`t add nothing!</p>
		<%
	}
	%>
        <div >
        <button class = "w3-btn w3-hover-green w3-round-large" onclick="location.href='addWord'">Add new word</button>
        <br>
        <button class="w3-btn w3-hover-red w3-round-large w3-large w3-margin-top" onclick="location.href='index.html'">Back</button>
        </div>
</div>
	
       
</body>
</html>