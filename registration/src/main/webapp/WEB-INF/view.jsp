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
    <title>View User</title>
</head>
<body>
<h1>User ansehen</h1>

<div>
    <span>ID:</span>
    <span>${user.id}</span>
</div>
<div>
    <span>User:</span>
    <span>${user.name}</span>
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
