<%--
  Created by IntelliJ IDEA.
  User: zoetx
  Date: 2017/2/11
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/js/tablealtrow.js"></script> 
<link href="/css/table1.css" rel="stylesheet" type="text/css" />

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
    <table class="altrowstable" id="alternatecolor3">
        <tr>
            <th>活动名称</th>
            <th>参与人数</th>
            <th>开始时间</th>
            <th>结束时间</th>
            <th>点赞数</th>
            <th>关注数</th>
        </tr>
        <tr>
            <td>
                <a class="underline" href="/pages/group/activity/displayactivity.jsp"  target="_blank">大不了自己学</a>
            </td>
            <td>50</td>
            <td>2017-01-01</td>
            <td>2017-01-02</td>
            <td>50</td>
            <td>15</td>
        </tr>
        <tr>
            <td><a class="underline" href="/pages/group/activity/displayactivity.jsp"  target="_blank">签名档设计大赛</a></td>
            <td>50</td>
            <td>2017-01-01</td>
            <td>2017-01-02</td>
            <td>50</td>
            <td>15</td>
        </tr>
        <tr>
            <td><a class="underline" href="/pages/group/activity/displayactivity.jsp"  target="_blank">万圣嘉年华</a></td>
            <td>50</td>
            <td>2017-01-01</td>
            <td>2017-01-02</td>
            <td>50</td>
            <td>15</td>
        </tr>
    </table>

</div>