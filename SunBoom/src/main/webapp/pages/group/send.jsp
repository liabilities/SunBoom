<%--
  Created by IntelliJ IDEA.
  User: Joe
  Date: 2017/2/7
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <title></title>
</head>
<body>
<form method="post" action="fellow/fellow_tx.jsp" accept-charset="utf-8">
    <input type="hidden" name="conversation" value="123">
    <input type="submit" name="send" value="click here">
</form>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../../js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../../js/bootstrap.min.js"></script>
</body>
</html>
