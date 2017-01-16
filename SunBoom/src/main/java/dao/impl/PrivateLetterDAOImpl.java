package dao.impl;

import dao.PrivateLetterDAO;
import pojo.PrivateLetter;

/**
 * Created by zoetx on 2017/1/16.
 */
public class PrivateLetterDAOImpl extends BaseDAOImpl<PrivateLetter> implements PrivateLetterDAO{


    public PrivateLetterDAOImpl() {
        super(new PrivateLetter());
    }
}
