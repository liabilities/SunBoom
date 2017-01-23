package dao.impl;

import dao.PrivateLetterDAO;
import dao.base.BaseDAOImpl;
import pojo.PrivateLetter;

/**
 * Created by zoetx on 2017/1/16.
 */
public class PrivateLetterDAOImpl extends BaseDAOImpl<PrivateLetter> implements PrivateLetterDAO{

    public static void main(String[] args){
        PrivateLetterDAOImpl impl = new PrivateLetterDAOImpl();
        PrivateLetter pl = impl.getById(1);
        System.out.print(pl.getContent());
    }

}
