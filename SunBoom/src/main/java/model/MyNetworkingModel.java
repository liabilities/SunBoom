package model;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/1/14.
 */
public class MyNetworkingModel {
    //好像没有方法用到啊？

    public String networkingID;
    public String networkingName;
    public Date respondingEndTime;
    public Date startTime;
    public List<String> respondIDs;
    public String coteamID;

    public MyNetworkingModel(String networkingID,String networkingName,Date respondingEndTime,
                             Date startTime,List<String> respondIDs,String coteamID){
        this.networkingID = networkingID;
        this.networkingName = networkingName;
        this.respondingEndTime = respondingEndTime;
        this.startTime = startTime;
        this.respondIDs = respondIDs;
        this.coteamID = coteamID;
    }
}
