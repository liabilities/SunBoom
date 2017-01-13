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

}
