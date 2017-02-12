<%--
  Created by IntelliJ IDEA.
  User: Joe
  Date: 2017/2/7
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../css/fellow.css">
    <title>聊天板</title>
    <%--<form method="post" action="fellow_tx.jsp" >--%>

        <%--<input name="message" type="text" size=50 >--%>

        <%--<input type="submit" value="发送消息" >--%>

    <%--</form>--%>
<%--<%--%>

    <%--try{--%>

        <%--request.setCharacterEncoding("GB2312");--%>

        <%--String mywords=request.getParameter("message");--%>

        <%--String t="";--%>

        <%--if(application.getAttribute("words")==null && mywords!=null){--%>

            <%--t= (String)request.getRemoteAddr() + ":" + mywords + "<br/>";--%>

            <%--application.setAttribute("words",(Object)t);--%>

            <%--out.println(t);--%>

        <%--}--%>

        <%--else if(mywords!=null){--%>

            <%--t=(String)application.getAttribute("words");--%>

            <%--t += (String)request.getRemoteAddr() + ":" + mywords + "<br/>";--%>

            <%--application.setAttribute("words",(Object)t);--%>

            <%--out.println(t);--%>

        <%--}--%>

    <%--}--%>

    <%--catch(Exception e){--%>

    <%--}--%>

<%--%>--%>


</head>
<body>
<div id="content">
    <jsp:include page="show_text.jsp"></jsp:include>
</div>
<div id="message_tool">
    <button>
        表情
    </button>
    <button>
        图片
    </button>
    <button>
        文件
    </button>
</div>
<div id="message_edit">
    <div id="message_edit_message">
        <td action="" name="form1" method="post">
            <tr>
                <td height="30" align="left">&nbsp;</td>
                <td height="37" align="left"><input name="from" type="hidden" value="${username}">[${username}]
                    <input name="to" type="text" value="" size="35" readonly="readonly"></td>
            </tr>
            表情
            <select name="face" class="wenbenkuang">
                <option value="无表情的">无表情的</option>
                <option value="微笑着" selected>微笑着</option>
                <option value="笑呵呵地">笑呵呵地</option>
                <option value="热情的">热情的</option>
                <option value="温柔的">温柔的</option>
                <option value="红着脸">红着脸</option>
                <option value="幸福的">幸福的</option>
                <option value="嘟着嘴">嘟着嘴</option>
                <option value="热泪盈眶的">热泪盈眶的</option>
                <option value="依依不舍的">依依不舍的</option>
                <option value="得意的">得意的</option>
                <option value="神秘兮兮的">神秘兮兮的</option>
                <option value="恶狠狠的">恶狠狠的</option>
                <option value="大声的">大声的</option>
                <option value="生气的">生气的</option>
                <option value="幸灾乐祸的">幸灾乐祸的</option>
                <option value="同情的">同情的</option>
                <option value="遗憾的">遗憾的</option>
                <option value="正义凛然的">正义凛然的</option>
                <option value="严肃的">严肃的</option>
                <option value="慢条斯理的">慢条斯理的</option>
                <option value="无精打采的">无精打采的</option>
            </select>
            说：</td>
        <td width="189px" align="left">&nbsp;&nbsp;字体颜色：
            <select name="color" size="1" class="wenbenkuang" id="select">
                <option selected>默认颜色</option>
                <option style="color:#FF0000" value="FF0000">红色热情</option>
                <option style="color:#0000FF" value="0000ff">蓝色开朗</option>
                <option style="color:#ff00ff" value="ff00ff">桃色浪漫</option>
                <option style="color:#009900" value="009900">绿色青春</option>
                <option style="color:#009999" value="009999">青色清爽</option>
                <option style="color:#990099" value="990099">紫色拘谨</option>
                <option style="color:#990000" value="990000">暗夜兴奋</option>
                <option style="color:#000099" value="000099">深蓝忧郁</option>
                <option style="color:#999900" value="999900">卡其制服</option>
                <option style="color:#ff9900" value="ff9900">镏金岁月</option>
                <option style="color:#0099ff" value="0099ff">湖波荡漾</option>
                <option style="color:#9900ff" value="9900ff">发亮蓝紫</option>
                <option style="color:#ff0099" value="ff0099">爱的暗示</option>
                <option style="color:#006600" value="006600">墨绿深沉</option>
                <option style="color:#999999" value="999999">烟雨蒙蒙</option>
            </select>
        </td>
        <td width="19" align="left"><input name="scrollScreen" type="checkbox" id="scrollScreen" onClick="checkScrollScreen()" value= "1" checked></td>>
        <tr>
            <td width="21" height="30" align="left">&nbsp;</td>
            <td width="549" align="left">
                <input name="content1" type="text" size="70" onkeydown="if(event.keyCode==13&&event.ctrlKey){send();}">
            </td>
        </tr>
        <tr>
            <td height="30" align="left">&nbsp;</td>
            <td colspan="2" align="center" class="work_dark">&nbsp;
                All CopyRights reserved 2017 sunboom team
            </td>
            <td align="center">&nbsp;</td>
        </tr>
        </form>
    </div>
    <%--<div id="message_edit_button">--%>
        <%--<div id="button_send">--%>
            <%--<jsp:include page="send.jsp"></jsp:include>--%>
        <%--</div>--%>
    <%--</div>--%>

</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../../js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../../js/bootstrap.min.js"></script>
</body>
</html>
