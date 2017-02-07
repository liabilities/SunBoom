package model;

import java.util.Date;

/**
 * 私信
 * Created by lenovo on 2017/1/13.
 */
public class PrivateLetter {

    /**
     * 私信ID
     */
    public String privateLetterID;

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

    public PrivateLetter(){

    }

    public PrivateLetter(String privateLetterID,String senderGroupID,String receiverGroupID,
                         String senderGroupName,String receiverGroupName,Date sendTime,String content){
        this.privateLetterID = privateLetterID;
        this.senderGroupID = senderGroupID;
        this.receiverGroupID = receiverGroupID;
        this.senderGroupName = senderGroupName;
        this.receiverGroupName = receiverGroupName;
        this.sendTime = sendTime;
        this.content = content;
    }

    public String getPrivateLetterID() {
        return privateLetterID;
    }

    public int getPrivateLetterID_int() {
        return Integer.parseInt(privateLetterID);
    }

    public void setPrivateLetterID(String privateLetterID) {
        this.privateLetterID = privateLetterID;
    }

    public String getSenderGroupID() {
        return senderGroupID;
    }

    public int getSenderGroupID_int() {
        return Integer.parseInt(senderGroupID);
    }

    public void setSenderGroupID(String senderGroupID) {
        this.senderGroupID = senderGroupID;
    }

    public String getReceiverGroupID() {
        return receiverGroupID;
    }

    public int getReceiverGroupID_int() {
        return Integer.parseInt(receiverGroupID);
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

    public java.sql.Date getSendTime_sql() {
        return new java.sql.Date(sendTime.getTime());
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
