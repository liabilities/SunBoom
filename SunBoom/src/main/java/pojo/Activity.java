package pojo;

import model.ActivityModel;

import java.util.Date;

/**
 * Created by zoetx on 2017/1/12.
 * Last changed by charles.
 * Updating time: 2017/2/17.
 */
public class Activity {

    /**
     * 活动ID
     */
    private int activityID;

    /**
     * 发起团队ID
     */
    private int groupID;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 发起人ID
     */
    private int initiatorID;

    /**
     * 发起人类型
     */
    private int initiatorType;

    /**
     * 活动最小规模
     */
    private int minScale;

    /**
     * 活动最大规模
     */
    private int maxScale;

    /**
     * 活动类型
     */
    private String type;

    /**
     * 活动地点类型
     */
    private int place;

    /**
     * 活动开始时间
     */
    private Date startTime;

    /**
     * 活动结束时间
     */
    private Date endTime;

    /**
     * 活动一句话简介
     */
    private String brief;

    /**
     * 活动详情路径
     */
    private String detailPath;

    /**
     * 赞助详情ID
     */
    private int sponsorID;

    /**
     * 关注人数
     */
    private int fellowNum;

    /**
     * 点赞人数
     */
    private int likeNum;

    /**
     * 推广信息路径
     */
    private String promotePath;

    public Activity(){}

    public Activity(ActivityModel activityModel){
        this.activityID = Integer.parseInt(activityModel.activityID);
        this.groupID = Integer.parseInt(activityModel.groupID);
        this.name = activityModel.name;
        this.initiatorID = Integer.parseInt(activityModel.initiatorID);
        this.initiatorType = activityModel.initiatorType.getRepresentNum();
        this.minScale = activityModel.minScale;
        this.maxScale = activityModel.maxScale;
        this.type = activityModel.type;
        this.place = activityModel.place.getRepresentNum();
        this.startTime = activityModel.startTime;
        this.endTime = activityModel.endTime;
        this.brief = activityModel.brief;
        this.detailPath = activityModel.detailPath;
        this.sponsorID = Integer.parseInt(activityModel.sponsorID);
        this.fellowNum = activityModel.fellowNum;
        this.likeNum = activityModel.likeNum;
        this.promotePath = activityModel.promotePath;
    }

    public int getActivityID() {
        return activityID;
    }

    public void setActivityID(int activityID) {
        this.activityID = activityID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInitiatorID() {
        return initiatorID;
    }

    public void setInitiatorID(int initiatorID) {
        this.initiatorID = initiatorID;
    }

    public int getInitiatorType() {
        return initiatorType;
    }

    public void setInitiatorType(int initiatorType) {
        this.initiatorType = initiatorType;
    }

    public int getMinScale() {
        return minScale;
    }

    public void setMinScale(int minScale) {
        this.minScale = minScale;
    }

    public int getMaxScale() {
        return maxScale;
    }

    public void setMaxScale(int maxScale) {
        this.maxScale = maxScale;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDetailPath() {
        return detailPath;
    }

    public void setDetailPath(String detailPath) {
        this.detailPath = detailPath;
    }

    public int getSponsorID() {
        return sponsorID;
    }

    public void setSponsorID(int sponsorID) {
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

    public String getPromotePath() {
        return promotePath;
    }

    public void setPromotePath(String promotePath) {
        this.promotePath = promotePath;
    }
}