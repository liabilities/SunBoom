package test.dao.impl;

import dao.SponsorDAO;
import dao.impl.SponsorDAOImpl;
import org.junit.Test;
import pojo.Sponsor;

/**
 * Created by zoetx on 2017/1/29.
 */
public class SponsorDAOImplTest {


    @Test
    public void testSponsorDAOImpl() throws Exception {
        SponsorDAO impl = new SponsorDAOImpl();
        Sponsor g = impl.getById(0);
        System.out.print(g.getStartTime());
    }
}
