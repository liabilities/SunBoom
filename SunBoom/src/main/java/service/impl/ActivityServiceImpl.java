package service.impl;

import dao.ActivityDAO;
import dao.impl.ActivityDAOImpl;
import model.*;
import pojo.Activity;
import service.activityService.ActivityService;
import service.activityService.activityScan.search.SearchCriteriaFactory;
import service.activityService.activityScan.sortComparator.SortComparatorFactory;
import utilities.enums.*;
import utilities.exceptions.NotExistException;

import java.util.*;

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


    public List<ActivityGeneralModel> defalutDisplay(String initiatorID) throws NotExistException {
        return convertListPo2GeneralModel(activityDAO.findByProperty("initiatorID", Integer.parseInt(initiatorID)));
    }

    public ActivityModel getActivityDetail(String activityID) throws NotExistException {
        return new ActivityModel(activityDAO.getById(Integer.parseInt(activityID)));
    }

    public ResultMsg modifyAcitivity(ActivityModel activityModel) throws NotExistException {
        boolean result = activityDAO.updateOne(new Activity(activityModel));
        if(result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }


    public ResultMsg createActivity(ActivityModel activityModel) {
        System.out.println("createActivity");
        boolean result = activityDAO.insertOne(new Activity(activityModel));
        if(result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

    // TODO Charles--不知实现
    public AxisModel createTimeAxis() {
        return null;
    }

    public List<ActivityGeneralModel> getActivitySpecial(String initiatorID, ActivityState activityState) throws NotExistException {
        Date now = Calendar.getInstance().getTime();

        List<Activity> findingResult = activityDAO.findByProperty("initiatorID", Integer.parseInt(initiatorID));

        for (int i = 0; i < findingResult.size(); i++) {
            Activity thisActivity = findingResult.get(i);
            if (activityState == ActivityState.PREPARING) {
                if (!thisActivity.getStartTime().after(now)){
                    findingResult.remove(thisActivity);i--;
                }
            } else if (activityState == ActivityState.UNDERGOING) {
                if (!(thisActivity.getStartTime().before(now) && thisActivity.getEndTime().after(now))) {
                    findingResult.remove(thisActivity);i--;

                }
            } else {
                if (!thisActivity.getEndTime().before(now)) {
                    findingResult.remove(thisActivity);i--;

                }
            }
        }

        return convertListPo2GeneralModel(findingResult);
    }

    public List<Activity> searchActivities(List<ActivitySearchCriteria> activitySearchCriterias, ActivitySearchCreteriaModel activitySearchCreteriaModel) {

        // TODO Charles：保存现场，少传参数————修改result为成员变量
        List<Activity> result = null;
        SearchCriteriaFactory factory = new SearchCriteriaFactory();
        for (ActivitySearchCriteria activitySearchCriteria : activitySearchCriterias) {
            result = factory.createSearchCriteria(activitySearchCriteria, activitySearchCreteriaModel).meetCriteria(result);
        }
        return result;
    }

    public List<Activity> sortActivities(ActivitySortStrategy activitySortStrategy) {

        // TODO Charles：保存现场，少传参数————修改result为成员变量
        List<Activity> result = null;
        SortComparatorFactory factory = new SortComparatorFactory();
        Comparator<Activity> comparator = factory.createComparator(activitySortStrategy);
        result.sort(comparator);
        return result;
    }

    // TODO 策划模版这个东西是啥。。
    public List<ActivityTemplateGeneral> getTemplates() {
        return null;
    }

    // TODO 策划模版这个东西是啥。。
    public List<ActivityTemplateGeneral> myTemplates(String initiatorID) {
        return null;
    }

    // TODO 不知道具体要干嘛
    public ResultMsg promoteActivity(String activityID) {
        return null;
    }



    private List<ActivityGeneralModel> convertListPo2GeneralModel(List<Activity> thisActivitiesList) {
        List<ActivityGeneralModel> result = new LinkedList<ActivityGeneralModel>();
        for (Activity thisActivity: thisActivitiesList) {
            result.add(new ActivityGeneralModel(thisActivity));
        }
        return result;
    }
}
