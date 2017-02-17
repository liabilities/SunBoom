package model;

import pojo.Networking;

import java.util.Date;

/**
 * Created by lenovo on 2017/1/13.
 */
public class NetworkingGeneralModel {

    public String networkingID;
    public String networkingName;
    public Date startTime;
    public int memberNum;
    public String groupID;
    public String introduction;

    public NetworkingGeneralModel(String networkingID, String networkingName, Date startTime,
                                  int memberNum, String groupID, String introduction){
        this.networkingID = networkingID;
        this.networkingName = networkingName;
        this.startTime = startTime;
        this.memberNum = memberNum;
        this.groupID = groupID;
        this.introduction = introduction;
    }

    public NetworkingGeneralModel(Networking networking) {
        this.networkingID = String.valueOf(networking.getNetworkingID());
        this.networkingName = networking.getName();
        this.startTime = networking.getStartTime();
        this.memberNum = networking.getPresentNum();
        this.groupID = String.valueOf(networking.getGroupID());
        this.introduction = networking.getIntroduction();
    }
}
