package dao.impl;


import dao.PersonDAO;
import dao.base.BaseDAOImpl;
import pojo.Person;
import utilities.exceptions.NotExistException;

/**
 * Created by zoetx on 2017/1/16.
 */
public class PersonDAOImpl extends BaseDAOImpl<Person> implements PersonDAO {

    public static void main(String[] args)throws NotExistException {
        PersonDAOImpl impl = new PersonDAOImpl();
        Person p = impl.getById(0);
        System.out.print(p.getAvatar());
    }

}
