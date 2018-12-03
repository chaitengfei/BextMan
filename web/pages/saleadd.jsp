<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2018/11/26
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增销售记录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/dev/sale/saleadd" id="addSale" method="post">
    <input type="text" id="price" name="price" value="" />销售单节<br/>
    <input type="text" id="quantity" name="quantity" value="" />数量<br/>
    <input type="text" id="totalPrice" name="totalPrice" value="" />总价<br/>
    <input type="date" id="saleDate" name="saleDate" value="" />日期<br/>
    <input type="text" id="userId" name="userId" value="" />销售用户编号<br/>
    <input type="text" id="productId" name="productId" value="" />销售产品编号<br/>
    <input type="submit" value="创建"/>
</form>
</body>
</html>
