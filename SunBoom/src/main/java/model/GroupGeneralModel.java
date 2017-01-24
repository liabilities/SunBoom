package model;

import java.util.List;

/**
 * 很多个团体时的团体概况信息
 * Created by lenovo on 2017/1/13.
 */
public class GroupGeneralModel {

    public List<GroupModel> groupModelList;

    public GroupGeneralModel(List<GroupModel> groupModelList){
        this.groupModelList = groupModelList;
    }
}
