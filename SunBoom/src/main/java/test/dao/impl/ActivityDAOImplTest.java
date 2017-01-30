package test.dao.impl;

import dao.ActivityDAO;
import dao.impl.ActivityDAOImpl;
import org.junit.Test;
import pojo.Activity;

/**
 * Created by zoetx on 2017/1/30.
 */
public class ActivityDAOImplTest {


    @Test
    public void testActivityDAOImpl() throws Exception {
        ActivityDAO impl = new ActivityDAOImpl();
        Activity f = impl.getById(0);
        System.out.print(f.getName());
    }
}
