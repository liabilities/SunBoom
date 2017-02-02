package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/2/2.
 */
public class Axis {
    private int axisID;
    private int publicityID;
    private int activityID;
    private int serial;
    private Date time;
    private int type;

    public int getAxisID() {
        return axisID;
    }

    public void setAxisID(int axisID) {
        this.axisID = axisID;
    }

    public int getPublicityID() {
        return publicityID;
    }

    public void setPublicityID(int publicityID) {
        this.publicityID = publicityID;
    }

    public int getActivityID() {
        return activityID;
    }

    public void setActivityID(int activityID) {
        this.activityID = activityID;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
