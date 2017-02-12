/**
 * Created by Joe on 2017/2/7.
 */
var _msgw               =     390;//div的宽度
var _msgh               =     327;//div的高度
var _background         =     "#FFFFFF";//背景颜色
var _bordercolor        =     "#55BACC";//窗口边框的颜色
var _str                =     "";//初始化变量
var _IsMousedown        =     0;//鼠标初始化
var _ClickLeft          =     0;//鼠标坐标初始化
var _ClickTop           =     0;//鼠标坐标初始化
var _img                =     "";//初始化变量
var _MyMessage          =     "";//我当前的输入信息
var _SID                =     0;//发送者的ID
var _RID                =     0;//接收者的ID
var _RNAME              =     "游客";//当前和哪个在聊天，对方的名字
var _RTYPE              =     "咨询";//聊天对象是什么，是群，还是个人用户，还是企业用户
var _url                =     "";//网页地址
var _cache              =     '';//缓存上一个状态的所有信息
/*************
 第二步：在界面的中心生成一个可以移动的DIV
 *************/
var _Maindiv=document.createElement("div");
var _Imgdiv=document.createElement("div");
function Create_Main_Div(){
    //计算DIV在页面中的中心位置，聊天工具的主窗口
    sjw=Math.round(_msgw/2);
    sjh=Math.round(_msgh/2);
    _lastw=Math.round(document.body.clientWidth/2)-sjw;
    _lasth=Math.round(document.body.clientHeight/2)-sjw;
    _Maindiv.setAttribute('id','MAIN_DIV_0001_WJL');//ID复杂主要是想设置其为网站的唯一性！
    _Maindiv.setAttribute("align","center");
    _Maindiv.style.position="absolute";
    _Maindiv.style.background=_background;
    _Maindiv.style.border="1px solid " + _bordercolor;
    _Maindiv.style.position = "absolute";
    _Maindiv.style.overflow = "hidden";
    _Maindiv.style.left = _lastw;
    _Maindiv.style.top = _lasth;
    _Maindiv.style.font="12px/1.6em Verdana, Geneva, Arial, Helvetica, sans-serif";
    _Maindiv.style.width  = _msgw + "px";
    _Maindiv.style.height = _msgh + "px";
    _Maindiv.style.zIndex = "700000";//至于所有的DIV的最上面
    _Maindiv.innerHTML = set_str();
    document.body.appendChild(_Maindiv);
}
//创建一个表情DIV，因为表情的DIV必须跟随主窗口移动而移动
function CreateImgDiv(){
    var s=document.getElementById("IMG_WJL_CHAT_CET");
    if(s){
        CloseDiv(_Imgdiv);
    }else{
        var sal1=_Maindiv.style.left;
        var sal2=_Maindiv.style.top;
        var arr1=sal1.split("px");
        var arr2=sal2.split("px");
        var left=arr1[0]*1+27;
        var top=arr2[0]*1+115;
        sjw=Math.round(_msgw/2);
        sjh=Math.round(_msgh/2);
        _lastw=Math.round(document.body.clientWidth/2)-sjw;
        _lasth=Math.round(document.body.clientHeight/2)-sjw;
        _Imgdiv.setAttribute("id","IMG_WJL_CHAT_CET");
        _Imgdiv.setAttribute("align","center");
        _Imgdiv.style.background=_background;
        _Imgdiv.style.border="1px solid #E0EEF8";
        _Imgdiv.style.position = "absolute";
        _Imgdiv.style.left = left;
        _Imgdiv.style.top = top;
        _Imgdiv.style.font="12px/1.6em Verdana, Geneva, Arial, Helvetica, sans-serif";
        _Imgdiv.style.width  = "110px";
        _Imgdiv.style.height = "90px";
        _Imgdiv.style.zIndex = "700001";//故意设置这么高的，置于页面的最顶层
        _Imgdiv.innerHTML = Img1();
        document.body.appendChild(_Imgdiv);
    }
}
function Img1(){
    _img="";
    _img=_img+'<div style="border:solid 1px #E0EEF8; width:110px; height:90px;">';
    _img=_img+'<div  style="width:110px; height:30px;">';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/1.gif" width="21" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="微笑">';
    _img=_img+'</div>';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/2.gif" width="22" height="22"  style="cursor:pointer;" onClick="recimg(this.src)" title="难过">';
    _img=_img+'</div>';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/3.gif" width="21" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="呲牙">';
    _img=_img+'</div>';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/4.gif" width="22" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="睡">';
    _img=_img+'</div>';
    _img=_img+'</div>';
    _img=_img+'<div  style="width:110px; height:30px;">';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/5.gif" width="21" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="可爱">';
    _img=_img+'</div>';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/6.gif" width="22" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="憨笑">';
    _img=_img+'</div>';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/7.gif" width="24" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="衰">';
    _img=_img+'</div>';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/8.gif" width="22" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="惊恐">';
    _img=_img+'</div>';
    _img=_img+'<div  style="width:110px; height:30px;">';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/9.gif" width="21" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="疑问">';
    _img=_img+'</div>';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/10.gif" width="22" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="得意">';
    _img=_img+'</div>';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/11.gif" width="24" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="大哭">';
    _img=_img+'</div>';
    _img=_img+'<div style="float:left;width:27px; height:30px;padding:2px;">';
    _img=_img+'<img src="'+_url+'Chat/icon/12.gif" width="22" height="22" style="cursor:pointer;" onClick="recimg(this.src)" title="哈欠">';
    _img=_img+'</div>';
    _img=_img+'</div>';
    _img=_img+'</div>';
    return _img;
}
function recimg(strimg){
    var tempurl=strimg.split("/");
    _Getimg=tempurl[tempurl.length-1];
    insertimg();
}


