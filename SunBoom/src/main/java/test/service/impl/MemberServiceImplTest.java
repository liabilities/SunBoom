package test.service.impl;

import model.PersonModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.MemberService;
import service.impl.MemberServiceImpl;
import utilities.enums.ResultMsg;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by lenovo on 2017/2/6.
 */
public class MemberServiceImplTest {

    MemberService memberService;

    @Before
    public void before() throws Exception{
        memberService = new MemberServiceImpl();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGetMemberList() throws  Exception{
        List<String> lists = memberService.getMemberList("0");
        assertEquals("txt",lists.get(0));
    }

    @Test
    public void testGetMemberListInfo() throws Exception{
        List<PersonModel> lists = memberService.getMemberListInfo("0");
        assertEquals("zoe",lists.get(0).getUsername());
    }

    @Test
    public void testAddMember() throws Exception {
        ResultMsg resultMsg = memberService.addMember("0","1");
        assertEquals(ResultMsg.SUCCESS, resultMsg);
    }

    @Test
    public void testGenerateCode() throws Exception {
        String s = memberService.generateCode();
        assertEquals(8, s.length());
    }

    @Test
    public void testDeleteMember() throws Exception {
        ResultMsg resultMsg = memberService.deleteMember("0","txin");
        assertEquals(ResultMsg.SUCCESS, resultMsg);
    }
}
