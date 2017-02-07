package pojo;

import utilities.enums.NetWorkingState;
import utilities.enums.ParticipantRange;
import utilities.enums.Place;

import java.awt.*;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by cuihua on 2017/1/11.
 * Last changed by zoetx.
 * Updating time: 2017/1/31.
 */
public class Networking {

    private int networkingID;
    private String name;
    private String type;
    private int place;
    private int groupID;
    private int range;
    private int state;
    private Date announceTime;
    private Date startTime;
    private Date endTime;
    private Date deadline;
    private String introduction;
    private String detailPath;
    private int minScale;
    private int maxScale;
    private int presentNum;
    private int responsorNum;
    private int partnerID;

    public int getNetworkingID() {
        return networkingID;
    }

    public void setNetworkingID(int networkingID) {
        this.networkingID = networkingID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getAnnounceTime() {
        return announceTime;
    }

    public void setAnnounceTime(Date announceTime) {
        this.announceTime = announceTime;
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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getDetailPath() {
        return detailPath;
    }

    public void setDetailPath(String detailPath) {
        this.detailPath = detailPath;
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

    public int getPresentNum() {
        return presentNum;
    }

    public void setPresentNum(int presentNum) {
        this.presentNum = presentNum;
    }

    public int getResponsorNum() {
        return responsorNum;
    }

    public void setResponsorNum(int responsorNum) {
        this.responsorNum = responsorNum;
    }

    public int getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(int partnerID) {
        this.partnerID = partnerID;
    }

}
