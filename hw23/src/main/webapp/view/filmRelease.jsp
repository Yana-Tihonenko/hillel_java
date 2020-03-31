<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n.relaeseFilms" />
<html>
<head>
    <title><fmt:message key="relaeseFilms.title"/></title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<link rel="stylesheet" type="text/css" href="/css/csstable.css" media="all">
<c:forEach items="${listfilm}" var="element">
<table>
    <tr>
        <th><fmt:message key="relaeseFilms.table_title_film"/></th>
        <th><fmt:message key="relaeseFilms.table_title_release"/></th>
        <th><fmt:message key="relaeseFilms.table_title_actorsToFilm"/></th>
        <th><fmt:message key="relaeseFilms.table_title_producertoFilm"/></th>
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
