package service.impl;

import dao.GroupDAO;
import dao.impl.GroupDAOImpl;
import model.GroupModel;
import pojo.Group;
import service.GroupHomeService;
import utilities.enums.ResultMsg;
import utilities.exceptions.InvalidHtmlPathException;
import utilities.exceptions.NotExistException;
import utilities.exceptions.NullException;

/**
 * Created by cuihua on 2017/1/13.
 * Last changed by charles.
 * Updating time: 2017/1/23.
 */
public class GroupHomeServiceImpl implements GroupHomeService {

    GroupDAO groupDAO;

    public GroupHomeServiceImpl() {
        groupDAO = new GroupDAOImpl();
    }

    public GroupModel getBasicInfo(String groupID) throws NotExistException {
        return new GroupModel(groupDAO.getById(Integer.parseInt(groupID)));
    }

    public ResultMsg saveBasicInfo(GroupModel groupModel) throws NullException, NotExistException {
        if (groupModel == null) throw new NullException();

        boolean result = groupDAO.updateOne(new Group(groupModel));

        if (result) return ResultMsg.SUCCESS;
        else return ResultMsg.FAIL;
    }

    public String getDetailInfo(String activityID) throws NotExistException {
        Group thisGroup = groupDAO.getById(Integer.parseInt(activityID));
        return thisGroup.getDetailPath();
    }

    public ResultMsg saveDetailInfo(String activityID, String detailHTMLPath) throws InvalidHtmlPathException, NotExistException {
        if (!isValid(detailHTMLPath)) throw new InvalidHtmlPathException();

        Group thisGroup = groupDAO.getById(Integer.parseInt(activityID));
        thisGroup.setDetailPath(detailHTMLPath);
        boolean result = groupDAO.updateOne(thisGroup);

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
     * TODO charles：待具体实现，暂不知HTML路径存取的格式
     */
    private boolean isValid(String htmlPath) {
        return true;
    }
}
