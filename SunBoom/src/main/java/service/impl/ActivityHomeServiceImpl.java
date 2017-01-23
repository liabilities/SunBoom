package service.impl;

import dao.ActivityDAO;
import dao.GroupDAO;
import dao.impl.ActivityDAOImpl;
import dao.impl.GroupDAOImpl;
import utilities.enums.ResultMsg;
import model.GroupModel;
import pojo.Activity;
import pojo.Group;
import service.ActivityHomeService;
import utilities.exceptions.InvalidHtmlPathException;
import utilities.exceptions.NullException;

/**
 * Created by cuihua on 2017/1/13.
 *
 * 活动首页
 */
public class ActivityHomeServiceImpl implements ActivityHomeService {

    ActivityDAO activityDAO;
    GroupDAO groupDAO;

    public ActivityHomeServiceImpl() {
        activityDAO = new ActivityDAOImpl();
        groupDAO = new GroupDAOImpl();
    }

    public GroupModel getBasicInfo(String groupID) {
        return new GroupModel(groupDAO.getById(Integer.parseInt(groupID)));
    }

    public ResultMsg saveBasicInfo(GroupModel groupModel) throws NullException {
        if (groupModel == null) throw new NullException();

        boolean result = groupDAO.updateOne(new Group(groupModel));

        if (result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

    public String getDetailInfo(String activityID) {
        Activity activity = activityDAO.getById(Integer.parseInt(activityID));
        return activity.getDetailPath();
    }

    public ResultMsg saveDetailInfo(String activityID, String detailHTMLPath) throws InvalidHtmlPathException {
        if (!isValid(detailHTMLPath)) throw new InvalidHtmlPathException();

        Activity activity = activityDAO.getById(Integer.parseInt(activityID));
        activity.setDetailPath(detailHTMLPath);
        boolean result = activityDAO.updateOne(activity);

        if (result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

    /**
     *
     * @param htmlPath 待检查的html路径
     * @return 是否合法
     *
     * created by charles
     * last updated by charles
     * updating time 2017/1/23
     *
     * 待具体实现
     */
    private boolean isValid(String htmlPath) {
        return true;
    }
}
