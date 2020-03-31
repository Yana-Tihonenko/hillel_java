<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n.menu" />
<html>
<head>

</head>
<body>
<link rel="stylesheet" type="text/css" href="/css/csstable.css" media="all">
<form action="/Сhangelocale" method="post">
    <select name="lang">
        <option value="en_US">English</option>
        <option value="ru_RU">Russian</option>
    </select>
    <input type="submit" value="Change lang"/>
</form>
<table>
    <tr>
        <th><a href="/FilmRelease"><fmt:message key="menu.filmRelease"/></a></th>
        <th><a href="/view/actorToFilm.jsp"><fmt:message key="menu.actorToFilm"/></a></th>
        <th><a href="/ActorsToProducer"><fmt:message key="menu.actorsToProducer"/></a></th>
        <th><a href="/view/actorCountFilms.jsp"><fmt:message key="menu.actorCountFilms"/></a></th>
        <th><a href="/view/deleteFilms.jsp"><fmt:message key="menu.deleteFilms"/></a></th>
        <th><a href="/view/authorization.jsp"><fmt:message key="menu.authorization"/></a></th>
        <th><a href="/Logout"><fmt:message key="menu.Logout"/></a></th>

    </tr>
    </table>
<p></p>
<p></p>
</body>




</html>
