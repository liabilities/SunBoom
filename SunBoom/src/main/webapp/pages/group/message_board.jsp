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
    <link href="../css/groupNavigationBarTop.css.css" rel="stylesheet">
    <script language="JavaScript" src="../../js/try.js"></script>
    <title>团体首页</title>
</head>
<div class="container">
<div id="head">
    <img src="../../img/1.png" width="1100px" height="100px">
</div>
</div>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-9 column">
            <div id="top_div">
                <ul class="nav nav-pills">
                    <li>
                        <a href="http://localhost:8080/pages/group/activity_home.jsp">首页</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/pages/group/activity.jsp">活动</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/pages/group/member.jsp">成员</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/pages/group/material.jsp">物资</a>
                    </li>
                    <li class="active">
                        <a href="http://localhost:8080/pages/group/message_board.jsp">留言板</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/pages/group/file.jsp">文件</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-md-3 column" id="top_div_side">
            <ul class="nav nav-pills">
                <li><a href="http://localhost:8080/pages/group/fellow.jsp">联系人</a></li>
                <li><a href="http://localhost:8080/pages/group/dynamics.jsp">信息发布</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-2" id="side">
                <div class="row">
                    <ul class="nav nav-stacked nav-pills" style="margin-top: 20px" >
                        <li class="active">
                            <a href="#">创建活动</a>
                        </li>
                        <li>
                            <a href="#">正在进行</a>
                        </li>
                        <li>
                            <a href="#">历史活动</a>
                        </li>
                    </ul>
                </div>
        </div>
        <div class="col-md-10" name="showDiv" id="show">
            <p>
                这是留言板界面
            </p>
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

<body>


<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../../js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../../js/bootstrap.min.js"></script>
</body>
</html>
