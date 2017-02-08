package service.impl;

import dao.ActivityDAO;
import dao.impl.ActivityDAOImpl;
import model.ActivityGeneralModel;
import model.ActivityModel;
import pojo.Activity;
import service.ActivityService;
import utilities.enums.ActivityType;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/1/23.
 * Last changed by charles.
 * Updating time: 2017/2/8.
 */
public class ActivityServiceImpl implements ActivityService {

    ActivityDAO activityDAO;

    public ActivityServiceImpl() {
        activityDAO = new ActivityDAOImpl();
    }


    // TODO 待议
    public List<ActivityGeneralModel> getActivityHistoryList(String groupID) {
        return null;
    }

    public ActivityModel getActivityDetail(String activityID) throws NotExistException {
        return new ActivityModel(activityDAO.getById(activityID));
    }

    public ResultMsg modifyUndergoingAcitivity(String activityID) {
        return null;
    }

    public ResultMsg createActivity(ActivityModel activityModel) {
        Activity activity = new Activity(activityModel);
        boolean result = activityDAO.insertOne(activity);
        if(result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

    // TODO CHarles--不知实现
    public String createTimeAxis() {
        return null;
    }

    // TODO Charles--不会使用findByProperty
    public List<String> getActivitySpecial(String groupID, ActivityType activityType) {
        return null;
    }

    // TODO Charles--不会使用findByProperty
    public List<ActivityGeneralModel> searchActivity(String activityName, ActivityType activityType, Date startTime) {
        return null;
    }

    // TODO 不知道要干嘛
    public List<String> getTemplate() {
        return null;
    }

    // TODO 待议
    public List<String> getScheme(String groupID) {
        return null;
    }

    // TODO 不知道要干嘛
    public ResultMsg promoteActivity(String activityID) {
        return null;
    }

    // TODO 待议
    public List<String> getActivityList(String groupID) {
        return null;
    }

}
