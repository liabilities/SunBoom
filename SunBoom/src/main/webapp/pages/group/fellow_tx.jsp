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
    <link href="../../css/nav.css" rel="stylesheet" type="text/css"/>
    <link href="../../css/fellow.css" rel="stylesheet" type="text/css"/>
    <link href="../../css/style.css" rel="stylesheet" type="text/css"/>
    <script src="../../js/chat.js"></script>
    <title>联系人</title>
    <script language="JavaScript">
        function showContent() {
            var loader = net.AjaxRequest("Messages?action=getMessages&nocache=" + new Date().getTime(), deal_online, onerror, "GET");
        }
        function onerror() {
            alert("发生错误，当前窗口将关闭");
            window.opener = null;
            window.close();
        }
        function deal_online() {
            online.innerHTML = this.req.responseText;
        }
        function deal_content() {
            var returnValue = this.req.responseText;
            var h = returnValue.replace(
                /\s/g, ""
            );
            if (h = "error") {
                Exit();
            } else {
                content.innerHTML = returnValue + "</span>";
                document.getElementsById('content').scrollTop = document.getElementById('content').scrollHeight * 2;
            }
        }
        window.onload = function () {
            showContent();
        }
        window.onbeforeunload = function () {
            if (event.clientY < 0 && event.clientX > document.body.scrollWidth) {
                Exit();
            }
        }
    </script>
    <script language="JavaScript">
        function send() {
            //暂时不要验证了
            var param = "from=" + form1.from.value + "&face=" + form1.face.value + "&color=" + form1.color.value + "&to=" + form1.to.value + "&content=" + form1.content1.value;
            var loader = new net.AjaxRequest("Messages?action=sendMessage", deal_send, onerror, "POST", param);
        }
        function send1() {
            document.getElementById("from").setAttribute("value","userName");
            var param="from="+document.getElementById("form1").from.value+"&to="+document.getElementById("form1").to.value+"&content="+document.getElementById("form1").content1.value;
            var loader = new net.AjaxRequest("Messages?action=sendMessage", deal_send, onerror, "POST", param);
        }

        $('form').submit()(function () {
            alert($(this).serialize())
        })

        function deal_send() {
            content.innerHTML = this.req.responseText + "</span>";
        }
        function Exic() {
            window.location.href = "#";
            alert("欢迎下次光临");
        }
    </script>
    <script language="javascript">
        function set(selectPerson) {
            if (selectPerson != "${username}") {//判断是不是和自己聊天，回头改
                form1.to.value = selectPerson;
            } else {
                alert("不能和自己聊天");
            }
        }
    </script>
    <script type="text/javascript">
        function checkScrollScreen() {
            if (!form1.scrollScreen.checked) {
                document.getElementById("content").style.overflow = 'scroll';
            } else {
                document.getElementById("content").style.overflow = 'hidden';
                document.getElementById("content").scrollTopo = document.getElementById('content').scrollHeight * 2;
            }
            setTimeout('checkScrollScreen()', 500);
        }
    </script>

</head>
<body>

<div id="head">
    <img src="../../img/ad.png" width=100% height="100px">
</div>

<div id="nav">
<<<<<<< HEAD
    <%--<jsp:include page="navigationbar1.jsp"></jsp:include>--%>
=======
    <jsp:include page="nav/navigationbar1.jsp"></jsp:include>
>>>>>>> origin/master
</div>

<div class="main wrapper cf" id="contact_main">
    <div id="head1">
        <head>
            我的联系人
        </head>
    </div>
    <div class="container" id="chat_board">
        <div id="left">
            这是左边
        </div>
        <div id="right">
            <div id="message">
                <table width=100% height="330px" border="0" align="center" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width=100% valign="top">
                            <div id="content">聊天内容</div>
                        </td>
                    </tr>
                </table>
            </div>

            <div id="message_edit">
                <div id="message_edit_message">

                    <table id="message_edit_table" height=161px border="0" align="0" cellpadding="0" cellspacing="0">
                        <form action="" name="form1" method="post">
                            <tr>
                                <td height="30" align="left" width="100px">
                                    <input name="from" type="hidden" value="${username}" class="tool" id="from">
                                    <input name="to" type="hidden" value="" size="35" readonly="readonly">
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
                                </td>
                                <td width="300px" align="left" class="tool">
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
                                    <input name="scrollScreen" type="checkbox" id="scrollScreen"
                                           onClick="checkScrollScreen()" value="..." checked>
                                </td>
                            </tr>
                            <tr >
                                <td width=555px align="left" colspan="2">
                                    <textarea name="content1" id="send_box" rows="5" cols="40"
                                              onkeydown="if(event.keyCode==13&&event.ctrlKey){submit();}"></textarea>
                                    <%--<input name="content1" id="send_box" type="text" size="70"--%>
                                           <%--onKeyDown="if(event.keyCode==13&&event.ctrlKey){send();}">--%>
                                    <input name="Submit2" id="button_send" type="button" class="btn_grey" value="发送"
                                           onClick="submit()">
                                </td>
                            </tr>
                        </form>
                    </table>
                </div>
            </div>
        </div>
    </div>

    <div align="center">
        All CopyRights reserved @2017 sunboom team
    </div>
    <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
    <script src="../../js/jquery.js"></script>
    <!-- 包括所有已编译的插件 -->
    <script src="../../js/bootstrap.min.js"></script>
</body>
</html>
