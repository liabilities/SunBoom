function YYYYMMDDstart()
{
    MonHead = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

    var y  = new Date().getFullYear();
    for (var i = (y-10); i < (y+10); i++) //以今年为准，前10年，后10年
        document.reg_testdate.YYYY.options.add(new Option(" "+ i +" 年", i));

//赋月份的下拉框
    for (var i = 1; i < 13; i++)
        document.reg_testdate.MM.options.add(new Option(" " + i + " 月", i));

    document.reg_testdate.YYYY.value = y;
    document.reg_testdate.MM.value = new Date().getMonth() + 1;
    var n = MonHead[new Date().getMonth()];
    if (new Date().getMonth() ==1 && IsPinYear(YYYYvalue)) n++;
    writeDay(n); //赋日期下拉框Author:meizz
    document.reg_testdate.DD.value = new Date().getDate();
}
if(document.attachEvent)
    window.attachEvent("onload", YYYYMMDDstart);
else
    window.addEventListener('load', YYYYMMDDstart, false);
function YYYYDD(str) //年发生变化时日期发生变化(主要是判断闰平年)
{
    var MMvalue = document.reg_testdate.MM.options[document.reg_testdate.MM.selectedIndex].value;
    if (MMvalue == ""){ var e = document.reg_testdate.DD; optionsClear(e); return;}
    var n = MonHead[MMvalue - 1];
    if (MMvalue ==2 && IsPinYear(str)) n++;
    writeDay(n)
}
function MMDD(str)   //月发生变化时日期联动
{
    var YYYYvalue = document.reg_testdate.YYYY.options[document.reg_testdate.YYYY.selectedIndex].value;
    if (YYYYvalue == ""){ var e = document.reg_testdate.DD; optionsClear(e); return;}
    var n = MonHead[str - 1];
    if (str ==2 && IsPinYear(YYYYvalue)) n++;
    writeDay(n)
}
function writeDay(n)   //据条件写日期的下拉框
{
    var e = document.reg_testdate.DD; optionsClear(e);
    for (var i=1; i<(n+1); i++)
        e.options.add(new Option(" "+ i + " 日", i));
}
function IsPinYear(year)//判断是否闰平年
{     return(0 == year%4 && (year%100 !=0 || year%400 == 0));}
function optionsClear(e)
{
    e.options.length = 1;
}

//结束时间

function YYYYMMDDstart2()
{
    MonHead = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

    var y  = new Date().getFullYear();
    for (var i = (y-10); i < (y+10); i++) //以今年为准，前10年，后10年
        document.reg_testdate2.YYYY2.options.add(new Option(" "+ i +" 年", i));

//赋月份的下拉框
    for (var i = 1; i < 13; i++)
        document.reg_testdate2.MM2.options.add(new Option(" " + i + " 月", i));

    document.reg_testdate2.YYYY2.value = y;
    document.reg_testdate2.MM2.value = new Date().getMonth() + 1;
    var n = MonHead[new Date().getMonth()];
    if (new Date().getMonth() ==1 && IsPinYear2(YYYYvalue)) n++;
    writeDay(n); //赋日期下拉框Author:meizz
    document.reg_testdate2.DD2.value = new Date().getDate();
}
if(document.attachEvent)
    window.attachEvent("onload", YYYYMMDDstart2);
else
    window.addEventListener('load', YYYYMMDDstart2, false);
function YYYYDD2(str) //年发生变化时日期发生变化(主要是判断闰平年)
{
    var MMvalue = document.reg_testdate2.MM2.options[document.reg_testdate.MM.selectedIndex].value;
    if (MMvalue == ""){ var e = document.reg_testdate2.DD2; optionsClear2(e); return;}
    var n = MonHead[MMvalue - 1];
    if (MMvalue ==2 && IsPinYear(str)) n++;
    writeDay2(n)
}
function MMDD2(str)   //月发生变化时日期联动
{
    var YYYYvalue = document.reg_testdate2.YYYY2.options[document.reg_testdate2.YYYY2.selectedIndex].value;
    if (YYYYvalue == ""){ var e = document.reg_testdate2.DD2; optionsClear2(e); return;}
    var n = MonHead[str - 1];
    if (str ==2 && IsPinYear2(YYYYvalue)) n++;
    writeDay2(n)
}
function writeDay2(n)   //据条件写日期的下拉框
{
    var e = document.reg_testdate2.DD2; optionsClear2(e);
    for (var i=1; i<(n+1); i++)
        e.options.add(new Option(" "+ i + " 日", i));
}
function IsPinYear2(year)//判断是否闰平年
{     return(0 == year%4 && (year%100 !=0 || year%400 == 0));}
function optionsClear2(e)
{
    e.options.length = 1;
}