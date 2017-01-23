<%--
  Created by IntelliJ IDEA.
  User: I Like Milk
  Date: 2017/1/23
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <link href="../css/group_home.css" rel="stylesheet">
    <title>首页</title>
</head>
<body>
    <div id="avatar"></div>
    <div id="info"></div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../js/bootstrap.min.js"></script>

<script>
    var xmlhttp;
    function loadXMLDoc(url, cfunc) {
        delete xmlhttp;
        if (window.XMLHttpRequest) {
            // IE7+, Firefox, Chrome, Opera, Safari 代码
            xmlhttp = new XMLHttpRequest();
        }
        else {
            // IE6, IE5 代码
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.onreadystatechange = cfunc;
        xmlhttp.open("GET", url, true);
        xmlhttp.send();
    }
    //加载图片
    loadXMLDoc("/getAvatar", function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            document.getElementById("avatar").innerHTML = xmlhttp.responseText;
        }
    });
    //加载信息
    loadXMLDoc("/getGroup", function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            document.getElementById("info").innerHTML = xmlhttp.responseText;
        }
    });
</script>
</body>
</html>
