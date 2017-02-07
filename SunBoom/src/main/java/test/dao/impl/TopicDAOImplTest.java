package test.dao.impl;

import dao.TopicDAO;
import dao.TopicReplyDAO;
import dao.impl.TopicDAOImpl;
import dao.impl.TopicReplyDAOImpl;
import org.junit.Test;
import pojo.Topic;
import pojo.TopicReply;

/**
 * Created by zoetx on 2017/1/30.
 */
public class TopicDAOImplTest {


    @Test
    public void tesTopicDAOImpl() throws Exception {
        TopicDAO impl = new TopicDAOImpl();
        Topic f = impl.getById(0);
        System.out.print(f.getContent());
    }

    @Test
    public void tesTopicReplyDAOImpl() throws Exception {
        TopicReplyDAO impl = new TopicReplyDAOImpl();
        TopicReply f = impl.getById(0);
        System.out.print(f.getContent());
    }
}
