package dao.impl;

import dao.ActivityDAO;
import pojo.Activity;

/**
 * Created by mm on 2016/7/11.
 */
public class ActivityDAOImpl extends BaseDAOImpl<Activity> implements ActivityDAO {

    public ActivityDAOImpl() {
        super(new Activity());
    }
}
