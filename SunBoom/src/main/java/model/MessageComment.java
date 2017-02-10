package model;

import pojo.MessageReply;

import java.util.Date;

/**
 * 留言的评论
 * Created by lenovo on 2017/1/13.
 */
public class MessageComment {

    /**
     * 回复的留言ID
     */
    public String messageID;

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

    public MessageComment(MessageReply reply){
        this.commentID = reply.getReplyID()+"";
        this.messageID = reply.getMessageID()+"";
        this.content = reply.getContent();
        this.sendTime = reply.getTime();
    }

    public MessageComment(String messageID,String commentID,String replyGroupID,
                          String repliedGroupID,String replyGroupName,String repliedGroupName,
                          Date sendTime,String content){
        this.messageID = messageID;
        this.commentID = commentID;
        this.replyGroupID = replyGroupID;
        this.repliedGroupID = repliedGroupID;
        this.replyGroupName = replyGroupName;
        this.repliedGroupName = repliedGroupName;
        this.sendTime = sendTime;
        this.content = content;
    }

    public String getMessageID() {
        return messageID;
    }

    public int getMessageID_int() {
        return Integer.parseInt(messageID);
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
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
        return Integer.parseInt(repliedGroupID);
    }

    public void setReplyGroupID(String replyGroupID) {
        this.replyGroupID = replyGroupID;
    }

    public String getRepliedGroupID() {
        return repliedGroupID;
    }

    public int getRepliedGroupID_int() {
        return  Integer.parseInt(repliedGroupID);
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
}
