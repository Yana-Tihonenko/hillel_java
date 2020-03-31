<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n.actorsToFilmPageResultPage"/>

<html>
<head>
    <title><fmt:message key="actorsToFilmPageResultPage.title"/></title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<link rel="stylesheet" type="text/css" href="/css/csstable.css" media="all">
<table>
    <tr>
        <th><fmt:message key="actorsToFilmPageResultPage.table_title_idActor"/></th>
        <th><fmt:message key="actorsToFilmPageResultPage.table_title_FIOActor"/></th>
        <th><fmt:message key="actorsToFilmPageResultPage.table_title_BirthDateActor"/></th>
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
