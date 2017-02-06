<%--
  Created by IntelliJ IDEA.
  User: zoetx
  Date: 2017/2/4
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html>
<head>
    <meta charset="utf-8">

    <title>NavStyle1</title>
    <link href="/css/nav.css" rel="stylesheet" type="text/css" />
</head>

<body>
<header>
    <nav class="global-nav">
        <div class="wrapper">
            <ul>
                <li class="header-logo"><a href="/"><img src="/img/sunboom.png"></a></li>

                <li><a href="/pages/style2.jsp">另一种样式</a></li>
                <li><a href="/pages/group/home.jsp">首页</a></li>
                <li><a href="/pages/group/fellow.jsp">联系人</a></li>
                <li><a href="/pages/group/activity.jsp">活动</a></li>
                <li><a href="/pages/group/dynamic.jsp">动态</a></li>
                <li><a href="/pages/group/file.jsp">文件</a></li>
                <li><a href="/pages/group/member.jsp">成员</a></li>
                <li><a href="/pages/group/material.jsp">物资</a></li>
                <li><a href="/pages/group/message_board.jsp">留言板</a></li>
                <li><a href="/login">| 注销 |</a></li>
            </ul>
        </div>
    </nav>
</header>

<nav class="secondary-nav">
    <div class="wrapper">
        <ul class="categories-nav">
            <li class="current-menu-item"><a href="https://litmus.com/blog/category/webinars">活动策划</a></li>
            <li><a href="/pages/index.jsp">创建活动</a></li>
            <li><a href="/pages/index.jsp">尚未开始</a></li>
            <li><a href="/pages/index.jsp">正在进行</a></li>
            <li><a href="/pages/index.jsp">历史活动</a></li>
            <li><a href="/pages/index.jsp">活动广场</a></li>
        </ul>
    </div>
</nav>

<div class="main wrapper cf">
    这是网站的主体部分
</div>
</body>
</html>

