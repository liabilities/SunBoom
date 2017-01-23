package service;

import utilities.enums.ResultMsg;
import model.Comment;
import model.Message;
import model.MessageComment;

import java.util.List;

/**
 * Created by lenovo on 2017/1/13.
 */
public interface MessageBoardService {

    /**
     * 获取所有给自己的留言
     * @param groupID 团队ID
     * @return 留言的列表
     */
    public List<Message> getMessageList(String groupID);

    /**
     * 获取每一条留言后的留言回复
     * @param MessageID 回复ID
     * @return 留言的回复列表
     */
    public List<Comment> getComment(String MessageID);

    /**
     * 回复给自己的留言
     * @param comment 留言ID
     * @return ResultMsg
     */
    public ResultMsg replyMessage(MessageComment comment);

}
