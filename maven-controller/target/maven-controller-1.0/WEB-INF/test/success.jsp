<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus-bjy
  Date: 2017/11/28
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
the success page!!
<hr>
<c:forEach var="item" items="${users}" >
    ${item.username}----${item.userpwd}<br>
</c:forEach>
<hr>
hello every one ~~
</body>
</html>
