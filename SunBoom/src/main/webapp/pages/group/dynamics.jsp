<%--
  Created by IntelliJ IDEA.
  User: zoetx
  Date: 2017/2/7
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>动态</title>
</head>
<body>

<div id = "nav">
    <jsp:include page="nav/navigationbar1.jsp" ></jsp:include>
</div>

<nav class="secondary-nav">
    <div class="wrapper">
        <ul class="categories-nav">
            <li id="dynamics1" onclick="setTab('dynamics',1,2)" class="current-menu-item"><a>我的动态</a></li>
            <li id="dynamics2" onclick="setTab('dynamics',2,2)"><a>好友动态</a></li>
        </ul>
    </div>
    <div class="main wrapper cf">
        <div id="con_dynamics_1" class="hover">
            我的动态
        </div>

        <div id="con_dynamics_2" style="display:none">
            好友动态
        </div>
    </div>
</nav>

<script src="/js/tab.js"></script> 
</body>
</html>
