package service;

import model.ActivityTemplateGeneral;
import model.AxisModel;
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
 * Updating time: 2017/2/16.
 */
public interface ActivityService {

    /*
    默认、常用功能
     */
    /**
     * 默认显示／活动推广界面获取该团体全部活动
     * @return activity简介的列表
     *
     * Last changed by charles.
     * Updating time: 2017/2/16.
     */
    public List<ActivityGeneralModel> defalutDisplay(String initiatorID) throws NotExistException;

    /**
     * 根据活动ID获取活动详情
     * @param activityID 活动ID
     * @return 活动详情
     */
    public ActivityModel getActivityDetail(String activityID) throws NotExistException;

    /**
     * 根据活动ID更新该活动信息
     * @param activityModel 活动详情载体
     * @return ResultMsg 是否成功修改
     */
    public ResultMsg modifyAcitivity(ActivityModel activityModel) throws NotExistException;



    /*
    新建活动
     */
    /**
     * 创建活动
     * @param activityModel 需创建的活动载体
     * @return ResultMsg
     */
    public ResultMsg createActivity(ActivityModel activityModel);

    /**
     * 创建时间轴
     * @return 创建的时间轴详情载体
     *
     * TODO 接口待确定
     * Last changed by charles.
     * Updating time: 2017/2/16.
     */
    public AxisModel createTimeAxis();



    /*
    查看：正在进行、尚未开始、已结束
     */
    /**
     *
     * @param initiatorID 该团体的编号
     * @param activityState 要查看的活动状态
     * @return 该团体特定状态的活动列表
     * @throws NotExistException
     *
     * Last changed by charles.
     * Updating time: 2017/2/16.
     */
    public List<ActivityGeneralModel> getActivitySpecial(String initiatorID, ActivityState activityState) throws NotExistException;



    /*
    搜索
     */
    /**
     * 根据现有条件搜索显示
     * @param activityName 活动名称
     * @param activityType 活动类型
     * @param activityState 要查看的活动状态（包括：尚未开始，正在进行，已结束）
     * @param startTime 活动开始时间
     * @return activity简介的列表
     *
     * Last changed by charles.
     * Updating time: 2017/2/16.
     */
    public List<ActivityGeneralModel> searchActivity(String activityName, ActivityType activityType, ActivityState activityState, Date startTime);



    /*
    活动策划
     */
    /**
     * 获取已有的可参考的策划模板列表
     * @return 策划模板简要列表
     *
     * Last changed by charles.
     * Updating time: 2017/2/16.
     */
    public List<ActivityTemplateGeneral> getTemplates();

    /**
     * 根据团体ID获取策划列表
     * @param initiatorID 团队ID
     * @return 该团体模板简要列表
     *
     * Last changed by charles.
     * Updating time: 2017/2/16.
     */
    public List<ActivityTemplateGeneral> myTemplates(String initiatorID);



    /*
    活动推广
     */
    /**
     * 根据活动ID推广活动
     * @param activityID 活动编号
     * @return 是否成功推广
     *
     * TODO 接口待确定
     */
    public ResultMsg promoteActivity(String activityID);

}