function set_str(){
    _str="";
    _str=_str+'<!--头部开始-->';
    _str=_str+'<div id="MAIN_DIV_0001_WJL_HEAD" style="float:left;cursor:pointer;width:390px;height:37px; background-image:url('+_url+'Chat/img/title.jpg); overflow:hidden;" onMouseDown=moveInit("MAIN_DIV_0001_WJL",event) onMouseMove=Move("MAIN_DIV_0001_WJL",event) onMouseUp=stopMove() onMouseOut=stopMove()>';
    _str=_str+'<div id="MAIN_DIV_0001_WJL_HEAD_IMG" style="float:left;width:50px;height:37px; padding-top:3px;" align="center">';
    _str=_str+'<img src="'+_url+'Chat/img/head.jpg" width="30" height="30">';
    _str=_str+'</div>';
    _str=_str+'<div id="MAIN_DIV_0001_WJL_HEAD_INFOR" style="float:left;width:304px;height:37px; padding-top:5px; font-size:12px" align="left">';
    _str=_str+'<div style="float:left;"><img src="'+_url+'Chat/img/enter.jpg" width="20" height="20" align="absmiddle"></div>';
    _str=_str+'<div id="MAIN_DIV_0001_WJL_HEAD_ENTER_NAME" style="color:#4c4c4c;float:left;padding-top:5px;padding-left:5px;">'+ _RNAME +'</div>';
    _str=_str+'<div id="MAIN_DIV_0001_WJL_HEAD_ENTER_TYPE" style="color:#4c4c4c;float:left;padding-top:5px;padding-left:5px;">['+ _RTYPE +']</div>';
    _str=_str+'</div>';
    _str=_str+'<div id="MAIN_DIV_0001_WJL_HEAD_CLOSE" style="float:left;width:35px;height:37px; padding-top:0px;" align="center">';
    _str=_str+'<img src="'+_url+'Chat/img/close.jpg" width="35" height="14" title="点击关闭聊天！" onClick="CloseChat()">';
    _str=_str+'</div>';
    _str=_str+'</div>';
    _str=_str+'<!--头部结束-->';
    _str=_str+'<!--查看信息开始-->';
    _str=_str+'<div id="MAIN_DIV_0001_WJL_MESSAGE" style="width:390px;height:163px;scrollbar-face-color: #E0EEF8; scrollbar-highlight-color:#E0EEF8;overflow-x:hidden;overflow:scroll;scrollbar-3dlight-color: #FFFFFF; scrollbar-arrow-color:#38B0C1;scrollbar-track-color: #fcfcfc; scrollbar-darkshadow-color:#fcfcfc;font-size:12px;padding:5px;" align="left">';
    //_str=_str+'<iframe src="Chat/NowMessage.html" height="163" width="390" name="Lookinfor" id="Lookinfor" frameborder="no" border=0 marginheight="0" marginwidth="0"></iframe>';
    _str=_str+'</div>';
    _str=_str+'<!--查看信息结束-->';
    _str=_str+'<!--工具开始-->';
    _str=_str+'<div id="MAIN_DIV_0001_WJL_TOOL" style="width:390px;height:20px;overflow:hidden; background-color:#E0EEF8;">';
    _str=_str+'<div style="float:left; width:50px;height:20px;overflow:hidden;" align="center"><img src="'+_url+'Chat/img/biaoqing.jpg" width="20" height="20" style="cursor:pointer;" title="插入表情" onClick="CreateImgDiv();"></div>';
    _str=_str+'<div style="float:left;width:240px;"></div>';
    _str=_str+'<div style="float:left;width:100px;" align="center">';
    _str=_str+'<div style="float:left;width:20px;padding-top:2px; overflow:hidden;"><img src="'+_url+'Chat/img/mymasg.jpg" width="20" height="17"></div>';
    _str=_str+'<div style="float:left;width:60px;font-size:12px; padding-top:4px;overflow:hidden;" align="left"><a style="cursor:pointer;"href="'+_url+'CAS/allmymessage.jsp" target="_blank" title="查看历史消息记录">消息记录</a></div>';
    _str=_str+'</div>';
    _str=_str+'</div>';
    _str=_str+'<!--工具结束-->';
    _str=_str+'<!--编辑开始-->';
    _str=_str+'<div id="MAIN_DIV_0001_WJL_EDIT" style="MAIN_DIV_0001_WJL_EDIT_ss" style="scrollbar-face-color: #E0EEF8; scrollbar-highlight-color:#E0EEF8;overflow-x:hidden;overflow:scroll;width: 390px;scrollbar-3dlight-color: #FFFFFF; scrollbar-arrow-color:#38B0C1;scrollbar-track-color: #fcfcfc; scrollbar-darkshadow-color:#fcfcfc;height: 75px" align="left">';
    //
    _str=_str+'<iframe src="'+_url+'Chat/Edit.html" height="5000" width="390"  id="Editr_wjl_001_E" name="Editr_wjl_001_E" onload="Edit();" frameborder="no" border=0 marginheight="0" marginwidth="0"></iframe>';
    _str=_str+'</div>';
    _str=_str+'<!--编辑结束-->';
    _str=_str+'<!--编辑开始-->';
    _str=_str+'<div id="MAIN_DIV_0001_WJL_EDIT" style="width:390px;height:30px;overflow:hidden;background-color:#E0EEF8;">';
    _str=_str+'<div  style="float:left;width:240px; padding-top:5px; font-size:12px; color:#4c4c4c;" align="left"><input name="TYPE_Mess_wjl" id="TYPE_Mess_wjl" type="checkbox"  onClick="CGTYPE();" checked><span id="USE_SEND_TYPE_WJL_001_I">使用Ctrl+Enter发送</span></div>';
    _str=_str+'<div  style="float:left;width:150px; padding-top:4px;" align="center"><input name="send_Mess_wjl" id="send_Mess_wjl" type="button" value="发送(S)" onClick="b_send();"><input name="close_Mess_wjl" id="close_Mess_wjl" type="button" value="关闭(C)" onClick="CloseChat()"></div>';
    return _str;
}

