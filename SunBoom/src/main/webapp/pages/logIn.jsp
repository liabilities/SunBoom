<%--
  Created by IntelliJ IDEA.
  User: cuihua
  Date: 2017/1/11
  Time: 下午10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log In</title>
</head>
<body>

<link rel="stylesheet" type="text/css" href="mystyle.css">

<div class=".leftArea">
    <h2>通知公告</h2>
    <h2>友情提示</h2>
</div>

<div style="margin-left: 50%;">
    <h1>网络接入认证系统</h1>

    <h2>Real-Name Authentication System</h2>
<form action="/log">
    <div class="inputLine">
        <strong>登录</strong>
        <input type="text" name="logIn" placeholder="请输入用户名">
    </div>

    <br>
    <br>

    <div class="inputLine">
        <strong>密码</strong>
        <input type="password" name="password" placeholder="请输入密码">
    </div>

    <br>
    <br>

    <div>
        <input type="submit" value="登录">
    </div>
</form>
</div>


</body>
</html>
