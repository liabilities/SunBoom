package test.dao.impl;

import dao.NetWorkingDAO;
import dao.impl.NetworkingDAOImpl;
import org.junit.Test;
import pojo.Networking;

/**
 * Created by zoetx on 2017/1/30.
 */
public class NetworkingDAOImplTest {


    @Test
    public void testNetworkingDAOImpl() throws Exception {
        NetWorkingDAO impl = new NetworkingDAOImpl();
        Networking f = impl.getById(0);
        System.out.print(f.getName());
    }
}
