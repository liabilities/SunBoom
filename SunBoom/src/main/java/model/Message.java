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

}
