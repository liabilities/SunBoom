<%--
  Created by IntelliJ IDEA.
  User: zoetx
  Date: 2017/2/13
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style>
    .condition-table{
        border: 1px solid white;
        height: 40px;
        border:0px;
        margin:0 auto;
        text-align: left;
        font-family: "微软雅黑 Light";
        color: black;
        background-color: #e9f2f1;
        font-size: 16px;
        font-family: "微软雅黑 Light";
        padding-left:12px;
    }

    .condition-table-column{
        border: 1px solid white
        height: 40px;
        border:0px;
        margin:0 auto;
        width:120px;
        text-align: left;
        font-family: "微软雅黑 Light";
        color: black;
        background-color: #e9f2f1;
        font-size: 16px;
        font-family: "微软雅黑 Light";
        padding-left:12px;
    }

</style>

<div class="main wrapper cf" style="background-color: #e9f2f1;">
    <table class="condition-table" style="width: 100%">
        <tr>
            <td class="condition-table-column" >
                筛选条件：
            </td>
            <td class="condition-table">
            </td>
        </tr>
        <tr>
            <td class="condition-table-column" >
                发起者类型
            </td>
            <td class="condition-table">
                <input type="checkbox" name="type" class="mychoose"/>不限
                <input type="checkbox" name="type" class="mychoose"/>注册团体
                <input type="checkbox" name="type" class="mychoose"/>临时团体
                <input type="checkbox" name="type" class="mychoose"/>个人
            </td>
        </tr>
        <tr>
            <td class="condition-table-column">
                活动类型
            </td>
            <td class="condition-table">
                <input type="checkbox" name="chkType" class="mychoose"/>不限
                <input type="checkbox" name="chkType" class="mychoose"/>晚会
                <input type="checkbox" name="chkType" class="mychoose"/>体育
                <input type="checkbox" name="chkType" class="mychoose"/>音乐
            </td>
        </tr>
        <tr>
            <td class="condition-table-column">
                场地
            </td>
            <td class="condition-table">
                <input type="checkbox" name="place" class="mychoose"/>不限
                <input type="checkbox" name="place" class="mychoose"/>室内
                <input type="checkbox" name="place" class="mychoose"/>户外
                <input type="checkbox" name="place" class="mychoose"/>线上
            </td>
        </tr>
        <tr>
            <td class="condition-table-column">
                进度
            </td>
            <td class="condition-table">
                <input type="checkbox" name="procress" class="mychoose"/>不限
                <input type="checkbox" name="procress" class="mychoose"/>已完成
                <input type="checkbox" name="procress" class="mychoose"/>正在进行
                <input type="checkbox" name="procress" class="mychoose"/>尚未开始
            </td>
        </tr>
        <tr>
            <td class="condition-table-column">
                时间范围
            </td>
            <td class="condition-table">
                <form name="reg_testdate3">
                    <select id="selectYear3" name="YYYY3" onchange="YYYYDD3(this.value)">
                        <option value="">选择年</option>
                    </select>
                    <select id="selectMonth3" name="MM3" onchange="MMDD3(this.value)">
                        <option value="">选择月</option>
                    </select>
                    <select id="selectDay3" name="DD3">
                        <option value="">选择日</option>
                    </select>
                    <span> - </span>
                    <select id="selectYear4" name="YYYY4" onchange="YYYYDD4(this.value)">
                        <option value="">选择年</option>
                    </select>
                    <select id="selectMonth4" name="MM4" onchange="MMDD4(this.value)">
                        <option value="">选择月</option>
                    </select>
                    <select id="selectDay4" name="DD4">
                        <option value="">选择日</option>
                    </select>
                </form>
            </td>
        </tr>
        <tr>
            <td class="condition-table-column">
                规模
            </td>
            <td class="condition-table">
                <input type="checkbox" name="scale" class="mychoose"/>不限
                <input type="text" style="width: 50px">
                <span> - </span>
                <input type="text"  style="width: 50px">
                <span> 人</span>
            </td>
        </tr>
    </table>
    <div style="height: 40px; text-align: right;padding-top: 20px;padding-right: 30px">
        <input type="submit" value="筛选" class="mybutton" style="height: 28px;width: 50px;font-size: 15px;" >
    </div>
    <div style="height: 12px;"></div>
    <div style="height: 2px;background-color: white;width: 100%"></div>

    <%--以下是具体的列表消息--%>
    <div>
        <div class="card">
            <div class="picturefield">
                <img alt="300x200" src="/img/1.png"class="picture-size-260"/>
            </div>
            <h3>
                活动名称
            </h3>
            <div class="detailfield">
                <p>发起者：</p>
                <p>场地：</p>
                <p>类型：</p>
                <p>进度：</p>
                <p>规模：</p>
            </div>
            <div class="buttonfield">
                <button class="mybutton">查看详情</button>
            </div>
        </div>
    </div>
    <div class="card">
        <div class="picturefield">
            <img alt="300x200" src="/img/1.png" class="picture-size-260"/>
        </div>
        <h3>
            活动名称
        </h3>
        <div class="detailfield">
            <p>发起者：</p>
            <p>场地：</p>
            <p>类型：</p>
            <p>进度：</p>
            <p>规模：</p>
        </div>
        <div class="buttonfield">
            <button class="mybutton">查看详情</button>
        </div>
    </div>
    <div>
        <div class="card">
            <div class="picturefield">
                <img alt="300x200" src="/img/1.png" class="picture-size-260"/>
            </div>
            <h3>
                活动名称
            </h3>
            <div class="detailfield">
                <p>发起者：</p>
                <p>场地：</p>
                <p>类型：</p>
                <p>进度：</p>
                <p>规模：</p>
            </div>
            <div class="buttonfield">
                <button class="mybutton">查看详情</button>
            </div>
        </div>
    </div>
</div>

<script src="/js/selectdate_ground.js"></script> 
<style>
    .card{
        width:280px;
        margin: 12px;
        border: 2px solid white;
        padding: 12px;
        background-color: #325d7f;
        color: white;
        border-radius: 15px;
        float:left;
    }



    .picturefield{
        width:280px;
        height:185px;
        text-align: center;
    }

    .detailfield{
        width:260px;
        padding: 10px;
        font-size: 12px;
    }

    .buttonfield{
        width:280px;
        height:33px;
        text-align: right;
    }

    .picture-size-260{
        height: 100%;
        width: 100%;
    }
</style>