function YYYYMMDDstart3()
{
    MonHead = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

    var y  = new Date().getFullYear();
    for (var i = (y-10); i < (y+10); i++) //以今年为准，前10年，后10年
        document.reg_testdate3.YYYY3.options.add(new Option(" "+ i +" 年", i));

//赋月份的下拉框
    for (var i = 1; i < 13; i++)
        document.reg_testdate3.MM3.options.add(new Option(" " + i + " 月", i));

    document.reg_testdate3.YYYY3.value = "未定义";
    document.reg_testdate3.MM3.value = "未定义";
    var n = MonHead[new Date().getMonth()];
    var YYYYvalue = new Date().getFullYear();
    if (new Date().getMonth() ==1 && IsPinYear3(YYYYvalue)) n++;
    writeDay3(n); //赋日期下拉框Author:meizz
    document.reg_testdate3.DD3.value = "未定义";
}
if(document.attachEvent)
    window.attachEvent("onload", YYYYMMDDstart3);
else
    window.addEventListener('load', YYYYMMDDstart3, false);
function YYYYDD3(str) //年发生变化时日期发生变化(主要是判断闰平年)
{
    var MMvalue = document.reg_testdate3.MM3.options[document.reg_testdate3.MM3.selectedIndex].value;
    if (MMvalue == ""){ var e = document.reg_testdate3.DD3; optionsClear3(e); return;}
    var n = MonHead[MMvalue - 1];
    if (MMvalue ==2 && IsPinYear(str)) n++;
    writeDay3(n)
}
function MMDD3(str)   //月发生变化时日期联动
{
    var YYYYvalue = document.reg_testdate3.YYYY3.options[document.reg_testdate3.YYYY3.selectedIndex].value;
    if (YYYYvalue == ""){ var e = document.reg_testdate3.DD3; optionsClear3(e); return;}
    var n = MonHead[str - 1];
    if (str ==2 && IsPinYear3(YYYYvalue)) n++;
    writeDay3(n)
}
function writeDay3(n)   //据条件写日期的下拉框
{
    var e = document.reg_testdate3.DD3; optionsClear3(e);
    for (var i=1; i<(n+1); i++)
        e.options.add(new Option(" "+ i + " 日", i));
}
function IsPinYear3(year)//判断是否闰平年
{     return(0 == year%4 && (year%100 !=0 || year%400 == 0));}
function optionsClear3(e)
{
    e.options.length = 1;
}

function YYYYMMDDstart4()
{
    MonHead = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

    var y  = new Date().getFullYear();
    for (var i = (y-10); i < (y+10); i++) //以今年为准，前10年，后10年
        document.reg_testdate3.YYYY4.options.add(new Option(" "+ i +" 年", i));

//赋月份的下拉框
    for (var i = 1; i < 13; i++)
        document.reg_testdate3.MM4.options.add(new Option(" " + i + " 月", i));

    document.reg_testdate3.YYYY4.value = "未定义";
    document.reg_testdate3.MM4.value = "未定义";
    var n = MonHead[new Date().getMonth()];
    var YYYYvalue = new Date().getFullYear();
    if (new Date().getMonth() ==1 && IsPinYear4(YYYYvalue)) n++;
    writeDay4(n); //赋日期下拉框Author:meizz
    document.reg_testdate3.DD4.value = "未定义";
}
if(document.attachEvent)
    window.attachEvent("onload", YYYYMMDDstart4);
else
    window.addEventListener('load', YYYYMMDDstart4, false);
function YYYYDD4(str) //年发生变化时日期发生变化(主要是判断闰平年)
{
    var MMvalue = document.reg_testdate3.MM4.options[document.reg_testdate3.MM4.selectedIndex].value;
    if (MMvalue == ""){ var e = document.reg_testdate3.DD4; optionsClear4(e); return;}
    var n = MonHead[MMvalue - 1];
    if (MMvalue ==2 && IsPinYear(str)) n++;
    writeDay4(n)
}
function MMDD4(str)   //月发生变化时日期联动
{
    var YYYYvalue = document.reg_testdate3.YYYY4.options[document.reg_testdate3.YYYY4.selectedIndex].value;
    if (YYYYvalue == ""){ var e = document.reg_testdate3.DD4; optionsClear4(e); return;}
    var n = MonHead[str - 1];
    if (str ==2 && IsPinYear4(YYYYvalue)) n++;
    writeDay4(n)
}
function writeDay4(n)   //据条件写日期的下拉框
{
    var e = document.reg_testdate3.DD4; optionsClear4(e);
    for (var i=1; i<(n+1); i++)
        e.options.add(new Option(" "+ i + " 日", i));
}
function IsPinYear4(year)//判断是否闰平年
{     return(0 == year%4 && (year%100 !=0 || year%400 == 0));}
function optionsClear4(e)
{
    e.options.length = 1;
}