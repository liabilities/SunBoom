package model;

import dao.SponsorDAO;
import dao.impl.SponsorDAOImpl;
import pojo.Activity;
import pojo.Sponsor;
import utilities.enums.ActivityInitiatorType;
import utilities.enums.Place;
import utilities.exceptions.NotExistException;

import java.util.Date;

/**
 * Created by lenovo on 2017/1/13.
 * Last changed by charles.
 * Updating time: 2017/2/18.
 */
public class ActivityModel {

    /**
     * 活动ID
     */
    public String activityID;

    /**
     * 活动名称
     */
    public String name;

    /**
     * 发起人／团队ID
     */
    public String initiatorID;

    /**
     * 发起人类型
     */
    public ActivityInitiatorType initiatorType;

    /**
     * 活动最小规模
     */
    public int minScale;

    /**
     * 活动最大规模
     */
    public int maxScale;

    /**
     * 活动类型
     */
    public String type;

    /**
     * 活动地点类型
     */
    public Place place;

    /**
     * 活动开始时间
     */
    public Date startTime;

    /**
     * 活动结束时间
     */
    public Date endTime;

    /**
     * 活动一句话简介
     */
    public String brief;

    /**
     * 活动详情路径
     */
    public String detailPath;

    /**
     * 赞助详情ID
     */
    public String sponsorID;

    /**
     * 活动所需资金
     */
    public int neededMoney;

    /**
     * 赞助开始日期
     */
    public Date sponsorStartDate;

    /**
     * 赞助截止日期
     */
    public Date sponsorEndDate;

    /**
     * 最终赞助商ID(businessID)
     */
    public String businessID;

    /**
     * 关注人数
     */
    public int fellowNum;

    /**
     * 点赞人数
     */
    public int likeNum;

    /**
     * 推广信息路径
     */
    public String promotePath;

    /**
     * 用于生成一个活动
     */
    public ActivityModel(String name, String initiatorID, ActivityInitiatorType initiatorType, int minScale,
                         int maxScale, String type, Place place, Date startTime, Date endTime, String brief,
                         String detailPath) {
        this.name = name;
        this.initiatorID = initiatorID;
        this.initiatorType = initiatorType;
        this.minScale = minScale;
        this.maxScale = maxScale;
        this.type = type;
        this.place = place;
        this.startTime = startTime;
        this.endTime = endTime;
        this.brief = brief;
        this.detailPath = detailPath;

        //已默认的形式存取
        this.sponsorID = null;
        this.neededMoney = -1;
        this.sponsorStartDate = new Date(1970,1,1,12,0,0);
        this.sponsorEndDate = new Date(1970,1,1,12,0,0);
        this.businessID = null;
        this.fellowNum = -1;
        this.likeNum = -1;
        this.promotePath = null;
    }


    public ActivityModel(String activityID, String name, String initiatorID, ActivityInitiatorType initiatorType,
                         int minScale, int maxScale, String type, Place place, Date startTime, Date endTime,
                         String brief, String detailPath, String sponsorID, int fellowNum, int likeNum,
                         String promotePath) {
        this.activityID = activityID;
        this.name = name;
        this.initiatorID = initiatorID;
        this.initiatorType = initiatorType;
        this.minScale = minScale;
        this.maxScale = maxScale;
        this.type = type;
        this.place = place;
        this.startTime = startTime;
        this.endTime = endTime;
        this.brief = brief;
        this.detailPath = detailPath;
        this.fellowNum = fellowNum;
        this.likeNum = likeNum;
        this.promotePath = promotePath;

        //赞助相关
        this.sponsorID = sponsorID;
        SponsorDAO sponsorDAO = new SponsorDAOImpl();
        Sponsor thisSponsor = null;
        try {
            thisSponsor = sponsorDAO.getById(sponsorID);
        } catch (NotExistException e) {
            e.printStackTrace();
        }
        this.neededMoney = thisSponsor.getNeededMoney();
        this.sponsorStartDate = thisSponsor.getStartTime();
        this.sponsorEndDate = thisSponsor.getDeadline();
        this.businessID = String.valueOf(thisSponsor.getBusinessID());
    }

    /**
     * 用于从底层往上层传
     */
    public ActivityModel(Activity activity) {
        this.activityID = String.valueOf(activity.getActivityID());
        this.name = activity.getName();
        this.initiatorID = String.valueOf(activity.getInitiatorID());
        this.initiatorType = ActivityInitiatorType.getEnum(activity.getInitiatorType());
        this.minScale = activity.getMinScale();
        this.maxScale = activity.getMaxScale();
        this.type = activity.getType();
        this.place = Place.getEnum(activity.getPlace());
        this.startTime = activity.getStartTime();
        this.endTime = activity.getEndTime();
        this.brief = activity.getBrief();
        this.detailPath = activity.getDetailPath();

        try {
            this.fellowNum = activity.getFellowNum();
            this.likeNum = activity.getLikeNum();
            this.promotePath = activity.getPromotePath();

            this.sponsorID = String.valueOf(activity.getSponsorID());
            SponsorDAO sponsorDAO = new SponsorDAOImpl();
            Sponsor thisSponsor = null;
            try {
                thisSponsor = sponsorDAO.getById(sponsorID);
            } catch (NotExistException e) {
                e.printStackTrace();
            }
            this.neededMoney = thisSponsor.getNeededMoney();
            this.sponsorStartDate = thisSponsor.getStartTime();
            this.sponsorEndDate = thisSponsor.getDeadline();
            this.businessID = String.valueOf(thisSponsor.getBusinessID());
        } catch (NullPointerException exception) {
            this.sponsorID = null;
            this.neededMoney = -1;
            this.sponsorStartDate = new Date(1970,1,1,12,0,0);
            this.sponsorEndDate = new Date(1970,1,1,12,0,0);
            this.businessID = null;
            this.fellowNum = -1;
            this.likeNum = -1;
            this.promotePath = null;
        }

    }

}
