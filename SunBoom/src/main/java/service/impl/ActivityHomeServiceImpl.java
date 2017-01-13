package service.impl;

import dao.ActivityDAO;
import dao.GroupDAO;
import dao.impl.ActivityDAOImpl;
import dao.impl.GroupDAOImpl;
import enums.ResultMsg;
import model.GroupModel;
import pojo.Activity;
import pojo.Group;
import service.ActivityHomeService;

/**
 * Created by cuihua on 2017/1/13.
 */
public class ActivityHomeServiceImpl implements ActivityHomeService {

    ActivityDAO activityDAO;
    GroupDAO groupDAO;

    public ActivityHomeServiceImpl() {
        activityDAO = new ActivityDAOImpl();
        groupDAO = new GroupDAOImpl();
    }

    public GroupModel getBasicInfo(String groupID) {
        return new GroupModel(groupDAO.findPo(Integer.parseInt(groupID)));
    }

    public ResultMsg saveBasicInfo(GroupModel groupModel) {
        boolean result = groupDAO.updatePo(new Group(groupModel));

        if (result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

    public String getDetailInfo(String activityID) {
        Activity activity = activityDAO.findPo(Integer.parseInt(activityID));
        return activity.getDetailPath();
    }

    public ResultMsg saveDetailInfo(String activityID, String detailHTMLPath) {
        Activity activity = activityDAO.findPo(Integer.parseInt(activityID));
        activity.setDetailPath(detailHTMLPath);
        boolean result = activityDAO.updatePo(activity);

        if (result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

}