package service;

import utilities.enums.ResultMsg;
import utilities.enums.SearchStrategy;
import utilities.enums.SortStrategy;
import model.*;

import java.util.List;

/**
 * Created by lenovo on 2017/1/13.
 */
public interface NetWorkingService {

    /**
     * 新增一条联谊事项
     * @param newNetworkingModel
     * @return ResultMsg
     */
    public ResultMsg announceNetWorking(NetworkingModel newNetworkingModel);

    /**
     * 将此条联谊事项暂时保存到草稿
     * @param newNetworkingModel
     * @return ResultMsg
     */
    public ResultMsg tempSaveNetWorking(NetworkingModel newNetworkingModel);

    /**
     * 默认综合排序
     * @return 综合排序后的联谊项目列表
     */
    public List<NetworkingGeneralModel> search();

    /**
     * 根据现有条件检索联谊项目并根据现有排序方式排序
     * @param searchStrategy
     * @param sortStrategy
     * @return 检索现有条件排序后的联谊项目列表
     */
    public List<NetworkingGeneralModel> search(SearchStrategy searchStrategy, SortStrategy sortStrategy);

    /**
     * 查看对应ID的联谊详情
     * @param networkingID
     * @return 此联谊详情
     */
    public NetworkingModel getDetail(int networkingID);

    /**
     * 响应该联谊活动
     * @param muGroupNum
     * @return ResultMsg
     */
    public ResultMsg respond(int muGroupNum);

    /**
     * 查看已发布的
     * @param networkingID
     * @return 已发布的联谊概况列表
     */
    public List<NetworkingModel> getAnnounced(int networkingID);

    /**
     * 查看草稿箱的
     * @param networkingID
     * @return 草稿箱的联谊概况列表
     */
    public List<NetworkingModel> getDrafts(int networkingID);

    /**
     * 查看已完成的
     * @param networkingID
     * @return 已完成的联谊概况列表
     */
    public List<NetworkingModel> getCompleted(int networkingID);

    /**
     * 查看活动团队的详情
     * @param groupID 团队ID
     * @return 此团队ID对应的团队详情
     */
    public ResultMsg checkGroup(int groupID);

    /**
     * 显示该团队ID对应的响应团体的个数
     * @param networkingID 联谊ID
     * @return 响应团体个数
     */
    public ResultMsg getRespongdingGroupNum(int networkingID);

    /**
     * 显示该团队ID对应的响应团体
     * @param networkingID 联谊ID
     * @return 响应团体
     */
    public List<GroupGeneralModel> getRespongdingGroup(int networkingID);

}
