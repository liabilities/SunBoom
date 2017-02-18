<%--
  Created by IntelliJ IDEA.
  User: zs
  Date: 2017/2/18
  Time: 上午9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap core CSS -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">

    <title>登录</title>
</head>


<body>
    <form class="form-horizontal">
      <div class="form-group">
        <label for="userName" class="col-sm-2 control-label">用户名</label>
        <div class="col-sm-10">
          <input type="userName" class="form-control" id="userName" placeholder="请输入用户名">
        </div>
      </div>
      <div class="form-group">
        <label for="password" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
          <input type="password" class="form-control" id="password" placeholder="请输入密码">
        </div>
      </div>

      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-default" onclick="Login()">登录</button>
        </div>
      </div>
    </form>

<script src="../../js/jquery.js"></script>
<script src="../../js/bootstrap.min.js"></script>
</body>
</html>
