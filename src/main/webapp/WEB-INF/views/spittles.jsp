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
    <title>spittles</title>
</head>
<body>
<c:forEach items="spittleList" var="spittle">
    <div>
        <c:out value="spittle.id"/>,
        <c:out value="spittle.message"/>,
        <c:out value="spittle.time"/>
    </div>
</c:forEach>

</body>
</html>