/***移动DIV
 用法onMouseDown="moveInit('movediv',event);" onMouseMove="Move('movediv',event)" onMouseUp="stopMove()" onMouseOut="stopMove()"
 ****/
function moveInit(divID,evt){
    _IsMousedown = 1;
    if(getBrowserType() == "NSupport"){
        return;
    }
    var obj = getObjById(divID);
    if(getBrowserType() == "fox"){
        _ClickLeft = evt.pageX - parseInt(obj.style.left);
        _ClickTop = evt.pageY - parseInt(obj.style.top);
    }else{
        _ClickLeft = evt.x - parseInt(obj.style.left);
        _ClickTop = evt.y - parseInt(obj.style.top);
    }
}

function Move(divID,evt){
    var s=document.getElementById("IMG_WJL_CHAT_CET");
    if(s){
        CloseDiv(_Imgdiv);
    }
    if(_IsMousedown == 0){
        return;
    }
    var objDiv = getObjById(divID);
    if(getBrowserType() == "fox"){
        if(evt.pageX - _ClickLeft<=0){
            objDiv.style.left = 0;
        }else{
            if(evt.pageX - _ClickLeft + 391 >=document.body.scrollWidth){
                objDiv.style.left = document.body.scrollWidth-390;
            }else{
                objDiv.style.left = evt.pageX - _ClickLeft;
            }
        }
        if(evt.pageY - _ClickTop<=0){
            objDiv.style.top = 0;
        }else{
            if(evt.pageY - _ClickTop + 328>=document.body.scrollHeight){
                objDiv.style.top = document.body.scrollHeight-328;
            }else{
                objDiv.style.top = evt.pageY - _ClickTop;
            }
        }
    }else{
        if(evt.x - _ClickLeft<=0){
            objDiv.style.left = 0;
        }else{
            if(evt.x - _ClickLeft + 391 >=document.body.scrollWidth){
                objDiv.style.left = document.body.scrollWidth-390;
            }else{
                objDiv.style.left = evt.x - _ClickLeft;
            }
        }
        if(evt.y - _ClickTop<=0){
            objDiv.style.top = 0;
        }else{
            if(evt.y - _ClickTop + 328>=document.body.scrollHeight){
                objDiv.style.top = document.body.scrollHeight-328;
            }else{
                objDiv.style.top = evt.y - _ClickTop;
            }
        }
    }
}
function stopMove(){
    _IsMousedown = 0;
}
function getObjById(id){
    return document.getElementById(id);
}
function getBrowserType(){
    var browser=navigator.appName;
    var b_version=navigator.appVersion;
    var version=parseFloat(b_version);
    if ((browser=="Netscape")){
        return "fox";
    }else if(browser=="Microsoft Internet Explorer"){
        return "ie";
    }else{
        return "NSupport";
    }
}
//关闭DIV
function CloseDiv(divobj)
{
    divobj.parentNode.removeChild(divobj);
}

