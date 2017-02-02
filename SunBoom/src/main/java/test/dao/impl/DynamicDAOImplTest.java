package test.dao.impl;

import dao.DynamicDAO;
import dao.impl.DynamicDAOImpl;
import org.junit.Test;
import pojo.Dynamic;

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
}
