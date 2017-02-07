package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/1/16.
 */
public class Sponsor {
    private int sponsorID;
    private int groupID;
    private int neededMoney;
    private Date startTime;
    private Date deadline;
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
