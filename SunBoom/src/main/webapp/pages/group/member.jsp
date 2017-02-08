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
            <input type="submit" value="查询" name="username"/>
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


<script>
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
</script>

</body>
</html>
