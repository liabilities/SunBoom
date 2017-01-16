package service.impl;

import dao.PersonDAO;
import dao.impl.PersonDAOImpl;
import service.PersonService;

/**
 * Created by zs on 2016/7/10.
 */
public class PersonServiceImpl implements PersonService {

    public String getMail(String personID){
        PersonDAO dao = new PersonDAOImpl();
        int id = Integer.parseInt(personID);
        return dao.getById(id).getMail();
    }

}
