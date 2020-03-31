<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n.authorizationpage" />

<html>
<head>
    <title><fmt:message key="authorizationpage.title"/></title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<form method="post" action="/Authorization">
    <p><fmt:message key="authorizationpage.enter_message"/>  </p>
    <input name="username" type="text" >
    <input name="password" type="text" >
    <p><input type="submit" value="<fmt:message key="authorizationpage.button"/>"></p>
</form>
<c:if test="${not empty error}">
    <fmt:message key="authorizationpage.error"/>
</c:if>
</body>
</html>
