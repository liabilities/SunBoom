package service;

import utilities.enums.ResultMsg;
import model.GroupModel;

/**
 * Created by cuihua on 2017/1/13.
 */
public interface ActivityHomeService {

    /**
     *
     * @param groupID 团队ID编号
     * @return 基本信息载体
     *
     * 根据团队的ID获取相应的信息载体
     */
    GroupModel getBasicInfo(String groupID);

    /**
     *
     * @param groupModel 基本信息载体
     * @return 保存操作的状态
     *
     * 保存现有的团队信息
     */
    ResultMsg saveBasicInfo(GroupModel groupModel);

    /**
     *
     * @param activityID 活动ID编号
     * @return 图文详情HTML文件的路径
     *
     * 根据活动的ID获取相应的图文详情HTML路径
     */
    String getDetailInfo(String activityID);

    /**
     *
     * @param activityID 活动ID编号
     * @param detailHTMLPath 图文详情HTML文件的路径
     * @return 保存操作的状态
     *
     * 保存现有的详情HTML文件路径
     */
    ResultMsg saveDetailInfo(String activityID, String detailHTMLPath);
}