function Edit(){
    //Editr_wjl_001_E.document.designMode = "On";
    var iframeDoc =getIframeDoc(document.getElementById("Editr_wjl_001_E"));
    iframeDoc.designMode = "On";
    document.getElementById("Editr_wjl_001_E").contentWindow.document.body.focus();
    Editr_wjl_001_E.document.onkeypress=function(){return keyPress(Editr_wjl_001_E.event);};
    window.clipboardData.setData("","");//开启粘贴功能
}
function getIframeDoc(iframe){
    return iframe.contentDocument || iframe.contentWindow.document;
}
function keyPress(ev){
    //将剪贴版中的文本内容设置成为换行符\n.(在可编辑状态下\n代表的就是<br />);
    window.clipboardData.setData("Text","\n");
    var str=document.getElementById("Editr_wjl_001_E").contentWindow.document.body.innerHTML;
    str=str.replace(/<(?!\/?BR|\/?IMG)[^<>]*>/ig,"");
    if(ev.ctrlKey){
        if(document.getElementById("TYPE_Mess_wjl").checked){
            _MyMessage=str;
            //发送数据
            Sent_Message(_SID,_RID);
        }else{
            document.execCommand("paste");
            return false;
        }
    }
    if(ev.keyCode==13){
        if(!document.getElementById("TYPE_Mess_wjl").checked){
            _MyMessage=str;
            //发送数据
            Sent_Message(_SID,_RID);
            return false;
        }else{
            document.execCommand("paste");
            return false;
        }
    }
    return true;
}
//点击发送按钮发送
function b_send(){
    var str=document.getElementById("Editr_wjl_001_E").contentWindow.document.body.innerHTML;
    str=str.replace(/<(?!\/?BR|\/?IMG)[^<>]*>/ig,"");
    _MyMessage=str;
    Sent_Message(_SID,_RID);
}
//改变输出方式
function CGTYPE(){
    if(!document.getElementById("TYPE_Mess_wjl").checked){
        document.getElementById("USE_SEND_TYPE_WJL_001_I").innerHTML="使用Ctrl发送";
    }else{
        document.getElementById("USE_SEND_TYPE_WJL_001_I").innerHTML="使用Ctrl+Enter发送";
    }
    document.getElementById("Editr_wjl_001_E").contentWindow.document.body.focus();
}
/********************
 表情插入
 ********************/
