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
    <title>活动</title>
</head>

<body>

<div>
    <jsp:include page="nav/navigationbar1.jsp" ></jsp:include>
</div>

<style>
    .formtable{
        background: #325d7f;
        padding-top: 20px;
        padding-bottom: 20px;
        padding-left: 50px;
        color: white;
        font-family:"微软雅黑 Light";
    }
    .white{
        color: white;
        font-family:"微软雅黑 Light";
        font-size: 18px;
    }

    .footpicture{
        background: url(/img/foot.png);
        width:100%;
        height: 73px;
    }

    .myinput{
        background: url("/img/inputbg.png") fixed center center no-repeat;
        background-size: cover;
        border-width: 0px;
        width:600px;
        height:30px;
        font-size: 17px;
        color: white;
        font-family:"微软雅黑 Light";
    }

    table,th,td
    {
        border:10px solid #325d7f;
    }

</style>

<script>
    function check(){

    }
</script>

<nav class="secondary-nav">
    <div class="wrapper">
        <ul class="categories-nav">
            <li id="activity1" onclick="setTab('activity',1,5)" class="current-menu-item"><a>创建活动</a></li>
            <li id="activity2" onclick="setTab('activity',2,5)"><a>尚未开始</a></li>
            <li id="activity3" onclick="setTab('activity',3,5)"><a>正在进行</a></li>
            <li id="activity4" onclick="setTab('activity',4,5)"><a>历史活动</a></li>
            <li id="activity5" onclick="setTab('activity',5,5)"><a>活动广场</a></li>
        </ul>
    </div>
    <div class="main wrapper cf">
        <div id="con_activity_1" class="hover">
            <div class="main wrapper cf" style="height: 5px">
            </div>
            <div class="formtable">
                <table>
                    <tr>
                        <td class="white">
                            活动名称
                        </td>
                        <td>
                            <input id="text1" class="myinput" type="text" name="text1" onblur="check()">
                            <div id="div1" style="display:inline">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            活动简介
                        </td>
                        <td>
                            <input id="text2" class="myinput" type="password" name="text2" onblur="check()">
                            <div id="div2" style="display:inline">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            活动规模
                        </td>
                        <td>
                            <input id="text3" class="myinput" type="password" name="text3" onblur="check()">
                            <div id="div3" style="display:inline">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            活动场地
                        </td>
                        <td>
                            <input id="text4" class="myinput" type="text" name="text4" onblur="check()">
                            <div id="div4" style="display:inline">
                            </div>
                        </td>
                    </tr>
                    <tr align="center">
                        <td align="center">
                            <input type="submit" value="提交" name="text5"><input type="reset" value="重置" name="text7">
                        </td>
                    </tr>
                </table>
            </div>
            <div class="footpicture">

            </div>
        </div>

        <div id="con_activity_2" style="display:none">
            尚未开始
        </div>

        <div id="con_activity_3" style="display:none">
            正在进行
        </div>

        <div id="con_activity_4" style="display:none">
            历史活动
        </div>

        <div id="con_activity_5" style="display:none">
            活动广场
        </div>
    </div>
</nav>


<script src="/js/tab.js"></script> 
</body>
</html>
