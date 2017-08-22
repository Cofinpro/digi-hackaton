<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Deine Daten</h1>
<form name="userdata" action="confirmation">
    <div>
        <label for="name">Name</label>
        <input type="text" id="name">
    </div>
    <div>
        <label for="address1">Addresse</label>
        <input type="text" id="address1"/>
    </div>
    <div>
        <label for="address2"></label>
        <input type="text" id="address2">
    </div>
    <div>
        <span>
        <label for="zip"></label>
        <input type="number" maxlength="5" id="zip">
            </span>
        <span>
        <label for="city"></label>
        <input type="text" id="city">
        </span>
    </div>
</form>
</body>
</html>
