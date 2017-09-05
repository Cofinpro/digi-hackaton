<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/skeleton.css">
</head>
<body>
<div class="container">
    <h1>Deine Daten</h1>
    <form method="post">
        <label for="name">Name</label>
        <input class="u-full-width" type="text" id="name" name="name" value="${user.name}"/>

        <label for="address1">Addresse</label>
        <input class="u-full-width" type="text" id="address1" name="address1" value="${user.address1}"/>

        <label for="address2">Zweite Addresszeile</label>
        <input class="u-full-width" type="text" id="address2" name="address2" value="${user.address2}"/>
        <div class="row">
            <div class="four columns">
                <label for="zip">PLZ</label>
                <input class="u-full-width" type="number" maxlength="5" id="zip" name="zip" value="${user.zip}"/>
            </div>
            <div class="eight columns">
                <label for="city">Stadt</label>
                <input class="u-full-width"  type="text" id="city" name="city" value="${user.city}"/>
            </div>
        </div>

        <button class="button-primary" type="submit">Weiter</button>

    </form>
</div>
</body>
</html>
