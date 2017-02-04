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
    <img src="../../img/1.png" width=100% height="100px">
</div>
</div>
<div class="container">
    <jsp:include page="group_navigationbar.jsp"/>
</div>
<div class="container">
    <div class="group">
        <div id="avatarArea" class="float">
            <a href="javascript:void(0);" title="更换头像" onclick="setAvatar()">
                <img id="avatar" alt="Pulpit rock" width="200" height="200">
            </a>
        </div>
        <div id="infoArea" class="float">
            <div id="info" class="float">
                <p class = items><span class="info-name">社团名称：</span><span id="name"></span></p>
                <p class = items><span class="info-name">个性签名：</span></span><span id="signature"></span></p>
                <p class = items><span class="info-name">成员数：</span></span><span id="memberNum"></span></p>
                <p class = items><span class="info-name">所属学校：</span></span><span id="school"></span></p>
                <p class = items><span class="info-name">标签：</span></span><span id="tag"></span></p>
            </div>
            <div id="editInfo" class="float" style="display: none;">
                <p class = items><span class="info-name">社团名称：</span><input type="text" id="nameBox"></p>
                <p class = items><span class="info-name">个性签名：</span><input type="text" id="signatureBox"></p>
                <p class = items><span class="info-name">成员数：</span><input type="text" id="memberNumBox"></p>
                <p class = items><span class="info-name">所属学校：</span><input type="text"  id="schoolBox"></p>
                <p class = items><span class="info-name">标签：</span><input type="text" id="tagBox"></p>
            </div>
            <div id="editButtonBox">
                <a href="javascript:void(0)" onclick="doSomething()" id="editButton">编辑资料</a>
            </div>
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
    updateInfo();
</script>
</body>
</html>
