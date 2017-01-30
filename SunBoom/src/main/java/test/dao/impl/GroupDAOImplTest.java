package test.dao.impl;

import dao.Group2MemberDAO;
import dao.impl.Group2MemberDAOImpl;
import dao.impl.GroupDAOImpl;
import org.junit.Test;
import pojo.Group;
import pojo.Group2Member;

/**
 * Created by zoetx on 2017/1/29.
 */
public class GroupDAOImplTest {


    @Test
    public void testGroupDAOImpl() throws Exception {
        GroupDAOImpl impl = new GroupDAOImpl();
        Group g = impl.getById(1);
        System.out.print(g.getName());
    }

    @Test
    public void testGroup2Member() throws Exception {
        Group2MemberDAO impl = new Group2MemberDAOImpl();
        Group2Member g = impl.getById(0);
        System.out.print(g.getAddTime());
    }
}
