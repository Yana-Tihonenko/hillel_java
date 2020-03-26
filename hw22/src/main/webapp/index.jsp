<%--suppress XmlPathReference --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Webapp</title>
</head>
<body>
<jsp:include page="util/header.jsp"/>
<c:if test="${not empty message}">
    ${message}
</c:if>
</body>
</html>
