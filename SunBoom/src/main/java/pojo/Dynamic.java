package pojo;


import java.util.Date;

/**
 * Created by zoetx on 2017/1/16.
 */
public class Dynamic {
    private int dynamicID;
    private Date publishTime;
    private int publisherID;
    private String content;
    private int pictureNum;
    private int likeNum;
    private int commentNum;

    public Dynamic(){

    }

    public Dynamic(model.Dynamic dynamic){
        this.dynamicID = dynamic.getDynamicID_int();
        this.publishTime = dynamic.getPublishTime_sql();
        this.publisherID = dynamic.getDynamicID_int();
        this.content = dynamic.getContent();
        this.pictureNum = dynamic.getPictures().size();
        this.likeNum = dynamic.getLikeNumbers();
        this.commentNum = dynamic.getCommentNumbers();
    }

    public int getDynamicID() {
        return dynamicID;
    }

    public void setDynamicID(int dynamicID) {
        this.dynamicID = dynamicID;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public int getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPictureNum() {
        return pictureNum;
    }

    public void setPictureNum(int pictureNum) {
        this.pictureNum = pictureNum;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

}
