package test.dao.impl;

import dao.School2StudentDAO;
import dao.impl.School2StudentDAOImpl;
import org.junit.Test;
import pojo.School2Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zoetx on 2017/1/29.
 */
public class SchoolDAOImplTest {


    @Test
    public void testSchool2StudentImpl() throws Exception {
        School2StudentDAO dao = new School2StudentDAOImpl();
//        School2Student s = dao.getById(0);
//        List<School2Student> list = dao.findByProperty("enrollmentYear",2016);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("enrollmentYear",2016);
        map.put("schoolID",0);
        List<School2Student> list = dao.findByProperty(map);

        System.out.print(list.size());
    }
}
