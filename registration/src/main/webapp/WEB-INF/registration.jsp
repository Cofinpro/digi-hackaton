<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Deine Daten</h1>
<form name="userdata" action="confirmation" method="post">
    <div>
        <label for="name">Name</label>
        <input type="text" id="name" name="name"/>
    </div>
    <div>
        <label for="address1">Addresse</label>
        <input type="text" id="address1" name="address1"/>
    </div>
    <div>
        <label for="address2"></label>
        <input type="text" id="address2" name="address2"/>
    </div>
    <div>
        <span>
        <label for="zip">PLZ</label>
        <input type="number" maxlength="5" id="zip" name="zip"/>
            </span>
        <span>
        <label for="city">Stadt</label>
        <input type="text" id="city" name="city"/>
        </span>
    </div>
    <div>
        <button type="submit">Weiter</button>
    </div>
</form>
</body>
</html>
