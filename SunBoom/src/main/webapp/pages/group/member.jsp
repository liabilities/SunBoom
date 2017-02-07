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
    <title>成员</title>
</head>
<body>

<link href="/css/table1.css" rel="stylesheet" type="text/css" />
<style>
    .addmember
    {
        width:98%;
        margin:0 auto;
        text-align:center;
        border:3px dotted #a1a1a1;
        padding:10px 0px 10px 0px;
        background:#dddddd;
        border-radius:10px;
        -moz-border-radius:10px;
        cursor:pointer
    }

    .addmember:hover {
        color: #a1a1a1;
    }
</style>


<div id = "nav">
    <jsp:include page="nav/navigationbar1.jsp" ></jsp:include>
</div>

<div class="main wrapper cf" style="padding-top: 20px">
    <div class="addmember" onclick='showhidediv("invite")'>
        邀请新成员
    </div>
    <div id="invite" style="display:none;">
        生成邀请码
    <br />
        用户名搜索
    </div>
</div>

<div class="main wrapper cf">
    <table class="altrowstable" id="alternatecolor">
        <tr>
            <th>用户名</th>
            <th>昵称</th>
            <th>邮箱</th>
            <th>加入时间</th>
        </tr>
        <tr>
            <td>zoetxt</td>
            <td>小太阳</td>
            <td>zoetxt@outlook.com</td>
            <td>2015-09-20</td>
        </tr>
        <tr>
            <td>zhousaisai</td>
            <td>子非鱼</td>
            <td>zs14@smail.nju.edu.cn</td>
            <td>2015-09-20</td>
        </tr>
        <tr>
            <td>txin</td>
            <td>糖心</td>
            <td>txin15@smail.nju.edu.cn</td>
            <td>2016-09-20</td>
        </tr>
    </table>

</div>
<script src="/js/tablealtrow.js"></script> 
<script src="/js/divhide.js"></script> 

</body>
</html>
