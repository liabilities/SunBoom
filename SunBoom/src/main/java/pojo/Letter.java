package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/2/2.
 */
public class Letter {
    private int letterID;
    private int senderID;
    private int receiverID;
    private Date time;
    private int type;
    private String content;

    public Letter(){

    }

    public Letter(model.Letter model){
        this.letterID = model.getPrivateLetterID_int();
        this.senderID = model.getSenderGroupID_int();
        this.receiverID = model.getReceiverGroupID_int();
        this.time = model.getSendTime_sql();
        this.type = model.getType();
        this.content = model.getContent();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
