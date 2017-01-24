package test.service.impl;

import model.GroupModel;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import service.GroupHomeService;
import service.impl.GroupHomeServiceImpl;
import utilities.enums.ResultMsg;
import utilities.exceptions.NotExistException;

import static org.junit.Assert.assertEquals;

/**
 * GroupHomeServiceImpl Tester.
 *
 * @author charles
 * @version 1.0
 * @since <pre>一月 24, 2017</pre>
 *
 * TODO 小他：数据层未对传下去的数据项不存在的情况进行处理，抛出NotExistException（虽然实际情况中应该不会出现该情况
 */
public class GroupHomeServiceImplTest {

    GroupHomeService groupHomeService;

    @Before
    public void before() throws Exception {
        groupHomeService = new GroupHomeServiceImpl();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getBasicInfo(String groupID)
     */
    @Test
    public void testGetBasicInfo() throws Exception {
        GroupModel thisGroupModel01 = null;
        GroupModel thisGroupModel02 = null;

        try {
            thisGroupModel01 = groupHomeService.getBasicInfo("0");
            thisGroupModel02 = groupHomeService.getBasicInfo("2");

        } catch (NotExistException e) {
            e.printStackTrace();
        }

        assertEquals(0, thisGroupModel01.getSchoolID_int());
        assertEquals(11, thisGroupModel02.getSchoolID_int());
    }

    /**
     * Method: saveBasicInfo(GroupModel groupModel)
     */
    @Test
    public void testSaveBasicInfo01() throws Exception {
        GroupModel thisGroupModel = new GroupModel("1", "11", "123", "Charles", "kkk", "asdfghjkl", "www.asd.com",
                "123456", 7, "CharlesFeng", "1234567890", "1234@nju.edu.cn", "www.122.com", "2017-01-01", "2017-01-02",
                "2017-01-03", 4, 1, "www.zxc.com");

        ResultMsg resultMsg = ResultMsg.FAIL;
        resultMsg = groupHomeService.saveBasicInfo(thisGroupModel);
        assertEquals(ResultMsg.SUCCESS, resultMsg);
    }

    /**
     * Method: saveBasicInfo(GroupModel groupModel)
     */
//    @Test
//    public void testSaveBasicInfo02() throws Exception {
//        GroupModel thisGroupModel = new GroupModel("12", "11", "123", "Charles", "kkk", "asdfghjkl", "www.asd.com",
//                "123456", 7, "CharlesFeng", "1234567890", "1234@nju.edu.cn", "www.122.com", "2017-01-01", "2017-01-02",
//                "2017-01-03", 4, 1, "www.zxc.com");
//
//        ResultMsg resultMsg = ResultMsg.FAIL;
//        resultMsg = groupHomeService.saveBasicInfo(thisGroupModel);
//        assertEquals(ResultMsg.SUCCESS, resultMsg);
//    }

    /**
     * Method: getDetailInfo(String activityID)
     */
    @Test
    public void testGetDetailInfo() throws Exception {
        String detailPath01 = null;
        String detailPath02 = null;

        try {
            detailPath01 = groupHomeService.getDetailInfo("7");
            detailPath02 = groupHomeService.getDetailInfo("10");

        } catch (NotExistException e) {
            e.printStackTrace();
        }

        assertEquals("www.777.com", detailPath01);
        assertEquals("www.10.org", detailPath02);
    }

    /**
     * Method: saveDetailInfo(String activityID, String detailHTMLPath)
     */
    @Test
    public void testSaveDetailInfo01() throws Exception {
        String aimedDetailPath = "www.8888888.cn";
        ResultMsg resultMsg = ResultMsg.FAIL;

        resultMsg = groupHomeService.saveDetailInfo("8", aimedDetailPath);
        assertEquals(ResultMsg.SUCCESS, resultMsg);
    }

    /**
     * Method: saveDetailInfo(String activityID, String detailHTMLPath)
     */
//    @Test
//    public void testSaveDetailInfo02() throws Exception {
//        String aimedDetailPath = "www.8888888.cn";
//        ResultMsg resultMsg = ResultMsg.FAIL;
//
//        resultMsg = groupHomeService.saveDetailInfo("11", aimedDetailPath);
//        assertEquals(ResultMsg.SUCCESS, resultMsg);
//    }

    /**
     * Method: isValid(String htmlPath)
     */
    @Test
    public void testIsValid() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = GroupHomeServiceImpl.getClass().getMethod("isValid", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
