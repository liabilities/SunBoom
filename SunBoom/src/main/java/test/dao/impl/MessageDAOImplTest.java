package test.dao.impl;

import dao.MessageDAO;
import dao.MessageReplyDAO;
import dao.impl.MessageDAOImpl;
import dao.impl.MessageReplyDAOImpl;
import org.junit.Test;
import pojo.Message;
import pojo.MessageReply;

/**
 * Created by zoetx on 2017/1/29.
 */
public class MessageDAOImplTest {

    @Test
    public void testMessageReplyDAOImpl() throws Exception {

        MessageReplyDAO impl = new MessageReplyDAOImpl();
        MessageReply g = impl.getById(0);
        System.out.print(g.getContent());
    }


    @Test
    public void testMessageDAOImpl() throws Exception {

        MessageDAO impl = new MessageDAOImpl();
        Message g = impl.getById(0);
        System.out.print(g.getContent());
    }

}