function insertimg(){
    var html = '<img src="icon/'+ _Getimg +'" width=22 height=22 align=absmiddle>';//插入的内容(html)，可以是图片。
    _Getimg="";
    var s=document.getElementById("IMG_WJL_CHAT_CET");
    if(s){
        CloseDiv(_Imgdiv);
    }
    if(getBrowser()=='ie'){
        var Editor = window.frames["Editr_wjl_001_E"];   //IE获取iframe方法，否则图片位置跑到页面顶上去了。
        Editor.focus();
        o=Editor.document.selection.createRange();
        o.pasteHTML(html);
    }else if(getBrowser()=='ff'){
        var Editor = $('Editr_wjl_001_E');   //firefox要通过这种方式获取节点才行
        Editor.focus();
        var rng = Editor.contentWindow.getSelection().getRangeAt(0);
        var frg = rng.createContextualFragment(html);
        rng.insertNode(frg);
    }
}
//获取浏览器版本
function getBrowser(){
    var agentValue = window.navigator.userAgent.toLowerCase();
    if(agentValue.indexOf('msie')>0){
        return "ie";
    }else if(agentValue.indexOf('firefox')>0){
        return "ff";
    }else if(agentValue.indexOf('chrome')>0){
        return "chrome";
    }
}
//关闭聊天
function CloseChat(){
    var s=document.getElementById("MAIN_DIV_0001_WJL");
    if(s){
        CloseDiv(_Maindiv);
        CloseDiv(_Imgdiv);
    }
}
//发送信息到数据库中
var Send_WJL_MY_Message_001 = false;
function Send_Now_MY_Message_WJL(url){//初始化、指定处理函数、发送请求的函数
    Send_WJL_MY_Message_001 = false;
//开始初始化XMLHttpRequest对象
    if(window.XMLHttpRequest){ //Mozilla 浏览器
        Send_WJL_MY_Message_001 = new XMLHttpRequest();
        if (Send_WJL_MY_Message_001.overrideMimeType) {//设置MiME类别
            Send_WJL_MY_Message_001.overrideMimeType('text/xml');
        }
    }else if(window.ActiveXObject){ // IE浏览器
        try{
            Send_WJL_MY_Message_001 = new ActiveXObject("Msxml2.XMLHTTP");
        }catch(e){
            try{
                Send_WJL_MY_Message_001 = new ActiveXObject("Microsoft.XMLHTTP");
            }catch (e){
            }
        }
    }
    if (!Send_WJL_MY_Message_001) { // 异常，创建对象实例失败
        window.alert("不能创建XMLHttpRequest对象实例.");
        return false;
    }
    Send_WJL_MY_Message_001.onreadystatechange = GET_SIGN_SEND_WJL_MY_OK;
    // 确定发送请求的方式和URL以及是否同步执行下段代码
    Send_WJL_MY_Message_001.open("GET", url, true);
    Send_WJL_MY_Message_001.send(null);
}

