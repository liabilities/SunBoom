<%--
  Created by IntelliJ IDEA.
  User: Joe
  Date: 2017/1/15
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../css/groupIndex.css" rel="stylesheet">
    <link href="../../css/stoled.css" rel="stylesheet">
    <script language="JavaScript" src="../../js/try.js"></script>
    <script type='text/javascript' src="http://static.iask.cn/v20161228/js/common/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="http://static.iask.cn/v20161228/js/new/common.min.js"></script>

    <link href="../../css/group_home.css" rel="stylesheet">
    <title>团体首页</title>
</head>

<body>
<div class="container">
<div id="head">
    <img src="../../img/头像冬.png" width=100% height="100px">
</div>
</div>
<div class="container">
    <jsp:include page="group_navigationbar.jsp"/>
</div>
<div class="container">
    <div class="group">
        <div id="avatarArea">
            <a href="javascript:void(0);" title="更换头像" onclick="setAvatar()">
                <img id="avatar" alt="Pulpit rock" width="200" height="200">
            </a>
        </div>
        <div id="infoArea">
            <p class = items><span class="info-name">社团名称：</span><span id="name"></span></p>
            <p class = items><span class="info-name">个性签名：</span></span><span id="signature"></span></p>
            <p class = items><span class="info-name">成员数：</span></span><span id="memberNum"></span></p>
            <p class = items><span class="info-name">所属学校：</span></span><span id="school"></span></p>
            <p class = items><span class="info-name">标签：</span></span><span id="tag"></span></p>
        </div>
    </div>
</div>

<%--<script>--%>
    <%--function change() {--%>
        <%--x.document.getElementById("show");--%>
        <%--x.innerHTML= <jsp:include page="groupNavigationBarTop.jsp"></jsp:include>--%>
    <%--}--%>
<%--</script>--%>
<div id="foot_div">
    <p>版权所有@南京大学软件学院</p>
</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../../js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../../js/bootstrap.min.js"></script>
<script src="../../js/group_home.js"></script>
<script>
    var xmlhttp;
    if (window.XMLHttpRequest) {
        //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
        xmlhttp = new XMLHttpRequest();
    } else {
        // IE6, IE5 浏览器执行代码
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function() {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            $(function () {
                var info = xmlhttp.responseXML.getElementsByTagName("GROUP")[0];
                $("#name").text(info.getElementsByTagName("NAME")[0].childNodes[0].nodeValue);
                $("#signature").text(info.getElementsByTagName("SIGNATURE")[0].childNodes[0].nodeValue);
                $("#memberNum").text(info.getElementsByTagName("MEMBERNUM")[0].childNodes[0].nodeValue);
                $("#tag").text(info.getElementsByTagName("TAG")[0].childNodes[0].nodeValue);
                $("#avatar").attr("src", info.getElementsByTagName("AVATAR")[0].childNodes[0].nodeValue);
            })
        }
    }
    xmlhttp.open("GET", "/getGroupInfo?id=1", true);
    xmlhttp.send();
</script>
</body>
</html>
