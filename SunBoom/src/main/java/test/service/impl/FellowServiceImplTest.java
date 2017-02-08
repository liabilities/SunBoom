package test.service.impl;

import model.GroupModel;
import model.PrivateLetter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.FellowService;
import service.impl.FellowServiceImpl;
import utilities.enums.ResultMsg;

import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by lenovo on 2017/2/7.
 */
public class FellowServiceImplTest {

    FellowService fellowService;

    @Before
    public void before(){
        fellowService = new FellowServiceImpl();
    }

    @After
    public void after(){

    }

    @Test
    public void testGetFellows() throws Exception{
        List<GroupModel> models = fellowService.getFellows("0");
        assertEquals("n",models.get(0).getCapital());
        assertEquals("s",models.get(1).getCapital());
    }

    @Test
    public void testGetFellowList() throws Exception{
        List<String> list = fellowService.getFellowList("0");
        assertEquals("1",list.get(0));
    }

    @Test
    public void testGetMessageByID() throws Exception {
        List<PrivateLetter> list = fellowService.getMessageByID("1","2");
        assertEquals("hello my friend",list.get(0).getContent());
    }

    @Test
    public void testSaveMessage() throws Exception{
        PrivateLetter privateLetter = new PrivateLetter();
        privateLetter.setSendTime(Calendar.getInstance().getTime());
        privateLetter.setSenderGroupID("1");
        privateLetter.setReceiverGroupID("2");
        privateLetter.setSenderGroupName("new media");
        privateLetter.setReceiverGroupName("student union");
        privateLetter.setContent("lalala~");
        ResultMsg resultMsg = fellowService.saveMessage(privateLetter);
        assertEquals(ResultMsg.SUCCESS, resultMsg);
    }

    @Test
    public void testSendMessage() throws Exception {
        PrivateLetter privateLetter = fellowService.sendMessage("lalalalalaze~","1","0");
    }

    @Test
    public void testDeleteMessage() throws Exception {
        PrivateLetter privateLetter = new PrivateLetter();
        privateLetter.setPrivateLetterID("4");
        ResultMsg resultMsg = fellowService.deleteMessage(privateLetter);
        assertEquals(ResultMsg.SUCCESS, resultMsg);
    }

    @Test
    public void testTransmitMessage() throws Exception {
        PrivateLetter privateLetter = fellowService.transmitMessage("lalalalalaze~","1","2");
    }

    @Test
    public void testAddFellow() throws Exception {
        ResultMsg resultMsg = fellowService.addFellow("0","student union");
        assertEquals(ResultMsg.SUCCESS, resultMsg);
    }

    @Test
    public void testDeleteFellow() throws Exception {
        ResultMsg resultMsg = fellowService.deleteFellow("0","牛");
        assertEquals(ResultMsg.SUCCESS, resultMsg);
    }

    @Test
    public void testSearchFellow() throws Exception {
        List<String> list = fellowService.searchFellow("0","fg");
        assertEquals("1",list.get(0));
    }
}
