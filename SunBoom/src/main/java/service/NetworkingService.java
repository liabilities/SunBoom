package service;

import utilities.enums.NetworkingState;
import utilities.enums.ResultMsg;
import utilities.enums.SearchStrategy;
import utilities.enums.SortStrategy;
import model.*;
import utilities.exceptions.NotExistException;

import java.util.List;

/**
 * Created by lenovo on 2017/1/13.
 * Last changed by charles.
 * Updating time: 2017/2/16.
 */
public interface NetworkingService {


    /*
    默认、常用功能
     */
    /**
     * 默认显示／默认综合排序
     * @return networking简介的列表
     */
    public List<NetworkingGeneralModel> defalutDisplay(String groupID) throws NotExistException;

    /**
     * 根据联谊ID获取联谊详情
     * @param networkingID 联谊ID
     * @return 联谊详情
     */
    public NetworkingModel getNetworkingDetail(String networkingID) throws NotExistException;

    /**
     * 根据活动ID更新该活动信息
     * @param networkingModel 联谊详情载体
     * @return ResultMsg 是否成功修改
     */
    public ResultMsg modifyNetworking(NetworkingModel networkingModel) throws NotExistException;


    /*
    新建联谊
     */
    /**
     * 新增一条联谊事项
     * @param newNetworkingModel 需创建的联谊载体
     * @return ResultMsg
     */
    public ResultMsg createNetworking(NetworkingModel newNetworkingModel);

    /**
     * 将此条联谊事项暂时保存到草稿
     * @param newNetworkingModel 需暂时保存的联谊载体
     * @return ResultMsg
     */
    public ResultMsg tempSaveNetworking(NetworkingModel newNetworkingModel);



    /*
    搜索
     */
    /**
     * 根据现有条件检索联谊项目并根据现有排序方式排序
     * @param searchStrategy
     * @param sortStrategy
     * @return 检索现有条件排序后的联谊项目列表
     *
     * TODO：接口待确定
     */
    public List<NetworkingGeneralModel> search(SearchStrategy searchStrategy, SortStrategy sortStrategy);



    /*
    响应
     */
    /**
     * 响应该联谊联谊
     * @param myGroupNum 我的团体ID
     * @return ResultMsg 是否响应成功
     */
    public ResultMsg respond(int myGroupNum);

    /**
     * 显示该团队ID对应的响应团体
     * @param networkingID 联谊ID
     * @return 响应团体
     */
    public List<GroupGeneralModel> getRespongdingGroup(String networkingID) throws NotExistException;




    /*
    查看：正在进行、尚未开始、已结束
     */
    /**
     *
     * @param groupID 该团体的编号
     * @param networkingState 要查看的联谊状态
     * @return 该团体特定状态的活动列表
     * @throws NotExistException
     *
     * Last changed by charles.
     * Updating time: 2017/2/16.
     */
    public List<NetworkingGeneralModel> getNetworkingSpecial(String groupID, NetworkingState networkingState) throws NotExistException;






    /**
     * 查看联谊团队的详情
     * @param groupID 团队ID
     * @return 此团队ID对应的团队详情
     * TODO：待议，很多地方会重复
     */
    public ResultMsg checkGroup(int groupID);

}
