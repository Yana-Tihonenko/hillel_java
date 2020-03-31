<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n.actorToCountFilmPage" />
<html>
<head>
    <title><fmt:message key="actorsToCountFilmPage.title"/></title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<form method="post" action="/ActorToCountFilm">
    <p> <fmt:message key="actorsToCountFilmPage.messageEnter"/></p>
    <input name="countFilms" type="text" >
    <p><input type="submit" value="<fmt:message key="actorsToCountFilmPage.buttonFind"/>"></p>
</form>
</body>
</html>
