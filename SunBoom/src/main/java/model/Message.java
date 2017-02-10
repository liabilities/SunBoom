package model;

import java.util.Date;

/**
 * 留言
 * Created by lenovo on 2017/1/13.
 */
public class Message {

    /**
     * 留言ID
     */
    public String messageID;

    /**
     * 发件团体ID
     */
    public String senderGroupID;

    /**
     * 收件团体ID
     */
    public String receiverGroupID;

    /**
     * 发件团体名称
     */
    public String senderGroupName;

    /**
     * 收件团体名称
     */
    public String receiverGroupName;

    /**
     * 发送时间
     */
    public Date sendTime;

    /**
     * 消息内容
     */
    public String content;

    public Message(pojo.Message message){
        this.messageID = message.getMessageID()+"";
        this.senderGroupID = message.getSenderID()+"";
        this.receiverGroupID = message.getReceiverID()+"";
        this.content = message.getContent();
    }

    public Message(String messageID,String senderGroupID,String receiverGroupID,
                   String senderGroupName,String receiverGroupName,Date sendTime,String content){
        this.messageID = messageID;
        this.senderGroupID = senderGroupID;
        this.receiverGroupID = receiverGroupID;
        this.senderGroupName = senderGroupName;
        this.receiverGroupName = receiverGroupName;
        this.sendTime = sendTime;
        this.content = content;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getSenderGroupID() {
        return senderGroupID;
    }

    public void setSenderGroupID(String senderGroupID) {
        this.senderGroupID = senderGroupID;
    }

    public String getReceiverGroupID() {
        return receiverGroupID;
    }

    public void setReceiverGroupID(String receiverGroupID) {
        this.receiverGroupID = receiverGroupID;
    }

    public String getSenderGroupName() {
        return senderGroupName;
    }

    public void setSenderGroupName(String senderGroupName) {
        this.senderGroupName = senderGroupName;
    }

    public String getReceiverGroupName() {
        return receiverGroupName;
    }

    public void setReceiverGroupName(String receiverGroupName) {
        this.receiverGroupName = receiverGroupName;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
