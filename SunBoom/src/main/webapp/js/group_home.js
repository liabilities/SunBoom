/**
 * Created by I Like Milk on 2017/1/24.
 */
function setAvatar() {
    var outer = document.createElement("div");
    var setAvatarBox = document.createElement("div");
    var fileChooser = document.createElement("input");
    outer.id = "outer";
    setAvatarBox.id = "setAvatarBox";
    fileChooser.type = "file";
    setAvatarBox.appendChild(fileChooser);
    outer.appendChild(setAvatarBox);
    document.body.appendChild(outer);
}

function doSomething() {
    $(function () {
        if ($("#editButton").text() == "编辑资料") {
            $("#info").addClass("disappear");
            $("#edit-info").removeClass("disappear");
            $("#nameBox").val($("#name").text());
            $("#signatureBox").val($("#signature").text());
            $("#memberNumBox").val($("#memberNum").text());
            $("#schoolBox").val($("#school").text());
            $("#tagBox").val($("#tag").text());
            $("#editButton").text("保存更改");
        } else {
            $("#edit-info").addClass("disappear");
            $("#info").removeClass("disappear");
            $("#name").text($("#nameBox").val());
            $("#signature").text($("#signatureBox").val());
            $("#memberNum").text($("#memberNumBox").val());
            $("#school").text($("#schoolBox").val());
            $("#tag").text($("#tagBox").val());
            $("#editButton").text("编辑资料");
            alert("保存成功");
        }
    })
}

function updateInfo() {
    $(function () {
        $.post("/getGroupInfo", {id: "1"}, function (data) {
            var xmlDom = new DOMParser().parseFromString(data, "text/xml");
            var info = xmlDom.getElementsByTagName("GROUP")[0];
            $("#name").text(info.getElementsByTagName("NAME")[0].childNodes[0].nodeValue);
            $("#signature").text(info.getElementsByTagName("SIGNATURE")[0].childNodes[0].nodeValue);
            $("#memberNum").text(info.getElementsByTagName("MEMBERNUM")[0].childNodes[0].nodeValue);
            $("#tag").text(info.getElementsByTagName("TAG")[0].childNodes[0].nodeValue);
            $("#avatar").attr("src", info.getElementsByTagName("AVATAR")[0].childNodes[0].nodeValue);
        })
    })
}