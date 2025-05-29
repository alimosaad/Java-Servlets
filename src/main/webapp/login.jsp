<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>LoginPage</title>
</head>
<body>
<form action="SimpleReqDispatcher" method="post">
    Name: <input type="text" name="UserName"/><br/>
    Password:<input type="password" name="Password"/>
    <input type="submit" value="Login"/>
</form>
</body>
</html>