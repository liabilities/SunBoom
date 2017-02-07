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
    <title>文件</title>
</head>
<body>

<div id = "nav">
    <jsp:include page="nav/navigationbar1.jsp" ></jsp:include>
</div>
<nav class="secondary-nav">
    <div class="wrapper">
        <ul class="categories-nav">
            <li id="file1" onclick="setTab('file',1,2)" class="current-menu-item"><a>我的上传</a></li>
            <li id="file2" onclick="setTab('file',2,2)"><a>我的分享</a></li>
        </ul>
    </div>
    <div class="main wrapper cf">
        <div id="con_file_1" class="hover">
            这里是我的文件的内容
        </div>

        <div id="con_file_2" style="display:none">
            这里是我的分享的内容
        </div>
    </div>
</nav>

<script src="/js/tab.js"></script> 

</body>
</html>
