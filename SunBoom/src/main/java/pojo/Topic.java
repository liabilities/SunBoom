package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/2/2.
 */
public class Topic {

    private int topicID;
    private int publicityID;
    private int senderID;
    private int replyNum;
    private String content;
    private Date time;

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
    }

    public int getPublicityID() {
        return publicityID;
    }

    public void setPublicityID(int publicityID) {
        this.publicityID = publicityID;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public int getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(int replyNum) {
        this.replyNum = replyNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
