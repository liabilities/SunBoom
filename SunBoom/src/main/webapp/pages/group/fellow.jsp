<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <title>联系人</title>
</head>
<body onload="getContacts()">

<div>
    <jsp:include page="nav/navigationbar1.jsp"></jsp:include>
</div>

<div class="main wrapper cf" id="contact_main">
    <div id="head1">
        <head>
            我的联系人
        </head>
    </div>
    <div class="container">

        <div id="left" style="height: 500px;overflow: auto">
            <%--<button onclick="getContacts()"> 3545</button>--%>
            <div class="list-group" id="list">
                <li class="list-group-item active">
                    <h4>A</h4>
                </li>
                <div class="list-group" id="a"></div>
                <li class="list-group-item active">
                    <h4>B</h4>
                </li>
                <div class="list-group" id="b"></div>
                <li class="list-group-item active">
                    <h4>C</h4>
                </li>
                <div class="list-group" id="c"></div>
                <li class="list-group-item active">
                    <h4>D</h4>
                </li>
                <div class="list-group" id="d"></div>
                <li class="list-group-item active">
                    <h4>E</h4>
                </li>
                <div class="list-group" id="e"></div>
                <li class="list-group-item active">
                    <h4>F</h4>
                </li>
                <div class="list-group" id="f"></div>
                <li class="list-group-item active">
                    <h4>G</h4>
                </li>
                <div class="list-group" id="g"></div>
                <li class="list-group-item active">
                    <h4>H</h4>
                </li>
                <div class="list-group" id="h"></div>
                <li class="list-group-item active">
                    <h4>I</h4>
                </li>
                <div class="list-group" id="i"></div>
                <li class="list-group-item active">
                    <h4>J</h4>
                </li>
                <div class="list-group" id="j"></div>
                <li class="list-group-item active">
                    <h4>K</h4>
                </li>
                <div class="list-group" id="k"></div>
                <li class="list-group-item active">
                    <h4>L</h4>
                </li>
                <div class="list-group" id="l"></div>
                <li class="list-group-item active">
                    <h4>M</h4>
                </li>
                <div class="list-group" id="m"></div>
                <li class="list-group-item active">
                    <h4>N</h4>
                </li>
                <div class="list-group" id="n"></div>
                <li class="list-group-item active">
                    <h4>O</h4>
                </li>
                <div class="list-group" id="o"></div>
                <li class="list-group-item active">
                    <h4>P</h4>
                </li>
                <div class="list-group" id="p"></div>
                <li class="list-group-item active">
                    <h4>Q</h4>
                </li>
                <div class="list-group" id="q"></div>
                <li class="list-group-item active">
                    <h4>R</h4>
                </li>
                <div class="list-group" id="r"></div>
                <li class="list-group-item active">
                    <h4>S</h4>
                </li>
                <div class="list-group" id="s"></div>
                <li class="list-group-item active">
                    <h4>T</h4>
                </li>
                <div class="list-group" id="t"></div>
                <li class="list-group-item active">
                    <h4>U</h4>
                </li>
                <div class="list-group" id="u"></div>
                <li class="list-group-item active">
                    <h4>V</h4>
                </li>
                <div class="list-group" id="v"></div>
                <li class="list-group-item active">
                    <h4>W</h4>
                </li>
                <div class="list-group" id="w"></div>
                <li class="list-group-item active">
                    <h4>X</h4>
                </li>
                <div class="list-group" id="x"></div>
                <li class="list-group-item active">
                    <h4>Y</h4>
                </li>
                <div class="list-group" id="y"></div>
                <li class="list-group-item active">
                    <h4>Z</h4>
                </li>
                <div class="list-group" id="z"></div>
                <li class="list-group-item active">
                    <h4>#</h4>
                </li>
                <div class="list-group" id="0"></div>
            </div>
        </div>
        <div id="right">
            <div id="message">
                <table width=100% height="330px" border="0" align="center" cellspacing="0" cellpadding="0"
                       id="content_father">
                    <tr>
                        <td height="10px">

                        </td>
                    </tr>
                    <tr>
                        <td width=100% valign="top">
                            <div id="content">
                                <div class="content_left">
                                    <div class="conten_left_table">
                                        <p class="content_left_name">
                                            田小他 11:12:23
                                        </p>
                                        <p class="content_left_text">
                                            晓峰你怎么new不出对象
                                        </p>
                                    </div>
                                </div>
                                <div class="content_right">
                                    <p class="content_right_name">
                                        晓峰 11:13:23
                                    </p>
                                    <p class="content_right_text">
                                        小他你对象呢
                                    </p>
                                </div>
                            </div>
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
                                <td>
                                    <input type="button" name="chat_record" value="聊天记录" id="chat_record">
                                </td>
                            </tr>
                            <tr>
                                <td width=668px align="left" colspan="3">
                                    <textarea name="content1" id="send_box" rows="5" cols="80"
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
</div>
<div align="center">
    All CopyRights reserved @2017 sunboom team
</div>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../../js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../../js/bootstrap.min.js"></script>
<script type="text/javascript">
    function getContacts() {
        $.ajax(
            {
                type: "post",
                url: "/getContacts",
                data: {id: 1},
//                dataType:"json",
                success: function (data) {
//                    var list=data.contactList;
//                    for(var i=0;i<list.length;i++){
//                        $("#list").append('<li class="list-group-item">'+list[i]+'</li>')
//                    }
                    var names = data.nickname;
                    var groupids = data.groupId;
                    var avatars = data.avatar;
                    var capitals = data.capital;
                    for (var i = 0; i < names.length; i++) {
                        $("#" + capitals[i]).append('<a href="#" class="list-group-item">' +
                            '<img width="30" height="30" src="../../img/1.png " class="img-circle">' + '+names[i]' + '</a>')
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                }
            }
        )
    }
</script>
</body>
</html>
