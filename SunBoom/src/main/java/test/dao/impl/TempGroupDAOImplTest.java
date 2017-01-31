package test.dao.impl;

import dao.TempGroupDAO;
import dao.impl.TempGroupDAOImpl;
import org.junit.Test;
import pojo.TempGroup;

/**
 * Created by zoetx on 2017/1/29.
 */
public class TempGroupDAOImplTest {


    @Test
    public void testTempGroupDAOImpl() throws Exception {

        TempGroupDAO impl = new TempGroupDAOImpl();
        TempGroup g = impl.getById(10);
        System.out.print(g.getMemberRequestion());
    }
}
