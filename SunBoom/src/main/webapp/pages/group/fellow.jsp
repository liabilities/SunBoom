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
<body onload="getContacts()">

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
            <%--<button onclick="getContacts()"> 3545</button>--%>
            <div class="list-group" id="list">
                <li class="list-group-item active">
                    <h4>A</h4>
                </li>
                <div class="list-group" id="a"></div>
                <li class="list-group-item active">
                    <h4>B</h4>
                </li>
                <div class="list-group" id="b"></div>
                <li class="list-group-item active">
                    <h4>C</h4>
                </li>
                <div class="list-group" id="c"></div>
                <li class="list-group-item active">
                    <h4>D</h4>
                </li>
                <div class="list-group" id="d"></div>
                <li class="list-group-item active">
                    <h4>E</h4>
                </li>
                <div class="list-group" id="e"></div>
                <li class="list-group-item active">
                    <h4>F</h4>
                </li>
                <div class="list-group" id="f"></div>
                <li class="list-group-item active">
                    <h4>G</h4>
                </li>
                <div class="list-group" id="g"></div>
                <li class="list-group-item active">
                    <h4>H</h4>
                </li>
                <div class="list-group" id="h"></div>
                <li class="list-group-item active">
                    <h4>I</h4>
                </li>
                <div class="list-group" id="i"></div>
                <li class="list-group-item active">
                    <h4>J</h4>
                </li>
                <div class="list-group" id="j"></div>
                <li class="list-group-item active">
                    <h4>K</h4>
                </li>
                <div class="list-group" id="k"></div>
                <li class="list-group-item active">
                    <h4>L</h4>
                </li>
                <div class="list-group" id="l"></div>
                <li class="list-group-item active">
                    <h4>M</h4>
                </li>
                <div class="list-group" id="m"></div>
                <li class="list-group-item active">
                    <h4 >N</h4>
                </li>
                <div class="list-group" id="n"></div>
                <li class="list-group-item active">
                    <h4>O</h4>
                </li>
                <div class="list-group" id="o"></div>
                <li class="list-group-item active">
                    <h4>P</h4>
                </li>
                <div class="list-group" id="p"></div>
                <li class="list-group-item active">
                    <h4>Q</h4>
                </li>
                <div class="list-group" id="q"></div>
                <li class="list-group-item active">
                    <h4>R</h4>
                </li>
                <div class="list-group" id="r"></div>
                <li class="list-group-item active">
                    <h4>S</h4>
                </li>
                <div class="list-group" id="s"></div>
                <li class="list-group-item active">
                    <h4>T</h4>
                </li>
                <div class="list-group" id="t"></div>
                <li class="list-group-item active">
                    <h4>U</h4>
                </li>
                <div class="list-group" id="u"></div>
                <li class="list-group-item active">
                    <h4>V</h4>
                </li>
                <div class="list-group" id="v"></div>
                <li class="list-group-item active">
                    <h4>W</h4>
                </li>
                <div class="list-group" id="w"></div>
                <li class="list-group-item active">
                    <h4>X</h4>
                </li>
                <div class="list-group" id="x"></div>
                <li class="list-group-item active">
                    <h4>Y</h4>
                </li>
                <div class="list-group" id="y"></div>
                <li class="list-group-item active">
                    <h4>Z</h4>
                </li>
                <div class="list-group" id="z"></div>
                <li class="list-group-item active">
                    <h4>#</h4>
                </li>
                <div class="list-group" id="0"></div>
            </div>
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
//                    var list=data.contactList;
//                    for(var i=0;i<list.length;i++){
//                        $("#list").append('<li class="list-group-item">'+list[i]+'</li>')
//                    }
                    var names=data.nickname;
                    var groupids=data.groupId;
                    var avatars=data.avatar;
                    var capitals=data.capital;
                    for(var i=0;i<names.length;i++){
                        $("#"+capitals[i]).append('<a href="#" class="list-group-item">' +
                            '<img width="30" height="30" src="../../img/1.png " class="img-circle">'+'+names[i]'+'</a>')
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
