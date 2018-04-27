<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/27/2018
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customers</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <style>
        img{
            width: 100px;
            height: 100px;
        }
    </style>
</head>
<body>
<table border="1">
    <tbody>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Date</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    <c:forEach items="${requestScope.customerList}" var="customer">
        <tr>
            <td><c:out value="${customer.id}"></c:out></td>
            <td><c:out value="${customer.name}"></c:out></td>
            <td><c:out value="${customer.date}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>
            <td><img src="images/<c:out value="${customer.image}"></c:out>"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
