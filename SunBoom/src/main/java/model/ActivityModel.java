package model;

import java.util.Date;

/**
 * 创建活动
 * Created by lenovo on 2017/1/13.
 */
public class ActivityModel {

    /**
     * 活动名称
     */
    public String activityName;

    /**
     * 活动开始时间
     */
    public Date activityStartTime;

    /**
     * 活动结束时间
     */
    public Date activityEndTime;

    /**
     * 活动简介
     */
    public String activityBreif;

    /**
     * 活动类型
     */
    public String activityType;

    /**
     * 活动规模
     */
    public int minScale;

    /**
     * 活动地点
     */
    public String activityPlace;

    /**
     * 活动所需资金
     */
    public double capitalNeeded;

    /**
     * 赞助截止日期
     */
    public Date sponsorEndDate;

    /**
     * 联系方式
     */
    public String contact;

    public ActivityModel(String activityName,Date activityStartTime,Date activityEndTime,
                         String activityBreif,String activityType,int minScale,String activityPlace,
                         double capitalNeeded,Date sponsorEndDate,String contact){
        this.activityName = activityName;
        this.activityStartTime = activityStartTime;
        this.activityEndTime = activityEndTime;
        this.activityBreif = activityBreif;
        this.activityType = activityType;
        this.minScale = minScale;
        this.activityPlace = activityPlace;
        this.capitalNeeded = capitalNeeded;
        this.sponsorEndDate = sponsorEndDate;
        this.contact = contact;
    }

}
