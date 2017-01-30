package test.dao.impl;

import dao.FileDAO;
import dao.impl.FileDAOImpl;
import org.junit.Test;
import pojo.File;

/**
 * Created by zoetx on 2017/1/30.
 */
public class FileDAOImplTest {


    @Test
    public void testFileDAOImpl() throws Exception {
        FileDAO impl = new FileDAOImpl();
        File f = impl.getById(0);
        System.out.print(f.getPath());
    }
}
