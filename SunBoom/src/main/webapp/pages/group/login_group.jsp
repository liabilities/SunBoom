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
    <link href="/css/login_group.css" type="text/css" rel="stylesheet">
    <title>登录</title>
</head>
<body>

<div id = "nav">
    <jsp:include page="/pages/group/nav/navhead.jsp" ></jsp:include>
</div>
<div class="main login-wrapper cf">
    <div class="input-form">
        <div>
            <table>
                <tr>
                   <td colspan="2">
                       <img src="/img/1.png" class="avatar">
                   </td>
                </tr>
                <tr style="height:50px">
                    <td>
                        <label for="groupName" class="input-name">用户名</label>
                    </td>
                    <td>
                        <input type="text" class="input-field" id="groupName" name="groupName" placeholder="请输入用户名">
                    </td>
                </tr>
                <tr style="height:50px">
                    <td>
                        <label for="password" class="input-name">密码</label>
                    </td>
                    <td>
                        <input type="password" class="input-field" id="password" name="password" placeholder="请输入密码">
                    </td>
                </tr>
            </table>
        </div>
        <div style="height:50px">
            <button type="submit" class="login-button" onclick="Login()">登录</button>
        </div>
    </div>
</div>

<script src="../../js/jquery.js"></script>
<script src="../../js/bootstrap.min.js"></script>
<script src="../../js/group/login.js">
</script>

</body>
</html>