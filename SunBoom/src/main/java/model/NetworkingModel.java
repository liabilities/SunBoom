package model;

import java.util.Date;

/**
 * 数据库中对应的networking表项属性
 * Created by lenovo on 2017/1/13.
 */
public class NetworkingModel {

    public String networkingID;
    public String networkingName;
    public String networkingType;
    public String networkingPlace;
    public String groupID;
    public int range;
    public int state;
    public Date announceTime;
    public Date respondingEndTime;
    public Date startTime;
    public Date endTime;
    public Date lastUpdateTime;
    public String introduction;
    public String introPhotoPath;
    public String detail;
    public int minScale;
    public int maxScale;
    public int memberNum;

    public NetworkingModel(String networkigID, String networkingName, String networkingType,
                           String networkingPlace, String groupID, int range, int state,
                           Date announceTime, Date respondingEndTime, Date startTime,
                           Date endTime, Date lastUpdateTime, String introduction,
                           String introPhotoPath, String detail,int minScale,int maxScale,int memberNum){
        this.networkingID = networkigID;
        this.networkingName = networkingName;
        this.networkingType = networkingType;
        this.networkingPlace = networkingPlace;
        this.groupID = groupID;
        this.range = range;
        this.state = state;
        this.announceTime = announceTime;
        this.respondingEndTime = respondingEndTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lastUpdateTime = lastUpdateTime;
        this.introduction = introduction;
        this.introPhotoPath = introPhotoPath;
        this.detail = detail;
        this.minScale = minScale;
        this.maxScale = maxScale;
        this.memberNum = memberNum;
    }
}
