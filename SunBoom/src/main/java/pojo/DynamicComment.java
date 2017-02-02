package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/2/2.
 */
public class DynamicComment {
    private int commentID;
    private int dynamicID;
    private int senderID;
    private int receiverID;
    private Date time;
    private String content;

    public int getCommentID() {
        return commentID;
    }

    public int getDynamicID() {
        return dynamicID;
    }

    public int getSenderID() {
        return senderID;
    }

    public int getReceiverID() {
        return receiverID;
    }

    public Date getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public void setDynamicID(int dynamicID) {
        this.dynamicID = dynamicID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
