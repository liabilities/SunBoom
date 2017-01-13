package model;

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

}
