package DaoImpl;

import connection.connection;
import dao.PersonDao;
import pojo.Person;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by mm on 2016/7/11.
 */
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDao{

    @Override
    public boolean addPo(Person po) {
        System.out.println("add");
        return false;
    }
    @Override
    public Person findPo(int id) {
        System.out.println(id);
        Session session= connection.getSession();
        System.out.println("find");
        try {
            Person person=(Person)session.get(Person.class,id);
            connection.closeSession(session);
            if(person!=null){
                return person;
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            connection.closeSession(session);
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