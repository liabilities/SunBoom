package dao.impl;

import tool.Connection;
import dao.PersonDAO;
import org.hibernate.Session;
import pojo.Person;

import java.util.List;

/**
 * Created by mm on 2016/7/11.
 */
public class PersonDAOImpl extends BaseDAOImpl<Person> implements PersonDAO {

    @Override
    public boolean addPo(Person po) {
        System.out.println("add");
        return false;
    }
    @Override
    public Person findPo(int id) {
        System.out.println(id);
        Session session= Connection.getSession();
        System.out.println("find");
        try {
            Person person=(Person)session.get(Person.class,id);
            Connection.closeSession(session);
            if(person!=null){
                return person;
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            Connection.closeSession(session);
            return  null;
        }
    }
    @Override
    public boolean updatePo(Person po) {
        System.out.println("update");
        return false;
    }
    @Override
    public boolean deleteOne(Person po) {
        System.out.println("delete");
        return false;
    }
    @Override
    public List<Person> getAll() {
        return null;
    }
}
