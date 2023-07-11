<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddNumberServlet" method="post">
num1<input type="text" name="num1"/><br>
num2<input type="text" name="num2"/><br>
<input type="submit" value="add"/>
<input type="submit" value="sub"/>
<input type="submit" value="mul"/>
<input type="submit" value="div"/>
<input type="submit" value="add"/>
<input type="submit" value="add"/>
</form>
<%
if(request.getAttribute("sa")!=null){
out.print(request.getAttribute("sa"));
}
%>
<%
if(request.getAttribute("error")!=null){
out.print(request.getAttribute("error"));
}
%>

</body>
</html>