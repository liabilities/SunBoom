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
    <title>活动</title>
</head>

<body>

<div>
    <jsp:include page="nav/navigationbar1.jsp" ></jsp:include>
</div>

<nav class="secondary-nav">
    <div class="wrapper">
        <ul class="categories-nav">
            <li id="activity1" onclick="setTab('activity',1,5)" class="current-menu-item"><a>创建活动</a></li>
            <li id="activity2" onclick="updateNotStarted()"><a>尚未开始</a></li>
            <li id="activity3" onclick="setTab('activity',3,5)"><a>正在进行</a></li>
            <li id="activity4" onclick="setTab('activity',4,5)"><a>历史活动</a></li>
            <li id="activity5" onclick="setTab('activity',5,5)"><a>活动广场</a></li>
        </ul>
    </div>
    <div class="main wrapper cf">
        <div id="con_activity_1" class="hover">
            <jsp:include page="activity/createactivity.jsp" ></jsp:include>
        </div>

        <div id="con_activity_2" style="display:none">
            <jsp:include page="activity/notstarted.jsp" ></jsp:include>
        </div>

        <div id="con_activity_3" style="display:none">
            <jsp:include page="activity/underway.jsp" ></jsp:include>
        </div>

        <div id="con_activity_4" style="display:none">
            <jsp:include page="activity/history.jsp" ></jsp:include>
        </div>

        <div id="con_activity_5" style="display:none">
            <jsp:include page="activity/ground.jsp" ></jsp:include>
        </div>
    </div>
</nav>

<script src="/js/tab.js"></script>

<script>
    function updateNotStarted() {
        setTab('activity',2,5);
    }
</script>

<script>
    /*
     根据状态state获得活动，然后执行callback
     */
    function getActivities(state, callback) {
        $(function () {
            $.post("/gi", {id:"0", state:state}, function (data) {
                callback(data);
            })
        })
    }
</script>
</body>
</html>
