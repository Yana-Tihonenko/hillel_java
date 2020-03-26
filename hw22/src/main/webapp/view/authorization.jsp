<%--
  Created by IntelliJ IDEA.
  User: 10
  Date: 26.03.2020
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>"Authorization"</title>

</head>
<body>
<jsp:include page="/util/header.jsp"/>
<form method="post" action="/Authorization">
    <p> Enter name  and password  </p>
    <input name="username" type="text" >
    <input name="password" type="text" >
    <p><input type="submit" value="Authorization"></p>
</form>
<c:if test="${not empty error}">
    ${error}
</c:if>
</body>
</html>
