package model;

import java.util.Date;

/**
 * 动态的评论
 * Created by lenovo on 2017/1/13.
 */
public class DynamicComment implements Comparable{

    /**
     * 回复的动态ID
     */
    public String dynamicID;

    /**
     * 评论ID
     */
    public String commentID;

    /**
     * 回复团体ID
     */
    public String replyGroupID;

    /**
     * 被回复团体ID
     */
    public String repliedGroupID;

    /**
     * 回复团体名称
     */
    public String replyGroupName;

    /**
     * 被回复团体名称
     */
    public String repliedGroupName;

    /**
     * 发送时间
     */
    public Date sendTime;

    /**
     * 消息内容
     */
    public String content;

    public DynamicComment(pojo.DynamicComment comment){
        this.dynamicID = comment.getDynamicID()+"";
        this.commentID = comment.getCommentID()+"";
        this.replyGroupID = comment.getSenderID()+"";
        this.repliedGroupID = comment.getReceiverID()+"";
        this.sendTime = new Date(comment.getTime().getTime());
        this.content = comment.getContent();
    }

    public DynamicComment(String dynamicID,String commentID,String replyGroupID,
                   String repliedGroupID,String replyGroupName,String repliedGroupName,
                   Date sendTime,String content){
        this.dynamicID = dynamicID;
        this.commentID = commentID;
        this.replyGroupID = replyGroupID;
        this.repliedGroupID = repliedGroupID;
        this.replyGroupName = replyGroupName;
        this.repliedGroupName = repliedGroupName;
        this.sendTime = sendTime;
        this.content = content;
    }

    public String getDynamicID() {
        return dynamicID;
    }

    public int getDynamicID_int() {
        return Integer.parseInt(dynamicID);
    }

    public void setDynamicID(String dynamicID) {
        this.dynamicID = dynamicID;
    }

    public String getCommentID() {
        return commentID;
    }

    public int getCommentID_int() {
        return Integer.parseInt(commentID);
    }

    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    public String getReplyGroupID() {
        return replyGroupID;
    }

    public int getReplyGroupID_int() {
        return Integer.parseInt(replyGroupID);
    }

    public void setReplyGroupID(String replyGroupID) {
        this.replyGroupID = replyGroupID;
    }

    public String getRepliedGroupID() {
        return repliedGroupID;
    }

    public int getRepliedGroupID_int() {
        return Integer.parseInt(repliedGroupID);
    }

    public void setRepliedGroupID(String repliedGroupID) {
        this.repliedGroupID = repliedGroupID;
    }

    public String getReplyGroupName() {
        return replyGroupName;
    }

    public void setReplyGroupName(String replyGroupName) {
        this.replyGroupName = replyGroupName;
    }

    public String getRepliedGroupName() {
        return repliedGroupName;
    }

    public void setRepliedGroupName(String repliedGroupName) {
        this.repliedGroupName = repliedGroupName;
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

    public int compareTo(Object o) {
        DynamicComment comment = (DynamicComment)o;
        return this.getSendTime().compareTo(comment.getSendTime());
    }
}
