package test.dao.impl;

import dao.MessageDAO;
import dao.impl.MessageDAOImpl;
import org.junit.Test;
import pojo.Message;

/**
 * Created by zoetx on 2017/1/29.
 */
public class MessageDAOImplTest {


    @Test
    public void testMessageDAOImpl() throws Exception {

        MessageDAO impl = new MessageDAOImpl();
        Message g = impl.getById(0);
        System.out.print(g.getContent());
    }
}
