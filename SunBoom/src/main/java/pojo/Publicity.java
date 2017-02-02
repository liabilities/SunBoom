package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/2/2.
 */
public class Publicity {

    private int publicityID;
    private int activityID;
    private Date publishTime;
    private String detailPath;
    private int clickNum;
    private Date lastReplyTime;

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

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getDetailPath() {
        return detailPath;
    }

    public void setDetailPath(String detailPath) {
        this.detailPath = detailPath;
    }

    public int getClickNum() {
        return clickNum;
    }

    public void setClickNum(int clickNum) {
        this.clickNum = clickNum;
    }

    public Date getLastReplyTime() {
        return lastReplyTime;
    }

    public void setLastReplyTime(Date lastReplyTime) {
        this.lastReplyTime = lastReplyTime;
    }
}
