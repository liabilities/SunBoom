package service;

import java.util.List;

import model.GroupModel;
import model.Letter;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;
import utilities.exceptions.NullException;

/**
 * Created by lenovo on 2017/1/13.
 */
public interface FellowService {

    /**
     *
     * @param groupID
     * @return 好友名 ID 头像 名字首字母（按字典序排列
     * @throws NotExistException
     */
    public List<GroupModel> getFellows(String groupID) throws  NotExistException;

    /**
     * 根据团体id获取联系人列表
     * @param groupID 团体id
     * @return List<String> userID的列表
     */
    public List<String> getFellowList(String groupID)  throws NotExistException;

    /**
     * 根据两个团体的id获取他们之间的对话信息
     * @param ID1 团体id1
     * @param ID2 团体id2
     * @return 会话信息的列表
     */
    public List<Letter> getMessageByID(String ID1, String ID2) throws NotExistException;

    /**
     * 发送信息
     * @param message 信息
     * @return Letter
     */
    public Letter sendMessage(String message, String ID1, String ID2) throws NullException, NotExistException;

    /**
     * 将发送的信息保存到数据库
     * @param message 信息
     * @return ResultMsg
     */
    public ResultMsg saveMessage(Letter message) throws NullException;

    /**
     * 允许用户删除一条消息
     * @param message 信息
     * @return ResultMsg
     */
    public ResultMsg deleteMessage(Letter message) throws NullException, NotExistException;

    /**
     * 允许用户将一条信息转发给其他联系人，选择转发后，会跳出提示框让用户选择联系人名称
     * @param message 信息
     * @return Letter
     */
    public Letter transmitMessage(String message, String ID1, String ID2) throws NullException, NotExistException;

    /**
     * 增加联系人，根据团体名称查找团体，如果没有相匹配的团体，则提示“团体不存在”
     * @param ID1 团体ID
     * @param name 被搜索的团体名称
     * @return ResultMsg
     */
    public ResultMsg addFellow(String ID1, String name) throws NotExistException;

    /**
     * 删除联系人
     * @param name 团体名称
     * @return ResultMsg
     */
    public ResultMsg deleteFellow (String ID1, String name) throws NotExistException;

    /**
     * 搜索联系人：根据关键字搜索联系人
     * @param keyword 关键字
     * @return 返回含有搜索关键字的联系人ID列表
     */
    public List<String> searchFellow(String ID1, String keyword) throws NotExistException;

}
