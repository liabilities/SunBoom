package service;

import java.util.List;
import utilities.enums.ResultMsg;
import model.Dynamic;
import model.DynamicComment;
import utilities.exceptions.NotExistException;

/**
 * Created by lenovo on 2017/1/13.
 */
public interface DynamicsService {

    /**
     * 发布消息（可含图）
     * @param dy 动态
     * @return ResultMsg
     */
    public ResultMsg pulish(Dynamic dy) throws NotExistException;

    /**
     * 读取联系人团体的消息
     * @param groupID 团队ID
     * @return 我关注的所有团体的动态消息，每次显示20条，根据下拉情况显示更多条
     */
    public List<Dynamic> getDynamicList(String groupID) throws NotExistException;

    /**
     * 获得动态
     * 动态包括（时间、内容、发布者、头像、图片、评论、点赞数）
     * @param groupname
     * @return list
     */
    public List<Dynamic> getDynamicListByName(String groupname) throws NotExistException;

    /**
     * 回复动态
     * @param dynamicComment 动态评论
     * @return ResultMsg
     */
    public ResultMsg replyDynamic(DynamicComment dynamicComment);

    /**
     * 点赞
     * @param dynamicID 动态ID
     * @return int
     */
    public int like(int dynamicID) throws NotExistException;

    /**
     * 根据动态ID获取评论
     * @param dynamicID
     * @return list
     */
    public List<DynamicComment> getDynamicComment(String dynamicID) throws NotExistException;

}
