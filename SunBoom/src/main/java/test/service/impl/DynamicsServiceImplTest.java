package test.service.impl;

import model.Dynamic;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.DynamicsService;
import service.impl.DynamicsServiceImpl;
import service.impl.FellowServiceImpl;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by lenovo on 2017/2/18.
 */
public class DynamicsServiceImplTest {

    DynamicsService dynamicsService;

    @Before
    public void before(){
        dynamicsService = new DynamicsServiceImpl();
    }

    @After
    public void after(){

    }

    @Test
    public void testGetDynamicListByName() throws Exception{
        List<Dynamic> list = dynamicsService.getDynamicListByName("南京大学软件学院新媒体中心");
        assertEquals("hello world",list.get(0).getContent());
    }



}
