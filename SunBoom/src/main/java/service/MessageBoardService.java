package service;

import utilities.enums.ResultMsg;
import model.Message;
import model.MessageComment;
import utilities.exceptions.NotExistException;

import java.util.List;

/**
 * Created by lenovo on 2017/1/13.
 */
public interface MessageBoardService {

    /**
     * 发布留言
     * @param message
     * @return
     */
    public ResultMsg publish(Message message);

    /**
     * 获取所有给自己的留言
     * @param groupID 团队ID
     * @return 留言的列表
     */
    public List<Message> getMessageList(String groupID) throws NotExistException;

    /**
     * 获取每一条留言后的留言回复
     * @param messageID 留言ID
     * @return 留言的回复列表
     */
    public List<MessageComment> getComment(String messageID) throws NotExistException;

    /**
     * 回复给自己的留言
     * @param comment 留言
     * @return ResultMsg
     */
    public ResultMsg replyMessage(MessageComment comment) throws NotExistException;

}
