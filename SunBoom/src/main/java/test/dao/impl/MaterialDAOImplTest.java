package test.dao.impl;

import dao.MaterialDAO;
import dao.impl.MaterialDAOImpl;
import org.junit.Test;
import pojo.Material;

/**
 * Created by zoetx on 2017/1/29.
 */
public class MaterialDAOImplTest {


    @Test
    public void testMaterialDAOImpl() throws Exception {
        MaterialDAO impl = new MaterialDAOImpl();
        Material g = impl.getById(0);
        System.out.print(g.getDescription());
    }
}
