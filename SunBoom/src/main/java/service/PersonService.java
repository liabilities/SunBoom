package service;

import utilities.exceptions.NotExistException;

/**
 * Created by zs on 2016/7/10.
 * Last changed by zs.
 * Updating time: 2016/7/10.
 */
public interface PersonService {

    public String getMail(String personID) throws NotExistException;

}
