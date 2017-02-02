package test.dao.impl;

import dao.LetterDAO;
import dao.impl.LetterDAOImpl;
import org.junit.Test;
import pojo.Letter;

/**
 * Created by zoetx on 2017/1/29.
 */
public class LetterDAOImplTest {


    @Test
    public void testLetterDAOImpl() throws Exception {
        LetterDAO impl = new LetterDAOImpl();
        Letter g = impl.getById(0);
        System.out.print(g.getContent());
    }
}
