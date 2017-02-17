package model;

import pojo.Networking;

import java.util.Date;

/**
 * Created by lenovo on 2017/1/13.
 */
public class NetworkingGeneralModel {

    /**
     * 联谊ID
     */
    public String networkingID;

    /**
     * 联谊的名称
     */
    public String networkingName;

    /**
     * 联谊开始时间
     */
    public Date startTime;

    /**
     * 发起者要参加的活动人数
     */
    public int presentHostNum;

    /**
     * 发起团队ID
     */
    public String groupID;

    /**
     * 一句话简介
     */
    public String introduction;

    /**
     * 简介图片路径
     */
    public String introPhotoPath;

    public NetworkingGeneralModel(String networkingID, String networkingName, Date startTime, int presentHostNum,
                                  String groupID, String introduction, String introPhotoPath) {
        this.networkingID = networkingID;
        this.networkingName = networkingName;
        this.startTime = startTime;
        this.presentHostNum = presentHostNum;
        this.groupID = groupID;
        this.introduction = introduction;
        this.introPhotoPath = introPhotoPath;
    }

    public NetworkingGeneralModel(Networking networking) {
        this.networkingID = String.valueOf(networking.getNetworkingID());
        this.networkingName = networking.getName();
        this.startTime = networking.getStartTime();
        this.presentHostNum = networking.getPresentHostNum();
        this.groupID = String.valueOf(networking.getGroupID());
        this.introduction = networking.getIntroduction();
        this.introPhotoPath = networking.getIntroPhotoPath();
    }
}
