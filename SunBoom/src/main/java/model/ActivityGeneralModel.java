package model;

import pojo.Activity;
import utilities.enums.Place;

import java.util.Date;

/**
 * 活动简介
 * Created by lenovo on 2017/1/13.
 *
 * Last changed by charles.
 * Updating time: 2017/2/8.
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
    public Place activityPlace;

    public ActivityGeneralModel(String activityName,Date activityStartTime,
                         String activityBreif,String activityType,Place activityPlace){
        this.activityName = activityName;
        this.activityStartTime = activityStartTime;
        this.activityBreif = activityBreif;
        this.activityType = activityType;
        this.activityPlace = activityPlace;
    }

    public ActivityGeneralModel(Activity activity){
        this.activityName = activity.getName();
        this.activityStartTime = activity.getStartTime();
        this.activityBreif = activity.getDetailPath();
        this.activityType = activity.getType();
        this.activityPlace = Place.getEnum(activity.getPlace());
    }
}
