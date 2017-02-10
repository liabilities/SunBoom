package service.impl;

import dao.GroupDAO;
import dao.MessageDAO;
import dao.MessageReplyDAO;
import dao.impl.GroupDAOImpl;
import dao.impl.MessageDAOImpl;
import dao.impl.MessageReplyDAOImpl;
import model.Message;
import model.MessageComment;
import pojo.MessageReply;
import service.MessageBoardService;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/2/9.
 */
public class MessageBoardServiceImpl implements MessageBoardService {

    public ResultMsg publish(Message message) {
        //TODO ER图里的serial序号（楼层）数据库里没加？
        return null;
    }

    public List<Message> getMessageList(String groupID) throws NotExistException{
        MessageDAO dao = new MessageDAOImpl();
        List<pojo.Message> messages = dao.findByProperty("receiverID",Integer.parseInt(groupID));

        List<Message> list = new ArrayList<Message>();
        GroupDAO groupDAO = new GroupDAOImpl();
        Message mes;
        for(pojo.Message message : messages){
            mes = new Message(message);
            mes.setReceiverGroupName(groupDAO.getById(mes.getReceiverGroupID()).getName());
            mes.setSenderGroupName(groupDAO.getById(mes.getSenderGroupID()).getName());
            list.add(mes);
        }
        return list;
    }

    public List<MessageComment> getComment(String messageID) throws NotExistException{
        MessageReplyDAO dao = new MessageReplyDAOImpl();
        List<pojo.MessageReply> messages = dao.findByProperty("messageID",Integer.parseInt(messageID));

        MessageDAO messageDAO = new MessageDAOImpl();
        pojo.Message m = messageDAO.getById(Integer.parseInt(messageID));

        List<MessageComment> list = new ArrayList<MessageComment>();
        GroupDAO groupDAO = new GroupDAOImpl();
        MessageComment comment;
        for(pojo.MessageReply message : messages){
            comment = new MessageComment(message);
            if(message.getIdentity() == 0){
                comment.setReplyGroupID(m.getReceiverID()+"");
                comment.setReplyGroupName(groupDAO.getById(m.getReceiverID()).getName());
                comment.setRepliedGroupID(m.getSenderID()+"");
                comment.setRepliedGroupName(groupDAO.getById(m.getSenderID()).getName());
            }else{
                comment.setRepliedGroupID(m.getReceiverID()+"");
                comment.setRepliedGroupName(groupDAO.getById(m.getReceiverID()).getName());
                comment.setReplyGroupID(m.getSenderID()+"");
                comment.setReplyGroupName(groupDAO.getById(m.getSenderID()).getName());
            }
            list.add(comment);
        }
        return list;
    }

    public ResultMsg replyMessage(MessageComment comment) throws  NotExistException{
        MessageReplyDAO dao = new MessageReplyDAOImpl();
        MessageReply reply = new MessageReply(comment);

        MessageDAO messageDAO = new MessageDAOImpl();
        pojo.Message mes = messageDAO.getById(comment.getMessageID_int());

        if(mes.getReceiverID() == comment.getReplyGroupID_int())
            reply.setIdentity(0);
        else
            reply.setIdentity(1);
        boolean b = dao.insertOne(reply);
        if(b) return ResultMsg.SUCCESS;
        return ResultMsg.FAIL;
    }

}
