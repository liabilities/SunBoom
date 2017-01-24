package dao.impl;

import dao.PrivateLetterDAO;
import dao.base.BaseDAOImpl;
import pojo.PrivateLetter;
import utilities.exceptions.NotExistException;

/**
 * Created by zoetx on 2017/1/16.
 */
public class PrivateLetterDAOImpl extends BaseDAOImpl<PrivateLetter> implements PrivateLetterDAO{

    public static void main(String[] args)throws NotExistException {
        PrivateLetterDAOImpl impl = new PrivateLetterDAOImpl();
        PrivateLetter pl = impl.getById(1);
        System.out.print(pl.getContent());
    }

}
