<%--
  Created by IntelliJ IDEA.
  User: zoetx
  Date: 2017/2/4
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible">

    <title>NavStyle2</title>

    <link href="/try/css1.css" rel="stylesheet" type="text/css" />
    <link href="/try/css2.css" rel='stylesheet' type='text/css'/>
    <link href="/try/css3.css" rel='stylesheet' type='text/css'/>
    <link href="/try/css4.css" rel='stylesheet' type='text/css'/>

</head>


<body data-spy="scroll" data-offset="100" data-target="#navigation" class="">

<div id="flashes"></div>

<!-- Fixed navbar -->

<div id="navigation" class="navbar">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand cronitor-logo"><span class="glyphicon glyphicon-eye-open" style="vertical-align:top;"></span>SunBoom</a>
        </div>

        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="/pages/group/home.jsp">首页</a></li>
                <li><a href="/pages/group/fellow.jsp">联系人</a></li>
                <li><a href="/pages/group/activity.jsp">活动</a></li>
                <li><a href="/pages/group/dynamic.jsp">动态</a></li>
                <li><a href="/pages/group/file.jsp">文件</a></li>
                <li><a href="/pages/group/member.jsp">成员</a></li>
                <li><a href="/pages/group/material.jsp">物资</a></li>
                <li><a href="/pages/group/messageboard.jsp">留言板</a></li>
            </ul>

            <!-- Sign In / Sign Up -->
            <ul class="nav navbar-nav navbar-right">

                <li id="nav-signup">
                    <div>
                        <a href="/pages/index.jsp" type="button" class="btn btn-sm btn-primary btn-sign-up mll" style="margin:15px">Log out</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div><!-- /fixed-navbar -->




<div id="docs" class="container mbl pbl">
    <div class="row">
        <div class="col-sm-3 col-md-3 hidden-xs sidebar" id="aside">
            <ul class="nav nav-list">
                <li><h4 class="toc">活动</h4></li>
                <li class="active">活动策划</li>
                <li><a href="/pages/index.jsp">创建活动</a></li>
                <li><a href="/pages/index.jsp">尚未开始</a></li>
                <li><a href="/pages/index.jsp">正在进行</a></li>
                <li><a href="/pages/index.jsp">历史活动</a></li>
                <li><a href="/pages/index.jsp">活动广场</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-md-9" style="margin-bottom: 50px">
            这里是网站的主页部分
        </div>
    </div>
</div>

<!-- Footer Section -->

<footer id="footer" name="footer">
    <div class="footer-links">
        <div>
            <div class="text-center">
                <ul class="list-inline mvs">
                    <li>© 2017</li>
                    <li>SunBoom</li>
                </ul>
            </div>
        </div>
    </div> <!-- /container -->

</footer>

</body>
</html>
