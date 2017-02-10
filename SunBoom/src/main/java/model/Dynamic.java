package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 动态
 * Created by lenovo on 2017/1/13.
 */
public class Dynamic {

    /**
     * 动态ID
     */
    public String dynamicID;

    /**
     * 发布时间
     */
    public Date publishTime;

    /**
     *发布组织ID
     */
    public String groupID;

    /**
     * 内容
     */
    public String content;

    /**
     * 图片组
     */
    public List<String> pictures;

    /**
     * 点赞数
     */
    public int likeNumbers;

    /**
     * 评论数
     */
    public int commentNumbers;

    public Dynamic(pojo.Dynamic dynamic){
        this.dynamicID = dynamic.getDynamicID()+"";
        this.publishTime = new Date(dynamic.getPublishTime().getTime());
        this.groupID = dynamic.getPublisherID()+"";
        this.content = dynamic.getContent();
        this.pictures = new ArrayList<String>(dynamic.getPictureNum());
        this.likeNumbers = dynamic.getLikeNum();
        this.commentNumbers = dynamic.getCommentNum();
    }

    public Dynamic(String dynamicID,Date publishTime,String groupID,String content,
                   List<String> pictures,int likeNumbers,int commentNumbers){
        this.dynamicID = dynamicID;
        this.publishTime = publishTime;
        this.groupID = groupID;
        this.content = content;
        this.pictures = pictures;
        this.likeNumbers = likeNumbers;
        this.commentNumbers = commentNumbers;
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

    public Date getPublishTime() {
        return publishTime;
    }

    public java.sql.Date getPublishTime_sql() {
        return new java.sql.Date(publishTime.getTime());
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getGroupID() {
        return groupID;
    }

    public int getGroupID_int() {
        return Integer.parseInt(groupID);
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public int getLikeNumbers() {
        return likeNumbers;
    }

    public void setLikeNumbers(int likeNumbers) {
        this.likeNumbers = likeNumbers;
    }

    public int getCommentNumbers() {
        return commentNumbers;
    }

    public void setCommentNumbers(int commentNumbers) {
        this.commentNumbers = commentNumbers;
    }
}
