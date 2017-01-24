package dao.impl;

import dao.GroupDAO;
import dao.base.BaseDAOImpl;
import pojo.Group;
import utilities.exceptions.NotExistException;

import java.util.*;

/**
 * Created by I Like Milk on 2017/1/11.
 */
public class GroupDAOImpl extends BaseDAOImpl<Group> implements GroupDAO {

    public static void main(String[] args)throws NotExistException {
        GroupDAOImpl impl = new GroupDAOImpl();
        Group g = impl.getById(1);
        System.out.print(g.getName());
        g.setName("学生会");
        ArrayList<Group> list = new ArrayList<Group>();
        Group g2 = new Group(g);
        list.add(g2);
        g2.setGroupID(11);
        impl.deleteList(list);
    }
}
