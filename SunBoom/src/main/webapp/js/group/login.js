/**
 * Created by zs on 2017/2/18.
 */

function Login() {

    var groupName = $("#groupName").val();
    var password = $("#password").val();

    if (groupName == "") {
        alert("请输入账号");
        return;
    }

    if (password == "") {
        alert("请输入密码");
        return;
    }

    $.ajax({
        type: "post",
        async: false, // 同步执行
        url: "/Login_Group",
        data: {
            "groupName": groupName,
            "password": password
        },
        success: function (result) {
            if (result == "success") {
                alert('登录成功');
                setTimeout("window.location.href = 'pages/group/home.jsp'", 500);
            } else {
                alert(result);
            }
        },
        error: function () {
            alert("出故障了请稍候再试");
        }
    })

}