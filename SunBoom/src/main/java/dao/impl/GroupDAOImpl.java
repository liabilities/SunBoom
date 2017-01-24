package dao.impl;

import dao.GroupDAO;
import dao.base.BaseDAOImpl;
import pojo.Group;
import utilities.exceptions.NotExistException;

/**
 * Created by I Like Milk on 2017/1/11.
 */
public class GroupDAOImpl extends BaseDAOImpl<Group> implements GroupDAO {

    public static void main(String[] args)throws NotExistException {
        GroupDAOImpl impl = new GroupDAOImpl();
        Group g = impl.getById(1);
        System.out.print(g.getName());
    }
}
