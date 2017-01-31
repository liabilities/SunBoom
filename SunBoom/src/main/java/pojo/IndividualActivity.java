package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/1/31.
 */
public class IndividualActivity {

    private int individual_activityID;
    private int activityID;
    private Date startTime;
    private int responsorNum;
    private int neededNum;
    private int state;

    public int getIndividual_activityID() {
        return individual_activityID;
    }

    public void setIndividual_activityID(int individual_activityID) {
        this.individual_activityID = individual_activityID;
    }

    public int getActivityID() {
        return activityID;
    }

    public void setActivityID(int activityID) {
        this.activityID = activityID;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getResponsorNum() {
        return responsorNum;
    }

    public void setResponsorNum(int responsorNum) {
        this.responsorNum = responsorNum;
    }

    public int getNeededNum() {
        return neededNum;
    }

    public void setNeededNum(int neededNum) {
        this.neededNum = neededNum;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
