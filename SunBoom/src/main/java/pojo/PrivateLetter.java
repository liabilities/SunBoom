package pojo;

import java.sql.Date;

/**
 * Created by zoetx on 2017/1/16.
 */
public class PrivateLetter {
    private int letterID;
    private int senderID;
    private int receiverID;
    private String senderName;
    private String receiverName;
    private Date time;
    private String content;

    public PrivateLetter(){

    }

    public PrivateLetter(model.PrivateLetter model) {
        this.senderID = model.getSenderGroupID_int();
        this.receiverID = model.getReceiverGroupID_int();
        this.senderName = model.getSenderGroupName();
        this.receiverName = model.getReceiverGroupName();
        this.time = model.getSendTime_sql();
        this.content = model.getContent();
    }

    public int getLetterID() {
        return letterID;
    }

    public void setLetterID(int letterID) {
        this.letterID = letterID;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public int getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
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
