package service;

import utilities.enums.ActivityType;
import utilities.enums.ResultMsg;
import model.ActivityDetailModel;
import model.ActivityGeneralModel;
import model.ActivityModel;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/1/13.
 * Last changed by charles.
 * Updating time: 2017/1/23.
 */
public interface ActivityService {

    /**
     * 默认显示
     * @return activity简介的列表
     */
    public List<ActivityGeneralModel> getActivityHistoryList();

    /**
     * 根据活动ID获取活动详情
     * @param activityID 活动ID
     * @return 活动详情
     */
    public ActivityDetailModel getActivityDetail(String activityID);





    /*
    Tab01：新建活动
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
    Tab02：正在进行
     */
    /**
     * 根据团体id获取正在进行的活动列表
     * @param groupID 团队ID
     * @return activityID的列表
     */
    public List<String> getActivityUnderwayList(String groupID);



    /*
    Tab03：历史活动
     */
    /**
     * 根据现有条件搜索显示
     * @param activityName 活动名称
     * @param activityType 活动类型
     * @param startTime 活动开始时间
     * @return activity简介的列表
     */
    public List<ActivityGeneralModel> getActivityHistoryList(String activityName, ActivityType activityType, Date startTime);



    /*
    Tab04：尚未开始
     */
    /**
     * 根据团体ID获取尚未开始的活动列表
     * @param groupID 团队ID
     * @return activity简介的列表
     */
    public List<ActivityGeneralModel> getActivityToBeginList (String groupID);

    /**
     * 根据活动ID更新该活动信息
     * @param activityID 活动ID
     * @return ResultMsg
     */
    public ResultMsg modifyAcitivityToBegin(String activityID);



    /*
    Tab05：活动策划
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
    Tab06：活动推广
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
