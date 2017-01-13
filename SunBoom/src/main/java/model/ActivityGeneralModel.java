package model;

import java.util.Date;

/**
 * 活动简介
 * Created by lenovo on 2017/1/13.
 */
public class ActivityGeneralModel {

    /**
     * 活动名称
     */
    public String activityName;

    /**
     * 活动开始时间
     */
    public Date activityStartTime;

    /**
     * 活动简介
     */
    public String activityBreif;

    /**
     * 活动类型
     */
    public String activityType;

    /**
     * 活动地点
     */
    public String activityPlace;

    public ActivityGeneralModel(String activityName,Date activityStartTime,
                         String activityBreif,String activityType,String activityPlace){
        this.activityName = activityName;
        this.activityStartTime = activityStartTime;
        this.activityBreif = activityBreif;
        this.activityType = activityType;
        this.activityPlace = activityPlace;
    }

}
