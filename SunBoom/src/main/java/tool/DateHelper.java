package tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zs on 2016/7/14.
 */
public class DateHelper{
    //日期计算相差多少天
    public static int daysBetween(String sdate,String bdate) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(sdate));
        long time1 = cal.getTimeInMillis();
        cal.setTime(sdf.parse(bdate));
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);
        return Integer.parseInt(String.valueOf(between_days));
    }
    //日期分析
    public static String daysAnalyse(String sdate,String bdate){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        String time=sdf.format(date);
        int i=0;
        int j=0;
        int z=0;
        try {
            i=DateHelper.daysBetween(time,sdate);
            j=DateHelper.daysBetween(time,bdate);
            z=DateHelper.daysBetween(sdate,bdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(i>0)
            return "项目还有 "+i+" 天开始";
        if(i<=0&&j>0)
            return "项目还有 "+j+" 天结束";
        if(j<0)
            return "项目已结束";
        return "项目将于今晚结束";
    }

    public static Date String2Date(String str) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(str);
            return date;
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static String Date2String(Date date) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
}
