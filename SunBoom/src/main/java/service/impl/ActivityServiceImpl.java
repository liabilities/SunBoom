package service.impl;

import dao.ActivityDAO;
import dao.GroupDAO;
import dao.impl.ActivityDAOImpl;
import dao.impl.GroupDAOImpl;
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
 * Last changed by zoetx.
 * Updating time: 2017/1/30.
 */
public class ActivityServiceImpl implements ActivityService {

    ActivityDAO activityDAO;
    GroupDAO groupDAO;

    public ActivityServiceImpl() {
        activityDAO = new ActivityDAOImpl();
        groupDAO = new GroupDAOImpl();
    }


    public List<ActivityGeneralModel> getActivityHistoryList(String groupID) {
        return null;
    }

    public ActivityModel getActivityDetail(String activityID) throws NotExistException {
        return new ActivityModel(activityDAO.getById(activityID));
    }

    public ResultMsg createActivity(ActivityModel activityModel) {
        Activity activity = new Activity(activityModel);
        boolean result = activityDAO.insertOne(activity);
        if(result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

    public String createTimeAxis() {
        return null;
    }

    public List<String> getActivityUnderwayList(String groupID) {
        return null;
    }

    public List<ActivityGeneralModel> getActivityHistoryList(String activityName, ActivityType activityType, Date startTime) {
        return null;
    }

    public List<ActivityGeneralModel> getActivityToBeginList(String groupID) {
        return null;
    }

    public ResultMsg modifyAcitivityToBegin(String activityID) {
        return null;
    }

    public List<String> getTemplate() {
        return null;
    }

    public List<String> getScheme(String groupID) {
        return null;
    }

    public ResultMsg promoteActivity(String activityID) {
        return null;
    }

    public List<String> getActivityList(String groupID) {
        return null;
    }

}
