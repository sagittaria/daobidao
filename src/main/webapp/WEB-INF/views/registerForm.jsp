<%--
  Created by IntelliJ IDEA.
  User: sean
  Date: 04/02/2018
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>register form</title>
</head>
<body>

<form method="POST">
    First Name: <input type="text" name="firstName"/><br/>
    Last Name: <input type="text" name="lastName"/><br/>
    Username: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
                <input type="submit" value="Register"/>
</form>

</body>
</html>
