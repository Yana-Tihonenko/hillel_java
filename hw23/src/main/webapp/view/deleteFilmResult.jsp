<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n.deleteFilmsPage" />
<html>
<head>
    <title><fmt:message key="deleteFilmsPage.title"/></title>
</head>
<body>
<jsp:include page="/util/header.jsp"/>
<c:if test="${not empty resultdeletesuccessful}">
   <fmt:message key="deleteFilmsPage.resultdelete_successful"/>
</c:if>
<c:if test="${not empty resultdeleteunsuccessful}">
<fmt:message key="deleteFilmsPage.resultdelete_unsuccessful"/>
</c:if>
</body>
</html>
