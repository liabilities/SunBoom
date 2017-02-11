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
    <title>活动详情</title>

    <link rel="stylesheet" type="text/css" href="/css/editor/simditor.css" />
    <link rel="stylesheet" type="text/css" href="/css/create.css" />
    <link rel="stylesheet" type="text/css" href="/css/display.css" />

    <script type="text/javascript" src="/js/editor/jquery.min.js"></script>
    <script type="text/javascript" src="/js/editor/module.js"></script>
    <script type="text/javascript" src="/js/editor/hotkeys.js"></script>
    <script type="text/javascript" src="/js/editor/uploader.js"></script>
    <script type="text/javascript" src="/js/editor/simditor.js"></script>
</head>

<style>
    .current-menu-item{
        background: url("/img/inputbg.png") fixed center center no-repeat;
        background-size: cover;
        border-width: 0px;
        width:80px;
        height:30px;
        font-size: 17px;
        color: white;
        font-family:"微软雅黑 Light";
    }
    .current-menu-item:hover{
        color: gainsboro;
        cursor: pointer;
    }
</style>

<body>

<div id = "nav">
    <jsp:include page="/pages/group/nav/navhead.jsp" ></jsp:include>
</div>

    <div class="main wrapper cf">
        <div id="con_news_1" class="hover">
            <div class="main wrapper cf" style="height: 5px">
            </div>
            <div class="formtable2">
                <table class="tb2">
                    <tr>
                        <td class="white2" >
                            活动名称
                        </td>
                        <td class="tb2">
                            <input class="myinput2" type="text" value="大不了自己学" readOnly="true">
                        </td>
                    </tr>
                    <tr>
                        <td class="white2">
                            发起者
                        </td>
                        <td  class="tb2">
                            <input class="myinput2" type="text" value="南京大学软件学院新媒体中心采编部" readOnly="true">
                        </td>
                    </tr>
                    <tr>
                        <td class="white2">
                            发起者类型
                        </td>
                        <td class="tb2">
                            <input class="myinput2" type="text" value="注册团体" readOnly="true">
                        </td>
                    </tr>
                    <tr>
                        <td class="white2">
                            活动规模
                        </td>
                        <td class="tb2">
                            <input class="myinput2" type="text" value="30" readOnly="true" style="width: 60px">
                            <span style="color: #1f2020"> - </span>
                            <input class="myinput2" type="text" value="200" readOnly="true" style="width: 60px">
                            <span style="color: #1f2020"> 人</span>
                        </td>
                    </tr>
                    <tr>
                        <td class="white2">
                            活动类型
                        </td>
                        <td class="tb2">
                            <input class="myinput2" type="text" value="自学 编程" readOnly="true">
                        </td>
                    </tr>
                    <tr>
                        <td class="white2">
                            活动场地
                        </td>
                        <td class="tb2">
                            <input class="myinput2" type="text" value="线上" readOnly="true">
                        </td>
                    </tr>
                    <tr>
                        <td class="white2">
                            开始时间
                        </td>
                        <td class="tb2">
                            <input class="myinput2" type="text" value="2017年" readOnly="true" style="width: 100px">
                            <input class="myinput2" type="text" value="1月" readOnly="true" style="width: 80px">
                            <input class="myinput2" type="text" value="1日" readOnly="true" style="width: 80px">
                        </td>
                    </tr>
                    <tr>
                        <td class="white2">
                            结束时间
                        </td>
                        <td class="tb2">
                            <input class="myinput2" type="text" value="2017年" readOnly="true" style="width: 100px">
                            <input class="myinput2" type="text" value="2月" readOnly="true" style="width: 80px">
                            <input class="myinput2" type="text" value="12日" readOnly="true" style="width: 80px">
                        </td>
                    </tr>
                    <tr>
                        <td class="white2">
                            点赞数
                        </td>
                        <td class="tb2">
                            <input class="myinput2" type="text" value="50" readOnly="true" style="width: 60px">
                        </td>
                    </tr>
                    <tr>
                        <td class="white2">
                            关注数
                        </td>
                        <td class="tb2">
                            <input class="myinput2" type="text" value="23" readOnly="true" style="width: 60px">
                        </td>
                    </tr>
                    <tr>
                        <td class="white2">
                            详细图文信息
                        </td>
                        <td class="tb2"></td>
                    </tr>
                </table>
            </div>
            <div style="padding-right: 50px;padding-bottom: 20px;padding-left: 50px;background: #c9d6d4">
                <div style="background: white;padding: 10px">
                    <%@include file="/link/selfstudying.html"%>
                </div>
            </div>
            <div class="buttondiv2">
                <input type="submit" value="编辑" class="mybutton" id="news1" onclick="edit('news',2,2)" class="current-menu-item">
            </div>
            <div class="footpicture2">
            </div>
        </div>

        <div id="con_news_2" style="display:none">
            <div class="main wrapper cf" style="height: 5px">
            </div>
            <div class="formtable">
                <table class="tb">
                    <tr>
                        <td class="white" >
                            活动名称
                        </td>
                        <td class="tb">
                            <input id="text1" class="myinput" type="text" name="text1" onblur="check()">
                            <div id="div1" style="display:inline">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            发起者
                        </td>
                        <td  class="tb">
                            <input id="text2" class="myinput" type="text" name="text2" value="这里应该是发起者名称，不可编辑" readOnly="true">
                            <div id="div2" style="display:inline">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            发起者类型
                        </td>
                        <td class="tb">
                            <input type="radio" name="type" class="mychoose"/>注册团体
                            <input type="radio" name="type" class="mychoose"/>临时团体
                            <input type="radio" name="type" class="mychoose"/>个人
                            <div id="div3" style="display:inline">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            活动规模
                        </td>
                        <td class="tb">
                            <input id="text4" class="myinput-scale" type="text" name="text4" onblur="check()">
                            <span style="color: white"> - </span>
                            <input id="text5" class="myinput-scale" type="text" name="text4" onblur="check()">
                            <span style="color: white"> 人</span>
                            <div id="div4" style="display:inline">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            活动类型
                        </td>
                        <td class="tb">
                            <input type="checkbox" name="chkType" class="mychoose"/>晚会
                            <input type="checkbox" name="chkType" class="mychoose"/>体育
                            <input type="checkbox" name="chkType" class="mychoose"/>音乐
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            活动场地
                        </td>
                        <td class="tb">
                            <input type="radio" name="place" class="mychoose"/>室内
                            <input type="radio" name="place" class="mychoose"/>户外
                            <input type="radio" name="place" class="mychoose"/>线上
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            开始时间
                        </td>
                        <td class="tb">
                            <form name="reg_testdate">
                                <select id="selectYear" name="YYYY" onchange="YYYYDD(this.value)">
                                    <option value="">选择年</option>
                                </select>
                                <select id="selectMonth" name="MM" onchange="MMDD(this.value)">
                                    <option value="">选择月</option>
                                </select>
                                <select id="selectDay" name="DD">
                                    <option value="">选择日</option>
                                </select>
                            </form>
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            结束时间
                        </td>
                        <td class="tb">
                            <form name="reg_testdate2">
                                <select id="selectYear2" name="YYYY2" onchange="YYYYDD2(this.value)">
                                    <option value="">选择年</option>
                                </select>
                                <select id="selectMonth2" name="MM2" onchange="MMDD2(this.value)">
                                    <option value="">选择月</option>
                                </select>
                                <select id="selectDay2" name="DD2">
                                    <option value="">选择日</option>
                                </select>
                            </form>
                        </td>
                    </tr>
                    <tr>
                        <td class="white">
                            详细图文信息
                        </td>
                        <td class="tb"></td>
                    </tr>
                </table>
            </div>
            <div style="padding-right: 50px;padding-bottom: 20px;padding-left: 50px;background: #325d7f">
                <div style="background: white;padding: 10px">
                    <textarea id="editor" placeholder="输入详细图文信息" autofocus></textarea>
                </div>
            </div>
            <div class="buttondiv">
                <input type="submit" value="恢复" class="mybutton">
                <input type="submit" value="保存" class="mybutton" id="news2" onclick="edit('news',1,2) " >
            </div>
            <div class="footpicture">
            </div>
        </div>
    </div>


<script src="/js/selectdate.js"></script> 
<link href="/css/selectdate.css" rel="stylesheet" type="text/css" />
<script>
    var editor = new Simditor({
        textarea: $('#editor')
        //optional options
    });
</script>


<script>
    function check(){

    }
</script>

<script>
    function edit(name,cursel,n){
        for(i=1;i<=n;i++){
            var menu=document.getElementById(name+i);
            var con=document.getElementById("con_"+name+"_"+i);
            menu.className=i==cursel?"current-menu-item":"";
            con.style.display=i==cursel?"block":"none";}}
</script>

</body>
</html>
