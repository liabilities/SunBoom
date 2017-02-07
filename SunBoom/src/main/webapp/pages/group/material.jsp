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
    <title>物资</title>
</head>
<body>

<div id = "nav">
    <jsp:include page="nav/navigationbar1.jsp" ></jsp:include>
</div>


<nav class="secondary-nav">
    <div class="wrapper">
        <ul class="categories-nav">
            <li id="material1" onclick="setTab('material',1,2)" class="current-menu-item"><a>我的物资</a></li>
            <li id="material2" onclick="setTab('material',2,2)"><a>物资求助</a></li>
        </ul>
    </div>
    <div class="main wrapper cf">
        <div id="con_material_1" class="hover">
            我的物资
        </div>

        <div id="con_material_2" style="display:none">
            物资求助
        </div>
    </div>
</nav>

<script src="/js/tab.js"></script> 

</body>
</html>
