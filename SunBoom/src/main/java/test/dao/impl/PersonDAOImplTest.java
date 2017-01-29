package test.dao.impl;

import dao.PersonDAO;
import dao.impl.PersonDAOImpl;
import org.junit.Test;
import pojo.Person;

/**
 * Created by zoetx on 2017/1/29.
 */
public class PersonDAOImplTest {

    PersonDAO dao;


    @Test
    public void testPersonDAOImpl() throws Exception {
        PersonDAOImpl impl = new PersonDAOImpl();
        Person p = impl.getById(0);
        System.out.print(p.getAvatar());
    }
}
