package service.impl;

import dao.PersonDao;
import dao.impl.PersonDaoImpl;
import service.PersonService;

/**
 * Created by zs on 2016/7/10.
 */
public class PersonServiceImpl implements PersonService {

    public String getMail(String personID){
        PersonDao dao = new PersonDaoImpl();
        int id = Integer.parseInt(personID);
        return dao.findPo(id).getMail();
    }

}
