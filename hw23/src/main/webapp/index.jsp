<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n.authorizationpage" />

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Webapp</title>
</head>
<body>
<jsp:include page="util/header.jsp"/>
<c:if test="${not empty errorpermission}">
    <fmt:message key="authorizationpage.error_permission"/>
</c:if>
<c:if test="${not empty message}">
    <fmt:message key="authorizationpage.successfully"/>
</c:if>
<c:if test="${not empty messagelogout}">
    <fmt:message key="authorizationpage.messagelogout"/>
</c:if>
</body>
</html>
