package tool;

import enums.ProjectState;
import javafx.scene.chart.PieChart;
import org.hibernate.type.descriptor.java.DataHelper;

import javax.activation.DataHandler;
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
    //状态分析
    public static ProjectState stateAnalyse(String sdate, String bdate){
        String result=DateHelper.daysAnalyse(sdate,bdate);

        if(result.endsWith("开始"))
            return ProjectState.NotStart;
        else if(result.endsWith("已结束"))
            return ProjectState.Over;
        else
            return ProjectState.Starting;
    }
    //测试
    public static void main(String[] args){
//        int day=0;
//        int day2=0;
//        int day3=0;
//        int day4=0;
//        try {
//            day=DateHelper.daysBetween("2015-02-23","2015-02-23");
//            day2=DateHelper.daysBetween("2015-02-23","2015-02-24");
//            day3=DateHelper.daysBetween("2016-02-23","2016-03-23");
//            day4=DateHelper.daysBetween("2015-02-23","2016-02-24");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(day);
//        System.out.println(day2);
//        System.out.println(day3);
//        System.out.println(day4);
//        System.out.println(DateHelper.daysAnalyse("2016-07-02","2016-07-13"));
//        System.out.println(DateHelper.daysAnalyse("2016-07-03","2016-07-14"));
//        System.out.println(DateHelper.daysAnalyse("2016-07-14","2016-08-09"));
//        System.out.println(DateHelper.daysAnalyse("2016-07-24","2016-07-16"));
        System.out.println(DateHelper.stateAnalyse("2016-07-02","2016-07-13"));
        System.out.println(DateHelper.stateAnalyse("2016-07-03","2016-07-15"));
        System.out.println(DateHelper.stateAnalyse("2016-07-15","2016-08-09"));
        System.out.println(DateHelper.stateAnalyse("2016-07-24","2016-07-16"));
    }

}
