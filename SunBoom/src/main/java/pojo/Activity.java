package pojo;

import java.sql.Date;

/**
 * Created by zoetx on 2017/1/12.
 */
public class Activity {
    private int activityID;
    private String name;
    private int initiatorID;
    private int initiatorType;
    private int minScale;
    private int maxScale;
    private String type;
    private int place;
    private Date startTime;
    private Date endTime;
    private String detailPath;
    private int capital;

    public int getActivityID() {
        return activityID;
    }

    public void setActivityID(int activityID) {
        this.activityID = activityID;
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

    public String getDetailPath() {
        return detailPath;
    }

    public void setDetailPath(String detailPath) {
        this.detailPath = detailPath;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }


}