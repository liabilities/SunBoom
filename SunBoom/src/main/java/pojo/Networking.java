package pojo;

import model.NetworkingModel;
import utilities.enums.Place;

import java.util.Date;

/**
 * Created by cuihua on 2017/1/11.
 * Last changed by charles.
 * Updating time: 2017/2/17.
 */
public class Networking {

    /**
     * 联谊ID
     */
    private int networkingID;

    /**
     * 联谊的名称
     */
    private String name;

    /**
     * 联谊类型
     */
    private String type;

    /**
     * 联谊地点类型
     */
    private int place;

    /**
     * 发起团队ID
     */
    private int groupID;

    /**
     * 联谊面向对象类型
     */
    private int range;

    /**
     * 联谊状态
     */
    private int state;

    /**
     * 发布时间
     */
    private Date announceTime;

    /**
     * 联谊开始时间
     */
    private Date startTime;

    /**
     * 联谊结束时间
     */
    private Date endTime;

    /**
     * 停止响应时间
     */
    private Date respondingDeadline;

    /**
     * 最近更新时间
     */
    private Date lastUpdateTime;

    /**
     * 一句话简介
     */
    private String introduction;

    /**
     * 简介图片路径
     */
    private String introPhotoPath;

    /**
     * 详情路径
     */
    private String detailPath;

    /**
     * 最小规模
     */
    private int minScale;

    /**
     * 最大规模
     */
    private int maxScale;

    /**
     * 发起者要参加的活动人数
     */
    private int presentHostNum;

    /**
     * 响应团队数量
     */
    private int responsorNum;

    /**
     * 最终确定的要与之联谊的团队ID
     */
    private int partnerID;

    public Networking(NetworkingModel networkingModel) {
        this.networkingID = Integer.parseInt(networkingModel.networkingID);
        this.name = networkingModel.name;
        this.type = networkingModel.type;
        this.place = networkingModel.place.getRepresentNum();
        this.groupID = Integer.parseInt(networkingModel.groupID);
        this.range = networkingModel.range;
        this.state = networkingModel.state;
        this.announceTime = networkingModel.announceTime;
        this.respondingDeadline = networkingModel.respondingDeadline;
        this.startTime = networkingModel.startTime;
        this.endTime = networkingModel.endTime;
        this.lastUpdateTime = networkingModel.lastUpdateTime;
        this.introduction = networkingModel.introduction;
        this.introPhotoPath = networkingModel.introPhotoPath;
        this.detailPath = networkingModel.detailPath;
        this.minScale = networkingModel.minScale;
        this.maxScale = networkingModel.maxScale;
        this.responsorNum = networkingModel.presentHostNum;
    }

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

    public Date getRespondingDeadline() {
        return respondingDeadline;
    }

    public void setRespondingDeadline(Date respondingDeadline) {
        this.respondingDeadline = respondingDeadline;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getIntroPhotoPath() {
        return introPhotoPath;
    }

    public void setIntroPhotoPath(String introPhotoPath) {
        this.introPhotoPath = introPhotoPath;
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

    public int getPresentHostNum() {
        return presentHostNum;
    }

    public void setPresentHostNum(int presentHostNum) {
        this.presentHostNum = presentHostNum;
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
