package service;

import enums.ResultMsg;
import model.GroupModel;

/**
 * Created by cuihua on 2017/1/13.
 */
public interface ActivityHomeService {

    /**
     *
     * @param groupID 团队ID编号
     * @return 基本信息载体
     */
    GroupModel getBasicInfo(String groupID);

    /**
     *
     * @param groupModel 基本信息载体
     * @return 保存操作的状态
     */
    ResultMsg saveBasicInfo(GroupModel groupModel);

    /**
     *
     * @param activityID 活动ID编号
     * @return 图文详情HTML文件的路径
     */
    String getDetailInfo(String activityID);

    /**
     *
     * @param detailHTMLPath 图文详情HTML文件的路径
     * @return 保存操作的状态
     */
    ResultMsg saveDetailInfo(String detailHTMLPath);
}
