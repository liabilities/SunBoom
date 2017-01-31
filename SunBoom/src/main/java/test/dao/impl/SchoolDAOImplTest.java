package test.dao.impl;

import dao.School2GroupDAO;
import dao.School2StudentDAO;
import dao.SchoolDAO;
import dao.impl.School2GroupDAOImpl;
import dao.impl.School2StudentDAOImpl;
import dao.impl.SchoolDAOImpl;
import org.junit.Test;
import pojo.School;
import pojo.School2Group;
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
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("enrollmentYear", 2016);
        map.put("schoolID", 0);
        List<School2Student> list = dao.findByProperty(map);

        System.out.print(list.size());
    }

    @Test
    public void testSchool2GroupImpl() throws Exception {
        School2GroupDAO dao = new School2GroupDAOImpl();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("enrollmentYear", 2016);
        map.put("schoolID", 0);
        List<School2Group> list = dao.findByProperty(map);

        System.out.print(list.size());
    }

        @Test
        public void testSchool() throws Exception {
            SchoolDAO dao2 = new SchoolDAOImpl();
            School s = dao2.getById(0);
            System.out.print(s.getSchoolName());
        }

}
