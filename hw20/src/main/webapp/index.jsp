<%@ page language="java" contentType="text/html;charset=UTF-8"  pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>My first web-app</title>
</head>
<body>
<h1>My first web-app</h1>
<p>Enter numbers through by commas</p>
<form method="post" action="/views/sortnumber.jsp">
    <p><input name="sortnumber" type="text" ></p>
    <p><input type="submit" value="Sort"></p>
</form>
<p>Enter word</p>
<form method="post" action="/views/findword.jsp" >
    <p><input name="findword" type="text"></p>
    <p><input type="submit" value="Find"></p>
</form>
<body>

</body>
</html>
