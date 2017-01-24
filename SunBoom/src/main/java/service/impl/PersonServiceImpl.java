package service.impl;

import dao.PersonDAO;
import dao.impl.PersonDAOImpl;
import service.PersonService;
import utilities.exceptions.NotExistException;

/**
 * Created by zs on 2016/7/10.
 * Last changed by zs.
 * Updating time: 2016/7/10.
 */
public class PersonServiceImpl implements PersonService {

    public String getMail(String personID) throws NotExistException {
        PersonDAO dao = new PersonDAOImpl();
        int id = Integer.parseInt(personID);
        return dao.getById(id).getMail();
    }

}
