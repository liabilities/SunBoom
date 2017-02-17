package test.dao.impl;

import dao.NetworkingDAO;
import dao.ResponsorDAO;
import dao.impl.NetworkingDAOImpl;
import dao.impl.ResponsorDAOImpl;
import org.junit.Test;
import pojo.Networking;
import pojo.Responsor;

/**
 * Created by zoetx on 2017/1/30.
 */
public class NetworkingDAOImplTest {


    @Test
    public void testNetworkingDAOImpl() throws Exception {
        NetworkingDAO impl = new NetworkingDAOImpl();
        Networking f = impl.getById(0);
        System.out.print(f.getName());
    }

    @Test
    public void testResponsorDAOImpl() throws Exception {
        ResponsorDAO impl = new ResponsorDAOImpl();
        Responsor f = impl.getById(0);
        System.out.print(f.getNetworkingID());
    }
}
