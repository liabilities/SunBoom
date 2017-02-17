package test.dao.impl;

import dao.CodeDAO;
import dao.impl.CodeDAOImpl;
import org.junit.Test;
import pojo.Code;

/**
 * Created by zoetx on 2017/1/30.
 */
public class CodeDAOImplTest {


    @Test
    public void testCodeDAOImpl() throws Exception {
        CodeDAO impl = new CodeDAOImpl();
        Code f = impl.getById(0);
        System.out.print(f.getDdl());
    }
}
