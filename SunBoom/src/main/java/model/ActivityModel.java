package model;

import java.util.Date;

/**
 * 创建活动
 * Created by lenovo on 2017/1/13.
 */
public class ActivityModel {

    /**
     * 活动ID
     */
    public String activityID;

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
     * 发起人ID
     */
    private String initiatorID;

    /**
     * 发起人类型
     */
    private String initiatorType;

    /**
     * 活动规模
     */
    public int minScale;

    /**
     * 活动最大规模
     */
    public int maxScale;

    /**
     * 活动地点
     */
    public String activityPlace;


    /**
    赞助详情
     */
    private String sponsorID;

    /**
     * 关注人数
     */
    private int fellowNum;

    /**
     * 点赞人数
     */
    private int likeNum;

    public ActivityModel(String activityName,Date activityStartTime,Date activityEndTime,
                         String activityBreif,String activityType,int minScale,String activityPlace,
                         String sponsorID,int fellowNum,int likeNum){
        this.activityName = activityName;
        this.activityStartTime = activityStartTime;
        this.activityEndTime = activityEndTime;
        this.activityBreif = activityBreif;
        this.activityType = activityType;
        this.minScale = minScale;
        this.activityPlace = activityPlace;
        this.sponsorID = sponsorID;
        this.fellowNum = fellowNum;
        this.likeNum = likeNum;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public java.sql.Date getActivityStartTime_sql() {
        return new java.sql.Date(activityStartTime.getTime());
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public java.sql.Date getActivityEndTime_sql() {
        return new java.sql.Date(activityEndTime.getTime());
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public String getActivityBreif() {
        return activityBreif;
    }

    public void setActivityBreif(String activityBreif) {
        this.activityBreif = activityBreif;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public int getMinScale() {
        return minScale;
    }

    public void setMinScale(int minScale) {
        this.minScale = minScale;
    }

    public String getActivityPlace() {
        return activityPlace;
    }

    public int getActivityPlace_int() {
        return  Integer.parseInt(activityPlace);
    }

    public void setActivityPlace(String activityPlace) {
        this.activityPlace = activityPlace;
    }


    public String getSponsorID() {
        return sponsorID;
    }

    public int getSponsorID_int() {
        return Integer.parseInt(sponsorID);
    }

    public void setSponsorID(String activityID) {
        this.sponsorID = sponsorID;
    }

    public int getFellowNum() {
        return fellowNum;
    }

    public void setFellowNum(int fellowNum) {
        this.fellowNum = fellowNum;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }



    public String getActivityID() {
        return activityID;
    }

    public int getActivityID_int() {
        return Integer.parseInt(activityID);
    }

    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    public String getInitiatorID() {
        return initiatorID;
    }

    public int getInitiatorID_int() {
        return Integer.parseInt(initiatorID);
    }

    public void setInitiatorID(String initiatorID) {
        this.initiatorID = initiatorID;
    }

    public String getInitiatorType() {
        return initiatorType;
    }

    public int getInitiatorType_int() {
        return Integer.parseInt(initiatorType);
    }

    public void setInitiatorType(String initiatorType) {
        this.initiatorType = initiatorType;
    }

    public int getMaxScale() {
        return maxScale;
    }

    public void setMaxScale(int maxScale) {
        this.maxScale = maxScale;
    }
}
