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
    public String name;

    /**
     * 活动开始时间
     */
    public Date startTime;

    /**
     * 活动简介
     */
    public String brief;

    /**
     * 活动类型
     */
    public String type;

    /**
     * 活动地点
     */
    public Place place;

    public ActivityGeneralModel(String name, Date startTime, String brief, String type, Place place){
        this.name = name;
        this.startTime = startTime;
        this.brief = brief;
        this.type = type;
        this.place = place;
    }

    public ActivityGeneralModel(Activity activity){
        this.name = activity.getName();
        this.startTime = activity.getStartTime();
        this.brief = activity.getDetailPath();
        this.type = activity.getType();
        this.place = Place.getEnum(activity.getPlace());
    }
}
