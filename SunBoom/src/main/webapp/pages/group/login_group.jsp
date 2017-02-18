\<%--
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

    <title>登录</title>
</head>
<body>

<div id = "nav">
    <jsp:include page="/pages/group/nav/navhead.jsp" ></jsp:include>
</div>


<style>
    .input-form{
        text-align: center;
        padding-top: 30px;
        padding-button:30px;
    }

    .input-name{
        font-family:"微软雅黑 Light";
        font-size: 18px;
        text-align: center;
    }

    .input-field{
        border-width: 0px;
        width:300px;
        height:30px;
        font-size: 17px;
        color: white;
        font-family:"微软雅黑 Light";
        padding-left: 2px;
        border:1px solid #325d7f;
    }

    .login-button{
        background: url("/img/inputbg.png") fixed center center no-repeat;
        background-size: cover;
        border-width: 0px;
        width:80px;
        height:30px;
        font-size: 17px;
        color: white;
        font-family:"微软雅黑 Light";
        cursor:pointer;
    }

    .login-button:hover{
        background: grey;
    }

</style>

<div class="main wrapper cf">
    <div class="input-form">
        <form>
            <div>
                <table>
                    <tr style="height:50px">
                        <td>
                            <label for="groupName" class="input-name">用户名</label>
                        </td>
                        <td>
                            <input type="userName" class="input-field" id="groupName" name="groupName" placeholder="请输入用户名">
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

        </form>
    </div>
</div>

<script src="../../js/jquery.js"></script>
<script src="../../js/bootstrap.min.js"></script>
<script src="../../js/group/login.js">
</script>


</div>
</body>
</html>