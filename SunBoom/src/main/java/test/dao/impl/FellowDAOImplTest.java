package test.dao.impl;

import dao.FellowDAO;
import dao.impl.FellowDAOImpl;
import org.junit.Test;
import pojo.Fellow;

/**
 * Created by zoetx on 2017/1/29.
 */
public class FellowDAOImplTest {


    @Test
    public void testFellowDAOImpl() throws Exception {

        FellowDAO impl = new FellowDAOImpl();
        Fellow g = impl.getById(0);
        System.out.print(g.getFollowedID());
    }
}
