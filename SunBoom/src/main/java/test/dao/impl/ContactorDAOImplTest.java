package test.dao.impl;

import dao.ContactorDAO;
import dao.impl.ContactorDAOImpl;
import org.junit.Test;
import pojo.Contactor;

/**
 * Created by zoetx on 2017/1/29.
 */
public class ContactorDAOImplTest {


    @Test
    public void testContactorDAOImpl() throws Exception {

        ContactorDAO impl = new ContactorDAOImpl();
        Contactor g = impl.getById(0);
        System.out.print(g.getIdB());
    }
}
