package model;

import java.util.Date;

/**
 * 动态的评论
 * Created by lenovo on 2017/1/13.
 */
public class DynamicComment {

    /**
     * 回复的动态ID
     */
    public String dynamicID;

    /**
     * 评论ID
     */
    public String commentID;

    /**
     * 评论序号
     */
    public int commentNumber;

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

    public DynamicComment(String dynamicID,String commentID,int commentNumber,String replyGroupID,
                   String repliedGroupID,String replyGroupName,String repliedGroupName,
                   Date sendTime,String content){
        this.dynamicID = dynamicID;
        this.commentID = commentID;
        this.commentNumber = commentNumber;
        this.replyGroupID = replyGroupID;
        this.repliedGroupID = repliedGroupID;
        this.replyGroupName = replyGroupName;
        this.repliedGroupName = repliedGroupName;
        this.sendTime = sendTime;
        this.content = content;
    }

}
