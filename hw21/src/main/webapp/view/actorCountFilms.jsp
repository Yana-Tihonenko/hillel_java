<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Actors for   films</title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<form method="post" action="/ActorToCountFilm">
    <p> Enter count of film </p>
    <input name="countFilms" type="text" >
    <p><input type="submit" value="Find"></p>
</form>
</body>
</html>
