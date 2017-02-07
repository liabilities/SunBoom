<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Joe
  Date: 2017/2/6
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../css/nav.css" rel="stylesheet" type="text/css" />
    <link href="../../css/fellow.css" rel="stylesheet" type="text/css"/>
    <title>联系人</title>
</head>
<body>

<div>
    <jsp:include page="nav/navigationbar1.jsp" ></jsp:include>
</div>

<div class="main wrapper cf" id="contact_main">
    <div id="head1">
        <head>
            我的联系人
        </head>
    </div>
    <div class="container">

        <div id="left" style="height: 500px;overflow: auto">
            <button onclick="getContacts()"> 3545</button>
            <ul class="list-group" id="list"></ul>
        </div>
        <div id="right">
            这是右边
        </div>
    </div>
</div>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../../js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../../js/bootstrap.min.js"></script>
<script type="text/javascript">
    function getContacts() {
        $.ajax(
            {
                type:"post",
                url:"/getContacts",
                data:{id:1},
//                dataType:"json",
                success:function (data) {
                    var list=data.contactList;
                    for(var i=0;i<list.length;i++){
                        $("#list").append('<li class="list-group-item">'+list[i]+'</li>')
                    }
                },
                error: function(XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                }
            }
        )
    }
</script>
</body>
</html>
