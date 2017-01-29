package test.dao.impl;

import dao.School2StudentDAO;
import dao.impl.School2StudentDAOImpl;
import org.junit.Test;
import pojo.School2Student;

import java.util.List;

/**
 * Created by zoetx on 2017/1/29.
 */
public class SchoolDAOImplTest {


    @Test
    public void testSchool2StudentImpl() throws Exception {
        School2StudentDAO dao = new School2StudentDAOImpl();
//        School2Student s = dao.getById(0);
        List<School2Student> list = dao.findByProperty("enrollmentYear",2016);
        System.out.print(list.get(0).getIdentificationTime());
    }
}
