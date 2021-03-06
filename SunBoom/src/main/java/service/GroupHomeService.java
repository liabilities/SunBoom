package service;

import utilities.enums.ResultMsg;
import model.GroupModel;
import utilities.exceptions.InvalidHtmlPathException;
import utilities.exceptions.NotExistException;
import utilities.exceptions.NullException;

/**
 * Created by cuihua on 2017/1/13.
 * Last changed by charles.
 * Updating time: 2017/1/23.
 */
public interface GroupHomeService {

    /**
     *
     * @param groupID 团队ID编号
     * @return 基本信息载体
     *
     * 根据团队的ID获取相应的信息载体
     */
    GroupModel getBasicInfo(String groupID) throws NotExistException;

    /**
     *
     * @param groupModel 基本信息载体
     * @return 保存操作的状态
     *
     * 保存现有的团队信息
     */
    ResultMsg saveBasicInfo(GroupModel groupModel) throws NullException, NotExistException;

    /**
     *
     * @param activityID 活动ID编号
     * @return 图文描述信息HTML文件的路径
     *
     * 根据活动的ID获取相应的图文描述信息HTML路径
     */
    String getDetailInfo(String activityID) throws NotExistException;

    /**
     *
     * @param activityID 活动ID编号
     * @param detailHTMLPath 图文描述信息HTML文件的路径
     * @return 保存操作的状态
     *
     * 保存现有的描述信息HTML文件路径
     */
    ResultMsg saveDetailInfo(String activityID, String detailHTMLPath) throws InvalidHtmlPathException, NotExistException;
}
