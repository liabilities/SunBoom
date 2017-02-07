package test.dao.impl;

import dao.Group2MemberDAO;
import dao.TempGroupDAO;
import dao.impl.Group2MemberDAOImpl;
import dao.impl.GroupDAOImpl;
import dao.impl.TempGroupDAOImpl;
import org.junit.Test;
import pojo.Group;
import pojo.Group2Member;
import pojo.TempGroup;

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

    @Test
    public void testTempGroupDAOImpl() throws Exception {

        TempGroupDAO impl = new TempGroupDAOImpl();
        TempGroup g = impl.getById(10);
        System.out.print(g.getMemberRequestion());
    }
}
