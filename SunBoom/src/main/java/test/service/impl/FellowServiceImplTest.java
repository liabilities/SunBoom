package test.service.impl;

import model.GroupModel;
import model.Letter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.FellowService;
import service.impl.FellowServiceImpl;
import utilities.enums.ResultMsg;

import java.util.Calendar;
import java.util.Date;
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
    public void testGetChatLog() throws Exception {
        List<Letter> list = fellowService.getChatLog("se@nju","CharlesFeng");
        assertEquals("Guten Abend!",list.get(0).getContent());
        assertEquals("Hey!",list.get(1).getContent());
        assertEquals("pu",list.get(2).getContent());
    }

    @Test
    public void testSaveChatLog() throws Exception{
        Letter privateLetter = new Letter();
        privateLetter.setSendTime(Calendar.getInstance().getTime());
        privateLetter.setSenderGroupID("1");
        privateLetter.setReceiverGroupID("2");
        privateLetter.setContent("lalala~");
        ResultMsg resultMsg = fellowService.saveChatLog(privateLetter);
        assertEquals(ResultMsg.SUCCESS, resultMsg);
    }

    @Test
    public void testSendMessage() throws Exception {
        Date date = fellowService.sendMessage("lalalalalaze~","se@nju","CharlesFeng");
    }

    @Test
    public void testDeleteMessage() throws Exception {
        Letter privateLetter = new Letter();
        privateLetter.setPrivateLetterID("4");
        ResultMsg resultMsg = fellowService.deleteMessage(privateLetter);
        assertEquals(ResultMsg.SUCCESS, resultMsg);
    }

    @Test
    public void testTransmitMessage() throws Exception {
        Date date = fellowService.transmitMessage("lalalalalaze~","1","2");
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
