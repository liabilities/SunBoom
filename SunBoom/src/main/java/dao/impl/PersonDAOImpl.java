package dao.impl;

import dao.PersonDAO;
import pojo.Person;

/**
 * Created by mm on 2016/7/11.
 */
public class PersonDAOImpl extends BaseDAOImpl<Person> implements PersonDAO {

    public PersonDAOImpl() {
        super(new Person());
    }
}
