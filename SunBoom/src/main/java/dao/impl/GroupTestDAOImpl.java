package dao.impl;

import dao.GroupTestDAO;
import dao.base.BaseDAOImpl;
import pojo.GroupTest;
import utilities.exceptions.NotExistException;

/**
 * Created by zoetx on 2017/1/16.
 */
public class GroupTestDAOImpl extends BaseDAOImpl<GroupTest> implements GroupTestDAO {

    public static void main(String[] args)throws NotExistException {
        GroupTestDAOImpl impl = new GroupTestDAOImpl();
        GroupTest pl = impl.getById(1);
        System.out.print(pl.getName());
    }

}
