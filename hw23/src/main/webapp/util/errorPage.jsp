<%@ page contentType="text/html;charset=UTF-8" language="java"  isErrorPage="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n.errorPage" />
<!DOCTYPE html>
<html>
<head>
    <title><fmt:message key="errorPage.title"/></title>
</head>
<body>
<p>Type: <%= exception%></p>

</body>
</html>