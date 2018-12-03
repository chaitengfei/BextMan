<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2018/11/26
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品库存</title>
</head>
<body>
查看现有商品库存：

<form method="post" action="${pageContext.request.contextPath}/dev/pro/update">
    <div class="sele">

        <select name="productName" >
            <option selected>-请选择-</option>
            <c:forEach var="pro" items="${list}">
                <option value="${pro.productName}" >${pro.productName}</option>
            </c:forEach>
        </select>
    </div>
    <div class="but"><input type="submit" value="查看库存数"></div>
</form>
</body>
</html>
