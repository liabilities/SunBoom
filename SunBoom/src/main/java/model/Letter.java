package model;

import java.util.Date;

/**
 * 私信
 * Created by lenovo on 2017/1/13.
 */
public class Letter {

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
     * 发送时间
     */
    public Date sendTime;

    /**
     * 发送类型
     */
    public int type;

    /**
     * 消息内容
     */
    public String content;

    public Letter(){

    }

    public Letter(String privateLetterID, String senderGroupID, String receiverGroupID,
                   Date sendTime, int type, String content){
        this.privateLetterID = privateLetterID;
        this.senderGroupID = senderGroupID;
        this.receiverGroupID = receiverGroupID;
        this.sendTime = sendTime;
        this.type = type;
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

    public Date getSendTime() {
        return sendTime;
    }

    public java.sql.Date getSendTime_sql() {
        return new java.sql.Date(sendTime.getTime());
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
