<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "database.DatabaseFacade" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EN TO UA</title>
<link rel="stylesheet" href="w3.css">
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-left-align 	">
        <h1 class = "w3-xxxlarge">My dictionary!</h1>
    </div>
<div class="w3-container w3-center w3-card-4 w3-flex w3-xxlarge">
<form action = <%=(String)request.getAttribute("servlet")%> >
    EN word: <%=(String)request.getAttribute("word")%>
    <br><br>
    <input name="ua" />
    <%request.setCharacterEncoding("UTF-8"); %>
    <input class=" w3-hover-green w3-round-large" type="submit" value="OK" />
   
</form>
</div>

</body>
</html>