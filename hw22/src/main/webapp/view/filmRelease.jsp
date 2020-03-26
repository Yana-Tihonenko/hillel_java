<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Relaese films</title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<link rel="stylesheet" type="text/css" href="/css/csstable.css" media="all">
<c:forEach items="${listfilm}" var="element">
<table>
    <tr>
        <th>Film</th>
        <th>releaseFilm</th>
        <th>actorsToFilm</th>
        <th>producertoFilm</th>
    </tr>
    <tr>
        <td>${element.nameFilm}</td>
        <td>${element.releaseFilm}</td>
        <td>${element.actorsToFilm}</td>
        <td> ${element.producertoFilm}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
