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
    public ResultMsg pulish(Dynamic dy);

    /**
     * 读取联系人团体的消息
     * @param groupID 团队ID
     * @return 我关注的所有团体的动态消息，每次显示20条，根据下拉情况显示更多条
     */
    public List<Dynamic> getDynamicList(String groupID) throws NotExistException;

    /**
     * 回复动态
     * @param dynamicComment 动态评论
     * @return ResultMsg
     */
    public ResultMsg replyDynamic(DynamicComment dynamicComment);

    /**
     * 点赞动态
     * @param dynamicID 动态ID
     * @return ResultMsg
     */
    public ResultMsg like(int dynamicID) throws NotExistException;

}