function GET_SIGN_SEND_WJL_MY_OK() {
    if (Send_WJL_MY_Message_001.readyState == 4) { // 判断对象状态
        if (Send_WJL_MY_Message_001.status == 200) { // 信息已经成功返回，开始处理信息
            var sralt=Send_WJL_MY_Message_001.responseText;
            //本处放置数据库显示是否发送成功@！


        } else { //页面不正常
            alert("发送信息失败!请重新发送！");
        }
    }
}
//向数据库中发送数据SID指发送的用户，RID指接收的ID
function Sent_Message(){
    Send_Now_MY_Message_WJL(_url+"这里放您的请求页面可以是jsp,php,asp等?SID="+_SID+"&RID="+_RID+"&Msg="+_MyMessage);
    document.getElementById("Editr_wjl_001_E").contentWindow.document.body.innerHTML="";
}
//向数据库中读取数据，最新的数据SID指发送的用户，RID指接收的ID
//发送信息到数据库中
var Rec_WJL_MY_Message_001 = false;
function Rec_Now_MY_Message_WJL(url){//初始化、指定处理函数、发送请求的函数
    Rec_WJL_MY_Message_001 = false;
//开始初始化XMLHttpRequest对象
    if(window.XMLHttpRequest){ //Mozilla 浏览器
        Rec_WJL_MY_Message_001 = new XMLHttpRequest();
        if (Rec_WJL_MY_Message_001.overrideMimeType) {//设置MiME类别
            Rec_WJL_MY_Message_001.overrideMimeType('text/xml');
        }
    }else if(window.ActiveXObject){ // IE浏览器
        try{
            Rec_WJL_MY_Message_001 = new ActiveXObject("Msxml2.XMLHTTP");
        }catch(e){
            try{
                Rec_WJL_MY_Message_001 = new ActiveXObject("Microsoft.XMLHTTP");
            }catch (e){
            }
        }
    }
    if (!Rec_WJL_MY_Message_001) { // 异常，创建对象实例失败
        window.alert("不能创建XMLHttpRequest对象实例.");
        return false;
    }
    Rec_WJL_MY_Message_001.onreadystatechange = GET_SIGN_REC_WJL_MY_OK;
    // 确定发送请求的方式和URL以及是否同步执行下段代码
    Rec_WJL_MY_Message_001.open("GET", url, true);
    Rec_WJL_MY_Message_001.send(null);
}
// 处理返回信息的函数
function GET_SIGN_REC_WJL_MY_OK() {
    if (Rec_WJL_MY_Message_001.readyState == 4) { // 判断对象状态
        if (Rec_WJL_MY_Message_001.status == 200) { // 信息已经成功返回，开始处理信息
            var sralt=Rec_WJL_MY_Message_001.responseText;
            //本处放置数据库显示是否发送成功@！
            var div = document.getElementById('MAIN_DIV_0001_WJL_MESSAGE');
            div.innerHTML=sralt;
            //有新的信息时将滚动条置底部
            if(_cache!=sralt){
                _cache=sralt;
                div.scrollTop = div.scrollHeight;
            }else{
                //div.scrollTop = div.scrollHeight;
            }

        } else { //页面不正常
            alert("发送信息失败!请重新发送！");
        }
    }
}
/**************
 一段时间判断一次！
 如果有新的数据则获取，没有新数据则不用获取数据
 时间为300MS
 *****************/
function Get_Message(){
    var temp=Math.floor(Math.random()*100000+1);
    Rec_Now_MY_Message_WJL(_url+"这里放您的请求页面可以是jsp,php,asp等?SID="+_SID+"&RID="+_RID+"&clop_wjl_asdfh="+temp);
    window.setTimeout("Get_Message();",300);
}
/*************
 最后一步：调用函数
 *************/
function Chat(SID,RID){
    if(SID!=RID){
        var url=location.href;
        if(url.indexOf("CAS")!=-1){
            _url="../";
        }
        //包含新消息提示
        //初始化接收和发送者
        _SID=SID;
        _RID=RID;
        //200一下为群功能
        if(RID<1000){
            if(RID==1){
                _RNAME="装饰团购网";
                _RTYPE="及时咨询";
            }
            if(RID==2){
                _RNAME="装饰团购网";
                _RTYPE="问题求助";
            }
            if(RID==3){
                _RNAME="装饰团购网";
                _RTYPE="管理投诉";
            }
        }else{
            _RNAME="商家";
        }
        //500-1000为单个咨询

        Create_Main_Div();
        Get_Message();
    }else{
        alert("不能和自己聊天！");
    }
}