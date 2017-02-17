package model;

import pojo.Networking;
import utilities.enums.Place;

import java.util.Date;

/**
 * 数据库中对应的networking表项属性
 * Created by lenovo on 2017/1/13.
 * Last changed by charles.
 * Updating time: 2017/2/17.
 */
public class NetworkingModel {

    /**
     * 联谊ID
     */
    public String networkingID;

    /**
     * 联谊的名称
     */
    public String name;

    /**
     * 联谊类型
     */
    public String type;

    /**
     * 联谊地点类型
     */
    public Place place;

    /**
     * 发起团队ID
     */
    public String groupID;

    /**
     * 联谊面向对象类型
     */
    public int range;

    /**
     * 联谊状态
     */
    public int state;

    /**
     * 发布时间
     */
    public Date announceTime;

    /**
     * 联谊开始时间
     */
    public Date startTime;

    /**
     * 联谊结束时间
     */
    public Date endTime;

    /**
     * 停止响应时间
     */
    public Date respondingDeadline;

    /**
     * 最近更新时间
     */
    public Date lastUpdateTime;

    /**
     * 一句话简介
     */
    public String introduction;

    /**
     * 简介图片路径
     */
    public String introPhotoPath;

    /**
     * 详情路径
     */
    public String detailPath;

    /**
     * 最小规模
     */
    public int minScale;

    /**
     * 最大规模
     */
    public int maxScale;

    /**
     * 发起者要参加的活动人数
     */
    public int presentHostNum;

    /**
     * 响应团队数量
     */
    public int responsorNum;

    /**
     * 最终确定的要与之联谊的团队ID
     */
    public int partnerID;

    public NetworkingModel(String networkigID, String networkingName, String networkingType, Place networkingPlace,
                           String groupID, int range, int state, Date announceTime, Date respondingDeadline,
                           Date startTime, Date endTime, Date lastUpdateTime, String introduction,
                           String introPhotoPath, String detailPath,int minScale,int maxScale,int presentHostNum,
                           int responsorNum, int partnerID){
        this.networkingID = networkigID;
        this.name = networkingName;
        this.type = networkingType;
        this.place = networkingPlace;
        this.groupID = groupID;
        this.range = range;
        this.state = state;
        this.announceTime = announceTime;
        this.respondingDeadline = respondingDeadline;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lastUpdateTime = lastUpdateTime;
        this.introduction = introduction;
        this.introPhotoPath = introPhotoPath;
        this.detailPath = detailPath;
        this.minScale = minScale;
        this.maxScale = maxScale;
        this.presentHostNum = presentHostNum;
        this.responsorNum = responsorNum;
        this.partnerID = partnerID;
    }

    public NetworkingModel(Networking networking) {
        this.networkingID = String.valueOf(networking.getNetworkingID());
        this.name = networking.getName();
        this.type = networking.getType();
        this.place = Place.getEnum(networking.getPlace());
        this.groupID = String.valueOf(networking.getGroupID());
        this.range = networking.getRange();
        this.state = networking.getState();
        this.announceTime = networking.getAnnounceTime();
        this.respondingDeadline = networking.getRespondingDeadline();
        this.startTime = networking.getStartTime();
        this.endTime = networking.getEndTime();
        this.lastUpdateTime = networking.getLastUpdateTime();
        this.introduction = networking.getIntroduction();
        this.introPhotoPath = networking.getIntroPhotoPath();
        this.detailPath = networking.getDetailPath();
        this.minScale = networking.getMinScale();
        this.maxScale = networking.getMaxScale();
        this.presentHostNum = networking.getPresentHostNum();
        this.responsorNum = networking.getResponsorNum();
        this.partnerID = networking.getPartnerID();
    }
}
