<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<body onload="getMember()">

<link href="/css/table1.css" rel="stylesheet" type="text/css" />
<%--<link href="/css/searchbox.css" rel="stylesheet" type="text/css" />--%>
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
        -moz-user-select:none;/*火狐*/
        -webkit-user-select:none;/*webkit浏览器*/
        -ms-user-select:none;/*IE10*/
        -khtml-user-select:none;/*早期浏览器*/
        user-select:none;
    }


    #mask{
        position: absolute;
        top: 0px;
        opacity:0.5;
        filter: alpha(opacity=50);
        background-color: white;
        z-index: 2;
        left: 0px;
        display: none;
    }


    #searchforuser{
        z-index: 4;
        background-image: url(/img/search.png);
        color:white;
        display: none;
        width:300px;
        height:400px;
        margin:0 auto;
        position:absolute;
        top:200px;
        left:550px;
        font-family:"Century Gothic","微软雅黑 Light";
    }

    #codepanel{
        z-index: 4;
        background-image: url(/img/code.png);
        color:white;
        display: none;
        width:200px;
        height:130px;
        margin:0 auto;
        position:absolute;
        top:245px;
        left:600px;
        font-family:"Century Gothic","微软雅黑 Light";
    }



    #codepanel .right:hover{
        background-image: url(/img/code2.png);
    }

    .right
    {
        z-index: 3;
        position:absolute;
        right:0px;
        background-image: url(/img/code1.png);
        text-align: center;
    }

    .buttons
    {
        -moz-user-select:none;/*火狐*/
        -webkit-user-select:none;/*webkit浏览器*/
        -ms-user-select:none;/*IE10*/
        -khtml-user-select:none;/*早期浏览器*/
        user-select:none;
        color:white;
        font-size: 14px;
    }

    .buttons:hover
    {
        color:lightslategray;
    }

    .left
    {
        position:absolute;
        top:3px;
        left:20px;
        width:300px;
        color: #325d7f;
    }
    .left>p>text
    {
        -moz-border-radius:10px;
        -moz-user-select:none;/*火狐*/
        -webkit-user-select:none;/*webkit浏览器*/
        -ms-user-select:none;/*IE10*/
        -khtml-user-select:none;/*早期浏览器*/
        user-select:none;
    }

    .invite{
        position:relative;
        top:0px;
        right:300px;
        width:300px;
        cursor:pointer;
        -moz-border-radius:10px;
        -moz-user-select:none;/*火狐*/
        -webkit-user-select:none;/*webkit浏览器*/
        -ms-user-select:none;/*IE10*/
        -khtml-user-select:none;/*早期浏览器*/
        user-select:none;
    }

    .code{
        position:relative;
        top:0px;
        left:300px;
        width:300px;
        cursor:pointer;
        -moz-border-radius:10px;
        -moz-user-select:none;/*火狐*/
        -webkit-user-select:none;/*webkit浏览器*/
        -ms-user-select:none;/*IE10*/
        -khtml-user-select:none;/*早期浏览器*/
        user-select:none;
    }

    .invite:hover{
        color: #a1a1a1;
    }

    .code:hover{
        color: #a1a1a1;
    }

    .username-to-select{
        color:midnightblue;
        text-decoration: underline;
        cursor: pointer;
    }

    .username-to-select:hover{
        color:mediumslateblue;
    }

</style>


<div id = "nav">
    <jsp:include page="nav/navigationbar1.jsp" ></jsp:include>
</div>

<div id="mask">
</div>

<div class="main wrapper cf" style="padding-top: 20px">
    <div class="addmember" id="generate" style="display:block" onmouseenter='showhidediv2("generate")'>
        添加新成员
    </div>
    <div class="addmember" id="code" style="display:none" onmouseleave='showhidediv2("code")'>
        <a class="code" onClick="generating()">生成邀请码</a>
        <a class="invite" onClick="searching()">用户名搜索</a>
    </div>
</div>

<div id="codepanel">
    <div class="right" style="width: 80px;height: 66px" onclick="Lock_CheckForm(this);">
    </div>
    <div class="left">
        <p><text style="font-size:12px">2分钟之内有效</text></p>
        <p>33wi8y98</p>
    </div>
</div>

<div id="searchforuser">
    <div align="center">
        <div style="height: 117px">
            <br/>
            <br/>
            <input type="text" />
            <input type="submit" value="查询" name="username" />
        </div>
        <div style="height: 117px">
            <img src="/img/1.png" style="width: 117px;height: 117px">
        </div>
        <div style="height: 60px">
            <br/>
            <a class="buttons">-邀请-</a>
            <br/>
            <a class="buttons" onclick="Lock_CheckForm2(this)">-返回-</a>
        </div>
    </div>
</div>

<div class="main wrapper cf">
    <div id="list">
    </div>

</div>
<script src="/js/tablealtrow.js"></script> 
<script src="/js/divhide.js"></script> 
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../../js/jquery.js"></script>

<script type="text/javascript">
    window.onload=getMember()
    function generating(){
        document.all.mask.style.display="block";
        document.all.mask.style.width=document.body.clientWidth;
        document.all.mask.style.height=document.body.clientHeight;
        document.all.codepanel.style.display='block';
    }
    function Lock_CheckForm(theForm){
        document.all.mask.style.display='none';document.all.codepanel.style.display='none';
    }

    function searching(){
        document.all.mask.style.display="block";
        document.all.mask.style.width=document.body.clientWidth;
        document.all.mask.style.height=document.body.clientHeight;
        document.all.searchforuser.style.display='block';
    }
    function Lock_CheckForm2(theForm){
        document.all.mask.style.display='none';document.all.searchforuser.style.display='none';
    }

    function getMember() {
        $.ajax(
            {
                type:"post",
                url:"/getMembers",
                data:{id:1},
                dataType:"json",
                success:function (memberList) {
                    var member=memberList.member;

                    str="<table class=\"altrowstable\">";
                    str+=" <tr><th>用户名</th><th>昵称</th><th>邮箱</th><th>加入时间</th></tr>";
                    for(i in member){
                        if(i%2==0)
                            str+="<tr style=\"background-color:#d4e3e5\"><td class=\"username-to-select\">"+member[i].userName+"</td><td>"+member[i].nickName+"</td><td>"+member[i].email+"</td><td>"+member[i].time+"</td></tr>";
                        else
                            str+="<tr style=\"background-color:#c3dde0\"><td class=\"username-to-select\">"+member[i].userName+"</td><td>"+member[i].nickName+"</td><td>"+member[i].email+"</td><td>"+member[i].time+"</td></tr>";
                    }
                    str+="</table>"
                    $("#list").html(str);

                },
                error:function () {
                    alert("error");
                }
            }
        )
    }

    function findMember() {
        $.ajax({
            type:"post",
            url:"/findMember",
            data:{userName:"hehe"},
            success:function (data) {
                alert(data);
            },
            error:function () {
                alert("error");
            }
        })
    }

    function getCode() {
        $.ajax({
            type:"get",
            url:"/findCode",
            data:{id:1},
            success:function (data) {
                alert(data);
            },
            error:function () {
                alert("error");
            }
        })
    }
</script>

</body>
</html>
