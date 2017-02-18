<%--
  Created by IntelliJ IDEA.
  User: Joe
  Date: 2017/2/14
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="/js/editor/jquery.min.js"></script>
    <script type="text/javascript" src="/js/editor/module.js"></script>
    <script type="text/javascript" src="/js/editor/hotkeys.js"></script>
    <script type="text/javascript" src="/js/editor/uploader.js"></script>
    <script type="text/javascript" src="/js/editor/simditor.js"></script>
</head>
<body>
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
    <div>
        <textarea id="editor" placeholder="输入详细图文信息" autofocus></textarea>
    </div>
</div>
<div class="buttondiv">
    <input type="submit" value="重置" class="mybutton">
    <input type="reset" value="提交"class="mybutton" style="margin-left:30px;">
</div>
<div class="footpicture">
</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../js/bootstrap.min.js"></script>
</body>
</html>
