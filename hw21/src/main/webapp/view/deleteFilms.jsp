<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Delete films from year</title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<form method="post" action="/DeleteFilmToYear">
    <p> Enter year , for example 1995</p>
    <input name="year" type="text" >
    <p><input type="submit" value="Delete"></p>
</form>

</body>
</html>
