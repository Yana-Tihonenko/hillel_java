<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n.actorsToFilmPage" />
<html>
<head>
    <title><fmt:message key="actorsToFilmPage.title"/> </title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<form method="post" action="/ActorToFilm">
    <p><fmt:message key="actorsToFilmPage.messageEnter"/> </p>
   <input name="actorToFilm" type="text" >
    <p><input type="submit" value="<fmt:message key="actorsToFilmPage.buttonFind"/> "></p>
</form>
</body>
</html>
