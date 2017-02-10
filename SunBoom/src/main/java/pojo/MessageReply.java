package pojo;

import model.MessageComment;

import java.util.Date;

/**
 * Created by zoetx on 2017/2/2.
 */
public class MessageReply {

    private int replyID;
    private int messageID;
    private int identity;
    private Date time;
    private String content;

    public MessageReply() {

    }

    public MessageReply(MessageComment comment){
        this.replyID = comment.getReplyGroupID_int();
        this.messageID = comment.getCommentID_int();
        this.time = comment.getSendTime_sql();
        this.content = comment.getContent();
    }

    public int getReplyID() {
        return replyID;
    }

    public void setReplyID(int replyID) {
        this.replyID = replyID;
    }

    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
