package dao.impl;

import dao.DynamicDAO;
import pojo.Dynamic;

/**
 * Created by mm on 2016/7/11.
 */
public class DynamicDAOImpl extends BaseDAOImpl<Dynamic> implements DynamicDAO {

    public DynamicDAOImpl() {
        super(new Dynamic());
    }
}
