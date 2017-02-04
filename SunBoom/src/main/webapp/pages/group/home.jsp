<%--
  Created by IntelliJ IDEA.
  User: Joe
  Date: 2017/1/15
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../css/groupIndex.css" rel="stylesheet">
    <link href="../../css/stoled.css" rel="stylesheet">
    <link href="../../css/group_home.css" rel="stylesheet">

    <script src="../../js/try.js"></script>
    <script src="../../../js/ckeditor/ckeditor.js"></script>

    <title>团体首页</title>
</head>

<body>
<div class="container">
    <div id="head">
        <img src="../../img/头像冬.png" width=100% height="100px">
    </div>
</div>
<div class="container">
    <jsp:include page="group_navigationbar.jsp"/>
</div>

<div class="container top-gap">
    <div class="row clearfix">
        <div class="col-md-4 column">
            <a id="modal-420333" href="#modal-container-420333" role="button" class="btn" data-toggle="modal">
                <img id="avatar" alt="头像" width="200" height="200">
            </a>
            <div class="modal fade" id="modal-container-420333" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title" id="myModalLabel">
                                修改头像
                            </h4>
                        </div>
                        <div class="modal-body">
                                <form method="post"><input accept="image/gif, image/jpeg, image/x-png" type="file"></form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> <button type="button" class="btn btn-primary">保存</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-8 column">
            <div class="row clearfix top-gap">
                <div class="col-md-2 column">
                    <p class = items><span class="info-name">社团名称：</span></p>
                    <p class = items><span class="info-name">个性签名：</span></p>
                    <p class = items><span class="info-name">成员数：</span></p>
                    <p class = items><span class="info-name">所属学校：</span></p>
                    <p class = items><span class="info-name">标签：</span></p>
                </div>
                <div class="col-md-10 column" id="info">
                    <p class = items><span id="name"></span></p>
                    <p class = items><span id="signature"></span></p>
                    <p class = items><span id="memberNum"></span></p>
                    <p class = items><span id="school"></span></p>
                    <p class = items><span id="tag"></span></p>
                </div>
                <div class="col-md-10 column disappear" id="edit-info">
                    <p class = items><input type="text" id="nameBox"></p>
                    <p class = items><input type="text" id="signatureBox"></p>
                    <p class = items><input type="text" id="memberNumBox"></p>
                    <p class = items><input type="text"  id="schoolBox"></p>
                    <p class = items><input type="text" id="tagBox"></p>
                </div>
            </div>
        </div>
    </div>
    <center><a href="javascript:void(0)" onclick="doSomething()" id="editButton">编辑资料</a></center>
    <textarea id="TextArea1" cols="20" rows="2" class="ckeditor"></textarea>
</div>

<div id="foot_div">
    <p>版权所有@南京大学软件学院</p>
</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../../js/jquery-3.1.1.min.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../../js/bootstrap.min.js"></script>
<script src="../../js/group_home.js"></script>
<script>
    updateInfo();
</script>

<script type="text/javascript">
    CKEDITOR.replace('TextArea1');
</script>
</body>
</html>
