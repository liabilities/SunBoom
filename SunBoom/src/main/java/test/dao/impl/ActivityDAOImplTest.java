package test.dao.impl;

import dao.ActivityDAO;
import dao.AxisDAO;
import dao.IndividualActivityDAO;
import dao.PublicityDAO;
import dao.impl.ActivityDAOImpl;
import dao.impl.AxisDAOImpl;
import dao.impl.IndividualActivityDAOImpl;
import dao.impl.PublicityDAOImpl;
import org.junit.Test;
import pojo.Activity;
import pojo.Axis;
import pojo.IndividualActivity;
import pojo.Publicity;

/**
 * Created by zoetx on 2017/1/30.
 */
public class ActivityDAOImplTest {


    @Test
    public void testActivityDAOImpl() throws Exception {
        ActivityDAO impl = new ActivityDAOImpl();
        Activity f = impl.getById(0);
        System.out.print(f.getName());
    }

    @Test
    public void testIndividualActivityDAOImpl() throws Exception {
        IndividualActivityDAO impl = new IndividualActivityDAOImpl();
        IndividualActivity f = impl.getById(0);
        System.out.print(f.getNeededNum());
    }

    @Test
    public void testAxisDAOImpl() throws Exception {
        AxisDAO impl = new AxisDAOImpl();
        Axis f = impl.getById(0);
        System.out.print(f.getActivityID());
    }

    @Test
    public void testPublicityDAOImpl() throws Exception {
        PublicityDAO impl = new PublicityDAOImpl();
        Publicity f = impl.getById(0);
        System.out.print(f.getActivityID());
    }
}
