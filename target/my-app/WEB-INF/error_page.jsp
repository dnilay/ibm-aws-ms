<%--
  Created by IntelliJ IDEA.
  User: nilay
  Date: 08/09/20
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>error page</title>
</head>
<body>
<h5><font color="red">please correct the bellow error(s)</font></h5>
<c:forEach var="err" items="${ERROR}">
    <ul>
        <li>
            <font color="red">${err}</font>
        </li>
    </ul>
</c:forEach>
<a href="add_league.jsp"> try once more </a>
</body>
</html>
