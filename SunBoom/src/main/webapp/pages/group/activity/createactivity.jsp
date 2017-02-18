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

<%--<form name="reg_testdate2">--%>
    <%--<select name="YYYY2" onChange="YYYYDD2(this.value)">--%>
        <%--<option value="">请选择 年</option>--%>
    <%--</select>--%>
    <%--<select name="MM2" onChange="MMDD2(this.value)">--%>
        <%--<option value="">选择 月</option>--%>
    <%--</select>--%>
    <%--<select name="DD2">--%>
        <%--<option value="">选择 日</option>--%>
    <%--</select>--%>
<%--</form>--%>
<%--<form name="reg_testdate">--%>
    <%--<select name="YYYY" onChange="YYYYDD(this.value)">--%>
        <%--<option value="">请选择 年</option>--%>
    <%--</select>--%>
    <%--<select name="MM" onChange="MMDD(this.value)">--%>
        <%--<option value="">选择 月</option>--%>
    <%--</select>--%>
    <%--<select name="DD">--%>
        <%--<option value="">选择 日</option>--%>
    <%--</select>--%>
<%--</form>--%>

<form name="reg_testdate">
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
                <%--<form name="reg_testdate">--%>
                    <%--&lt;%&ndash;<select id="selectYear" name="YYYY" onchange="YYYYDD(this.value)">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<option value=""></option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</select>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<select id="selectMonth" name="MM" onchange="MMDD(this.value)">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<option value=""></option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</select>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<select id="selectDay" name="DD">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<option value=""></option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</select>&ndash;%&gt;--%>

                        <select name="YYYY" onChange="YYYYDD(this.value)"id="selectYear">
                            <option value="">请选择 年</option>
                        </select>
                        <select name="MM" onChange="MMDD(this.value)"id="selectMonth">
                            <option value="">选择 月</option>
                        </select>
                        <select name="DD"id="selectDay">
                            <option value="">选择 日</option>
                        </select>
                <%--</form>--%>


            </td>
        </tr>
        <tr>
            <td class="white">
                结束时间
            </td>
            <td class="tb">
                <%--<form name="reg_testdate2">--%>
                    <%--&lt;%&ndash;<select id="selectYear2" name="YYYY2" onchange="YYYYDD2(this.value)">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<option value=""></option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</select>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<select id="selectMonth2" name="MM2" onchange="MMDD2(this.value)">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<option value=""></option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</select>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<select id="selectDay2" name="DD2">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<option value=""></option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</select>&ndash;%&gt;--%>

                    <select name="YYYY2" onChange="YYYYDD2(this.value)"id="selectYear2">
                        <option value="">请选择 年</option>
                    </select>
                    <select name="MM2" onChange="MMDD2(this.value)"id="selectMonth2">
                        <option value="">选择 月</option>
                    </select>
                    <select name="DD2"id="selectDay2">
                        <option value="">选择 日</option>
                    </select>
                <%--</form>--%>
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


