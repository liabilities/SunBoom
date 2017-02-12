<%--
  Created by IntelliJ IDEA.
  User: zoetx
  Date: 2017/2/11
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/js/tablealtrow.js"></script> 
<link href="/css/table.css" rel="stylesheet" type="text/css" />

<style>
    .underline{
        color:black;
    }
    .underline:hover{
        text-decoration:underline;
        color:darkblue;
        cursor: pointer;
    }
</style>

<div class="main wrapper cf">
    <table class="altrowstable" id="alternatecolor2">
        <tr>
            <th>活动名称</th>
            <th>当前参与人数</th>
            <th>类型</th>
            <th>场地</th>
            <th>开始时间</th>
        </tr>
        <tr>
            <td>
                <a class="underline" href="/pages/group/activity/displayactivity.jsp"  target="_blank">大不了自己学</a>
            </td>
            <td>100</td>
            <td>自学 编程</td>
            <td>线上</td>
            <td>2017-01-01</td>
        </tr>
        <tr>
            <td><a class="underline" href="/pages/group/activity/displayactivity.jsp"  target="_blank">签名档设计大赛</a></td>
            <td>300</td>
            <td>设计</td>
            <td>线上</td>
            <td>2017-02-01</td>
        </tr>
        <tr>
            <td><a class="underline" href="/pages/group/activity/displayactivity.jsp"  target="_blank">万圣嘉年华</a></td>
            <td>35</td>
            <td>闯关 推理 娱乐</td>
            <td>户外</td>
            <td>2017-10-30</td>
        </tr>
    </table>

</div>