<%--
  Created by IntelliJ IDEA.
  User: zs
  Date: 2017/1/11
  Time: 上午10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><script type="text/javascript">var _href = window.location.href;var _h = _href.replace("http://","http://m.");document.write("<meta http-equiv=\"mobile-agent\" content=\"format=html5;url="+_h+"\" />");document.write("<meta http-equiv=\"mobile-agent\" content=\"format=xhtml;url="+_h+"\" />");</script><meta name="applicable-device"content="pc"><meta http-equiv="Cache-Control" content="no-transform " />
    <meta charset="utf-8" />
    <title>假装这是个团体首页</title>
    <%--<link rel="stylesheet" type="text/css" href="http://static.iask.cn/v20161228/css/reset.min.css?v1.1.6" />--%>
    <link rel="stylesheet" type="text/css" href="../css/stoled.css">
    <script type='text/javascript' src="../js/test1.js"></script>
    <script type="text/javascript" src="../js/test2.js"></script>

</head>
<body>

<div class="nav-con">
    <div class="pw pw-v nav">
        <ul class="nav-list lf">
            <li><a href="#">首页</a></li>
            <li class="nav-more-li">
                <a href="#">活动<i class="ico-nav-arrow"></i></a>
                <div class="nav-more cf">
                    <div class="bg-nav-more"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#" onclick="myfunction()">创建活动</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">历史活动</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">正在进行</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">尚未开始</a></p>
                    </div>
                </div>
            </li>
            <li class="nav-more-li">
                <a href="#">成员<i class="ico-nav-arrow"></i></a>
                <div class="nav-more cf">
                    <div class="bg-nav-more"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">创建活动</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">历史活动</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">正在进行</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">尚未开始</a></p>
                    </div>
                </div>
            </li>
            <li class="nav-more-li">
                <a href="#">物资<i class="ico-nav-arrow"></i></a>
                <div class="nav-more cf">
                    <div class="bg-nav-more"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">创建活动</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">历史活动</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">正在进行</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">尚未开始</a></p>
                    </div>
                </div>
            </li>
            <li class="nav-more-li">
                <a href="#">留言板<i class="ico-nav-arrow"></i></a>
                <div class="nav-more cf">
                    <div class="bg-nav-more"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">创建活动</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">历史活动</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">正在进行</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">尚未开始</a></p>
                    </div>
                </div>
            </li>
            <li class="nav-more-li">
                <a href="#">文件夹<i class="ico-nav-arrow"></i></a>
                <div class="nav-more cf">
                    <div class="bg-nav-more"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">创建活动</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">历史活动</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">正在进行</a></p>
                    </div>
                    <div class="nav-more-line fl"></div>
                    <div class="nav-more-item fl">
                        <p><a href="#">尚未开始</a></p>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>

<script>
    function myfunction() {
        var child1=document.getElementById("main_content1");
        var child2=document.getElementById("main_content2");
        var child3=document.getElementById("main_content3");
        var parent1=document.getElementById("main_content");
        child1.setAttribute("Hidden","hidden");
        child2.removeAttribute("Hidden");
    }
</script>

</body>
</html>
