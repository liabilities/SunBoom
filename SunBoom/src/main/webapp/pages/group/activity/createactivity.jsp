<%--
  Created by IntelliJ IDEA.
  User: zoetx
  Date: 2017/2/11
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" type="text/css" href="/css/editor/simditor.css" />
<link rel="stylesheet" type="text/css" href="/css/create.css" />

<script type="text/javascript" src="/js/editor/jquery.min.js"></script>
<script type="text/javascript" src="/js/editor/module.js"></script>
<script type="text/javascript" src="/js/editor/hotkeys.js"></script>
<script type="text/javascript" src="/js/editor/uploader.js"></script>
<script type="text/javascript" src="/js/editor/simditor.js"></script>

<div class="main wrapper cf" style="height: 5px">
</div>

<form>
<div class="formtable">
    <table class="tb">
        <tr>
            <td class="white" >
                活动名称
            </td>
            <td class="tb">
                <input id="text1" class="myinput" type="text" name="name" onblur="check()">
                <div id="div1" style="display:inline">
                </div>
            </td>
        </tr>
        <tr>
            <td class="white">
                发起者
            </td>
            <td  class="tb">
                <input id="text2" class="myinput" type="text" name="initiator" value="这里应该是发起者名称，不可编辑" readOnly="true">
                <div id="div2" style="display:inline">
                </div>
            </td>
        </tr>
        <tr>
            <td class="white">
                发起者类型
            </td>
            <td class="tb">
                <input type="radio" name="initiatorType" value="0" class="mychoose"/>注册团体
                <input type="radio" name="initiatorType" value="1" class="mychoose"/>临时团体
                <input type="radio" name="initiatorType" value="2" class="mychoose"/>个人
                <div id="div3" style="display:inline">
                </div>
            </td>
        </tr>
        <tr>
            <td class="white">
                活动规模
            </td>
            <td class="tb">
                <input id="text4" class="myinput-scale" type="number" name="scale[]" onblur="check()">
                <span style="color: white"> - </span>
                <input id="text5" class="myinput-scale" type="number" name="scale[]" onblur="check()">
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
                <input type="checkbox" name="activityType[]" value="0" class="mychoose"/>志愿
                <input type="checkbox" name="activityType[]" value="1" class="mychoose"/>音乐
                <input type="checkbox" name="activityType[]" value="2" class="mychoose"/>体育
            </td>
        </tr>
        <tr>
            <td class="white">
                活动场地
            </td>
            <td class="tb">
                <input type="radio" name="place" value="0" class="mychoose"/>室内
                <input type="radio" name="place" value="1" class="mychoose"/>户外
                <input type="radio" name="place" value="2" class="mychoose"/>线上
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
    <input type="reset" value="重置" class="mybutton">
    <input type="button" value="提交"class="mybutton" style="margin-left:30px;" onclick="create()">
</div>
</form>
<div class="footpicture">
</div>


<script src="/js/tab.js"></script> 
<script src="/js/selectdate.js"></script> 
<link href="/css/selectdate.css" rel="stylesheet" type="text/css" />
<script>
    var editor = new Simditor({
        textarea: $('#editor')
        //optional options
    });
</script>

<script>
    function create() {
        $(function () {
            alert($("form").serialize());
            $.post("/na", $("form").serialize(), function(data) {
                if (data == "1") {
                    setTab('activity',2,5);
                }
            })
        })
    }
</script>


<script>
    /*
    根据状态state获得活动，然后执行callback
     */
    function getActivities(state, callback) {
        $(function () {
            $.post("/gi", {id:"0", state:"0"}, function (data) {
                callback(data);
            })
        })
    }
</script>