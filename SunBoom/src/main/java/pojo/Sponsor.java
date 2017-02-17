package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/1/16.
 * Last changed by charles.
 * Updating time: 2017/2/17.
 */
public class Sponsor {

    /**
     * 活动中赞助详情ID
     */
    private int sponsorID;

    /**
     * 活动团队ID
     */
    private int groupID;

    /**
     * 需要的资金
     */
    private int neededMoney;

    /**
     * 赞助开始时间
     */
    private Date startTime;

    /**
     * 赞助结束时间
     */
    private Date deadline;

    /**
     * 最终赞助商ID
     */
    private int businessID;

    public int getSponsorID() {
        return sponsorID;
    }

    public void setSponsorID(int sponsorID) {
        this.sponsorID = sponsorID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getNeededMoney() {
        return neededMoney;
    }

    public void setNeededMoney(int neededMoney) {
        this.neededMoney = neededMoney;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getBusinessID() {
        return businessID;
    }

    public void setBusinessID(int businessID) {
        this.businessID = businessID;
    }

}
