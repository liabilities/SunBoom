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
        <jsp:include page="group_navigationbar.jsp"/>
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
