package test.dao.impl;

import dao.impl.GroupDAOImpl;
import org.junit.Test;
import pojo.Group;

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
}
