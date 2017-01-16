package dao.impl;

import dao.PrivateLetterDAO;
import pojo.PrivateLetter;

/**
 * Created by zoetx on 2017/1/16.
 */
public class PrivateLetterDAOImpl extends BaseDAOImpl<PrivateLetter> implements PrivateLetterDAO{

    public static void main(String[] args){

        PrivateLetterDAOImpl impl = new PrivateLetterDAOImpl();
        PrivateLetter letter = impl.getById(1);
        System.out.print(letter.getContent());
    }


    public PrivateLetterDAOImpl() {
        super(new PrivateLetter());
    }
}
