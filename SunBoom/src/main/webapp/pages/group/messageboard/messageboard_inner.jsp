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
</head>
<body>
<div class="messageboard-content">
    <div class="leave-message">
        <div class="leave-message-textarea">
            <textarea id="tx" class="dynamic_publish_text" cols="40" rows="7">你想对ta说...</textarea>
        </div>
        <div class="leave-message-insertImg">
            <input type="button" class="dynamic_publish_img" value="插入图片" onclick=""  onkeydown="">
        </div>
    </div>
    <div class="message_screen">
        <input type="button" class="dynamic_screen_button" value="筛选">
    </div>
    <div class="message-content">
        <div class="message-single">
            你这样我怎么办
        </div>
    </div>
</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
