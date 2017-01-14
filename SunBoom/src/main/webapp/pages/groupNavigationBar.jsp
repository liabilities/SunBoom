<%--
  Created by IntelliJ IDEA.
  User: Joe
  Date: 2017/1/13
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/groupNavigationBar.css" rel="stylesheet">
    <title>navigationBar</title>
</head>
<body>
<div class="container" id="menu1">
    <div class="row clearfix" id="menu">
        <div class="col-md-12 column">
            <ul class="nav nav-pills">
                <li class="active" class="new1">
                    <a href="#">首页</a>
                </li>
                <li class="new1">
                    <a href="http://localhost:8080/pages/welcome.jsp">活动</a>
                </li>
                <li class="new1">
                    <a href="#">成员</a>
                </li>
                <li class="new1">
                    <a href="#">物资</a>
                </li>
                <li class="new1">
                    <a href="#">留言板</a>
                </li>
                <li class="new1">
                    <a href="#">文件</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="span2"
            <ul class="nav nav-stacked nav-pills" style="margin-top: 20px" >
                <li class="active" class="new1">
                    <a href="#">创建活动</a>
                </li>
                <li class="new1">
                    <a href="#">正在进行</a>
                </li>
                <li class="new1">
                    <a href="#">历史活动</a>
                </li>
            </ul>
        </div>
    </div>

    <div class="col-md-11 column" id="div1">
        <p class="lead">
            <em>Git</em>
        </p>
    </div>
</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../js/bootstrap.min.js"></script>
</body>
</html>
