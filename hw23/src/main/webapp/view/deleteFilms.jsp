<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n.deleteFilmsPage" />

<html>
<head>
    <title><fmt:message key="deleteFilmsPage.title"/></title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<form method="post" action="/DeleteFilmToYear">
    <p><fmt:message key="deleteFilmsPage.enter_message"/></p>
    <input name="year" type="text" >
    <p><input type="submit" value="<fmt:message key="deleteFilmsPage.button_delete"/>"></p>
</form>

</body>
</html>

