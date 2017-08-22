<%--
  Created by IntelliJ IDEA.
  User: gtudan
  Date: 22.08.17
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/skeleton-css/2.0.4/css/normalize.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/skeleton-css/2.0.4/css/skeleton.css">
</head>
<body>
<h1>Bestätigung</h1>

<div>
    <span>ID:</span>
    <span>${user.id}</span>
</div>
<div>
    <span>User:</span>
    <span>${user}</span>
</div>
<div>
    <span>PLZ:</span>
    <span>${user.zip}</span>
</div>
<div>
    <span>Ort:</span>
    <span>${user.city}</span>
</div>


</body>
</html>
