package dao.impl;

import dao.GroupTestDAO;
import dao.base.BaseDAOImpl;
import pojo.Group;
import utilities.exceptions.NotExistException;

/**
 * Created by zoetx on 2017/1/16.
 */
public class GroupTestDAOImpl extends BaseDAOImpl<Group> implements GroupTestDAO {

    public static void main(String[] args)throws NotExistException {
        GroupTestDAOImpl impl = new GroupTestDAOImpl();
        Group pl = impl.getById(1);
        System.out.print(pl.getName());
    }

}
