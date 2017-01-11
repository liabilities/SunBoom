package DaoTest;

import DaoImpl.UserDaoImpl;
import POJO.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 27, 2016</pre> 
* @version 1.0 
*/ 
public class UserDaoImplTest {
    UserDaoImpl userDao;

@Before
public void before() throws Exception {
    userDao=new UserDaoImpl();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addUser(User po) 
* 
*/ 
@Test
public void testAddUser() throws Exception { 
//TODO: Test goes here...
    User user=new User();
    user.setId("Frebin");
    user.setPassword("chaoshuai");
    user.setUserLogin("shuai");
    user.setUserState("shuai");
    user.setChecklistPath("shuai");
//    user.setEmail("live");
    System.out.println(userDao.addUser(user));
} 

/** 
* 
* Method: findUser(User po) 
* 
*/ 
@Test
public void testFindUser() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: update(User po) 
* 
*/ 
@Test
public void testUpdate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(User po) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllUserId() 
* 
*/ 
@Test
public void testGetAllUserId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: updateHeadPortrait(User po) 
* 
*/ 
@Test
public void testUpdateHeadPortrait() throws Exception { 
//TODO: Test goes here...
    User user=new User();
    user.setId("asdf");
    user.setHeadPortrait("shabichao");
    System.out.println(userDao.updateHeadPortrait(user));
}

    @Test
    public void testGetSimilarUser() throws Exception {
//TODO: Test goes here...
        ArrayList<User> arrayList=(ArrayList<User>) userDao.getSimilarUser("qe");
        for (User po:arrayList
             ) {
            System.out.println(po.getId());
        }
    }
} 
