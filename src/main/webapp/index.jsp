<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/23/2021
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h2>Product</h2>
<form action="/convert" method="post">
    <label>Product Description:</label><br/>
    <input type="text" name="description" placeholder="description"><br/>
    <label>List Price:</label><br/>
    <input type="text" name="price" placeholder="price"><br/>
    <label>Discount Percent(%):</label><br/>
    <input type="text" name="discount" placeholder="discount"><br/>
    <input type="submit" id="submit" value="Calculate">
</form>
</body>
</html>
