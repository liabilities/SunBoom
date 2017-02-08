package service;

import utilities.enums.ActivityState;
import utilities.enums.ActivityType;
import utilities.enums.ResultMsg;
import model.ActivityGeneralModel;
import model.ActivityModel;
import utilities.exceptions.NotExistException;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/1/13.
 * Last changed by charles.
 * Updating time: 2017/2/8.'
 *
 * TODO EVERYBODY--不知道getActivityHistoryList，getScheme，getActivityList有什么不一样= =
 */
public interface ActivityService {

    /**
     * 默认显示
     * @return activity简介的列表
     *
     * Last changed by charles.
     * Updating time: 2017/2/8.
     */
    public List<ActivityGeneralModel> getActivityHistoryList(String groupID);

    /**
     * 根据活动ID获取活动详情
     * @param activityID 活动ID
     * @return 活动详情
     */
    public ActivityModel getActivityDetail(String activityID) throws NotExistException;

    /**
     * 根据活动ID更新该活动信息
     * @param activityID 活动ID
     * @return ResultMsg
     *
     * TODO tangxin--???????这个接口？？？？？？
     */
    public ResultMsg modifyUndergoingAcitivity(String activityID);



    /*
    新建活动
     */
    /**
     * 创建活动
     * @param activityModel 创建活动
     * @return ResultMsg
     */
    public ResultMsg createActivity(ActivityModel activityModel);

    /**
     * 创建时间轴
     * @return 时间轴ID
     */
    public String createTimeAxis();



    /*
    正在进行、尚未开始、已结束
     */
    /**
     * 根据团体id获取正在进行的活动列表
     * @param groupID 团队ID
     * @return activityID的列表
     */
    public List<ActivityGeneralModel> getActivitySpecial(String groupID, ActivityState activityState) throws NotExistException;



    /*
    Tab03：历史活动、搜索
     */
    /**
     * 根据现有条件搜索显示
     * @param activityName 活动名称
     * @param activityType 活动类型
     * @param startTime 活动开始时间
     * @return activity简介的列表
     */
    public List<ActivityGeneralModel> searchActivity(String activityName, ActivityType activityType, Date startTime);



    /*
    活动策划
     */
    /**
     * 获取已有的策划模板列表
     * @return 策划模板ID列表
     */
    public List<String> getTemplate();

    /**
     * 根据团体ID获取策划列表
     * @param groupID 团队ID
     * @return 策划ID列表
     */
    public List<String> getScheme(String groupID);



    /*
    活动推广
     */
    /**
     * 根据活动ID推广活动
     * @param activityID 活动ID
     * @return ResultMsg
     */
    public ResultMsg promoteActivity(String activityID);




    /*
    !!!!!!!!!!!!!!!
     */
    /**
     * 根据团体ID获取所有活动列表
     * @param groupID 团队ID
     * @return 活动ID列表
     */
    public List<String> getActivityList(String groupID);

}