<script language="JavaScript">
    function YYYYMMDDstart(){
        MonHead = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
        //先给年下拉框赋内容
        var y  = new Date().getFullYear();
        for (var i = (y-10); i < (y+10); i++) //以今年为准，前30年，后30年
            document.reg_testdate.YYYY.options.add(new Option(" "+ i +" 年", i));

        //赋月份的下拉框
        for (var i = 1; i < 13; i++)
            document.reg_testdate.MM.options.add(new Option(" " + i + " 月", i));

        document.reg_testdate.YYYY.value = y;
        document.reg_testdate.MM.value = new Date().getMonth() + 1;
        var n = MonHead[new Date().getMonth()];
        if (new Date().getMonth() ==1 && IsPinYear(YYYYvalue)) n++;
        writeDay(n); //赋日期下拉框Author:meizz
        document.reg_testdate.DD.value = new Date().getDate();
    }
    if(document.attachEvent)
        window.attachEvent("onload", YYYYMMDDstart);
    else
        window.addEventListener('load', YYYYMMDDstart, false);
    function YYYYDD(str) //年发生变化时日期发生变化(主要是判断闰平年)
    {
        var MMvalue = document.reg_testdate.MM.options[document.reg_testdate.MM.selectedIndex].value;
        if (MMvalue == ""){ var e = document.reg_testdate.DD; optionsClear(e); return;}
        var n = MonHead[MMvalue - 1];
        if (MMvalue ==2 && IsPinYear(str)) n++;
        writeDay(n)
    }
    function MMDD(str)   //月发生变化时日期联动
    {
        var YYYYvalue = document.reg_testdate.YYYY.options[document.reg_testdate.YYYY.selectedIndex].value;
        if (YYYYvalue == ""){ var e = document.reg_testdate.DD; optionsClear(e); return;}
        var n = MonHead[str - 1];
        if (str ==2 && IsPinYear(YYYYvalue)) n++;
        writeDay(n)
    }
    function writeDay(n)   //据条件写日期的下拉框
    {
        var e = document.reg_testdate.DD; optionsClear(e);
        for (var i=1; i<(n+1); i++)
            e.options.add(new Option(" "+ i + " 日", i));
    }
    function IsPinYear(year)//判断是否闰平年
    {
        return(0 == year%4 && (year%100 !=0 || year%400 == 0));
    }
    function optionsClear(e)
    {
        e.options.length = 1;
    }


    function YYYYMMDDstart2(){
        MonHead = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
        //先给年下拉框赋内容
        var y  = new Date().getFullYear();
        for (var i = (y-10); i < (y+10); i++) //以今年为准，前30年，后30年
            document.reg_testdate.YYYY2.options.add(new Option(" "+ i +" 年", i));

        //赋月份的下拉框
        for (var i = 1; i < 13; i++)
            document.reg_testdate.MM2.options.add(new Option(" " + i + " 月", i));

        document.reg_testdate.YYYY2.value = y;
        document.reg_testdate.MM2.value = new Date().getMonth() + 1;
        var n = MonHead[new Date().getMonth()];
        if (new Date().getMonth() ==1 && IsPinYear(YYYYvalue)) n++;
        writeDay(n); //赋日期下拉框Author:meizz
        document.reg_testdate2.DD2.value = new Date().getDate();
    }
    if(document.attachEvent)
        window.attachEvent("onload", YYYYMMDDstart2);
    else
        window.addEventListener('load', YYYYMMDDstart2, false);
    function YYYYDD2(str) //年发生变化时日期发生变化(主要是判断闰平年)
    {
        var MMvalue = document.reg_testdate.MM2.options[document.reg_testdate.MM2.selectedIndex].value;
        if (MMvalue == ""){ var e = document.reg_testdate.DD2; optionsClear2(e); return;}
        var n = MonHead[MMvalue - 1];
        if (MMvalue ==2 && IsPinYear2(str)) n++;
        writeDay2(n)
    }
    function MMDD2(str)   //月发生变化时日期联动
    {
        var YYYYvalue = document.reg_testdate.YYYY2.options[document.reg_testdate.YYYY2.selectedIndex].value;
        if (YYYYvalue == ""){ var e = document.reg_testdate.DD2; optionsClear2(e); return;}
        var n = MonHead[str - 1];
        if (str ==2 && IsPinYear2(YYYYvalue)) n++;
        writeDay2(n)
    }
    function writeDay2(n)   //据条件写日期的下拉框
    {
        var e = document.reg_testdate.DD2; optionsClear2(e);
        for (var i=1; i<(n+1); i++)
            e.options.add(new Option(" "+ i + " 日", i));
    }
    function IsPinYear2(year)//判断是否闰平年
    {
        return(0 == year%4 && (year%100 !=0 || year%400 == 0));
    }
    function optionsClear2(e)
    {
        e.options.length = 1;
    }

</script>