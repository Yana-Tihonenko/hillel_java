<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Actors to Film"</title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<link rel="stylesheet" type="text/css" href="/css/csstable.css" media="all">
<table>
    <tr>
        <th>ID Actor</th>
        <th>Actor</th>
        <th>BirthDateActor</th>
    </tr>
    <tr class="table data">
        <c:forEach items="${actorsList}" var="element">
        <td>${element.id}</td>
        <td>${element.fioActor}</td>
        <td>${element.birthDateActor}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
