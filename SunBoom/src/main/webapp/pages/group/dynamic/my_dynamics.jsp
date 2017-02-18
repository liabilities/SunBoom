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
    <link href="../../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../../css/dynamic.css" rel="stylesheet">
    <script type="javascript">
        document.getElementsById("tx").onclick=function () {
            if (this.value == '来说点什么啊'){
                this.value=='';
            }
        }
    </script>
</head>
<body>
<div id="dynamic_publish" class="dynamic_publish">
    <textarea id="tx" class="dynamic_publish_text" cols="40" rows="7">说说最近参与了哪些活动吧...</textarea>
    <input type="button" class="dynamic_publish_img" value="插入图片" onclick=""  onkeydown="">
</div>
<div class="dynamic_screen">
    <input type="button" class="dynamic_screen_button" value="筛选">
</div>
<div class="dynamic_content">
    <ul class="dynamic_list">
        <li class="dynamic_single">
            <div class="dynamic_avatar">
                <img src="../../../img/1.png" class="dynamic_avatar_img">
            </div>
            <div class="dynamic_userName">
                <p>
                    <a href="">阮小键</a>
                </p>
            </div>
            <div class="dynamic_time&viewCount">
                <p>
                    15:45  浏览 15
                </p>
            </div>
            <div class="dynamic_info">
                <p class="dynamic_info_text">
                    在藏区，你见到的任何一件貌似平常的东西，里面或许却隐含着无数值得破解的秘密。
                    从气势恢宏的庙宇到金碧辉煌的殿堂，从浩如烟海的经书到神秘多姿的宗教仪轨，从美
                    妙精美的唐卡到馥郁悠长的藏香，无不体现出特有的神韵与魅力。她的一切都带有浓郁
                    的宗教色彩
                </p>
                <img class="dynamic_info_img" src="../../../img/1.png">
            </div>
            <table class="dynamic_tools">
                <tr>
                    <td>
                        <input type="button" class="comment" value="评论" onclick="">
                    </td>
                    <td>
                        <input type="button" class="transmit" value="转发" onclick="">
                    </td>
                    <td>
                        <input type="button" class="praise" value="赞" onclick="">
                    </td>
                </tr>
            </table>
            <table class="dynamic_praisers">
                <tr>
                    <td class="dynamic_praisers_single">
                        <img src="../../../img/1.png" class="dynamic_praisers_single_avatar">
                    </td>
                    <td class="dynamic_praisers_single">
                        <img src="../../../img/1.png" class="dynamic_praisers_single_avatar">
                    </td>
                </tr>
            </table>
            <div class="dynamic_comment">
                <textarea class="dynamic_comment_text" cols="30" rows="1">我来评论一番...</textarea>
                <input type="button" class="dynamic_comment_img" value="插入图片" onclick=""  onkeydown="">
            </div>
        </li>
    </ul>
</div>


<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../../../js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../../../js/bootstrap.min.js"></script>
<script type="text/javascript">
    function getDynamics() {
        $.ajax({
            type:"post",
            url:"/getDynamic",
            data:{userName:"南京大学软件学院新媒体中心"},
            dataType:"json",
            success:function () {
                alert(data.dynameics);
            },
            error:function () {
              alert("error");
            }
        })
    }
</script>
</body>
</html>
