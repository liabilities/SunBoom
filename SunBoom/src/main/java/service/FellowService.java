package service;

import java.util.List;
import enums.ResultMsg;
import model.PrivateLetter;

/**
 * Created by lenovo on 2017/1/13.
 */
public interface FellowService {

    /**
     * 根据团体id获取联系人列表
     * @param groupID 团体id
     * @return List<String> userID的列表
     */
    public List<String> getFellowList(String groupID);

    /**
     * 根据两个团体的id获取他们之间的对话信息
     * @param ID1 团体id1
     * @param ID2 团体id2
     * @return 会话信息的列表
     */
    public List<PrivateLetter> getMessageByID(String ID1, String ID2);

    /**
     * 发送信息
     * @param message 信息
     * @return ResultMsg
     */
    public ResultMsg sendMessage(String message);

    /**
     * 将发送的信息保存到数据库
     * @param message 信息
     * @return ResultMsg
     */
    public ResultMsg saveMessage(PrivateLetter message);

    /**
     * 允许用户删除一条消息
     * @param message 信息
     * @return ResultMsg
     */
    public ResultMsg deleteMessage(PrivateLetter message);

    /**
     * 允许用户将一条信息转发给其他联系人，选择转发后，会跳出提示框让用户选择联系人名称
     * @param message 信息
     * @return ResultMsg
     */
    public ResultMsg transmitMessage(String message);

    /**
     * 增加联系人，根据团体名称查找团体，如果没有相匹配的团体，则提示“团体不存在”
     * @param name 团体名称
     * @return ResultMsg
     */
    public ResultMsg addFellow(String name);

    /**
     * 删除联系人
     * @param name 团体名称
     * @return ResultMsg
     */
    public ResultMsg deleteFellow (String name);

    /**
     * 搜索联系人：根据关键字搜索联系人
     * @param keyword 关键字
     * @return 返回含有搜索关键字的联系人列表
     */
    public List<String> searchFellow(String keyword);

}
