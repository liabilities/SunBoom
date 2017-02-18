<%--
  Created by IntelliJ IDEA.
  User: Joe
  Date: 2017/2/18
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/messageboard.css" rel="stylesheet">
</head>
<body>
<div class="messageboard-content">
    <div class="leave-message">
        <div class="leave-message-textarea">
            <textarea id="tx" class="leave-message-text" cols="40" rows="7">你想对ta说...</textarea>
        </div>
        <div class="leave-message-send">
            <input type="button" class="leave-message-send" value="发送" onclick="">
        </div>
    </div>
    <div class="message_set">
        <input type="button" class="message-set-button" value="留言板设置">
    </div>
    <div class="message-content-div">
        <ul class="message-content">
            <li class="message-single">
                <div class="message-single-top">
                    <div class="message-singel-top-avator">
                        <img src="/img/1.png" class="message-single-top-avatar-img">
                    </div>
                    <div class="message-single-top-leavername">
                        <p>
                            周赛赛
                        </p>
                    </div>
                    <p class="message-single-top-text">
                        在藏区，你见到的任何一件貌似平常的东西，里面或许却隐含着无数值得破解的秘密。
                        从气势恢宏的庙宇到金碧辉煌的殿堂，从浩如烟海的经书到神秘多姿的宗教仪轨，从美
                        妙精美的唐卡到馥郁悠长的藏香，无不体现出特有的神韵与魅力。她的一切都带有浓郁
                        的宗教色彩
                    </p>
                </div>
                <div class="message-single-mid">
                    <p class="message-single-mid-time" name="message-single-mid-time">
                        2017-2-18 11:11
                    </p>
                    <p>
                        <input type="button" class="message-single-mid-reply" value="回复">
                    </p>
                </div>
                <div class="message-single-bottom">
                    <div class="message-single-bottom-avatar&name&time">
                        <div class="message-single-bottom-avatar">

                        </div>
                        <div class="message-single-bottom-time">
                            <p class="message-single-bottom-getUserName">
                                田小他
                            </p>
                            <p class="message-single-bottom-getTime">
                                2017-2-18 11:16
                            </p>
                        </div>
                    </div>
                    <hr class="message-single-dividerLine">
                    <div class="message-single-bottom-comment">
                        <div class="message-single-bottom-commentText">
                        <textarea class="message-single-bottom-comment-text" name="message-single-bottom-comment-text"
                                  cols="30" rows="2">
                            我来评论一句
                        </textarea>
                        </div>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
