<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Actors to Film </title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<form method="post" action="/ActorToFilm">
    <p> Enter id film </p>
   <input name="actorToFilm" type="text" >
    <p><input type="submit" value="Find"></p>
</form>
</body>
</html>
