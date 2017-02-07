package test.dao.impl;

import dao.DynamicCommentDAO;
import dao.DynamicDAO;
import dao.impl.DynamicCommentDAOImpl;
import dao.impl.DynamicDAOImpl;
import org.junit.Test;
import pojo.Dynamic;
import pojo.DynamicComment;

/**
 * Created by zoetx on 2017/1/29.
 */
public class DynamicDAOImplTest {


    @Test
    public void testDynamicDAOImpl() throws Exception {

        DynamicDAO impl = new DynamicDAOImpl();
        Dynamic g = impl.getById(1);
        System.out.print(g.getContent());
    }

    @Test
    public void testDynamicCommentDAOImpl() throws Exception {

        DynamicCommentDAO impl = new DynamicCommentDAOImpl();
        DynamicComment g = impl.getById(0);
        System.out.print(g.getContent());
    }
}
