package dao.impl;

import connection.connection;
import dao.ActivityDAO;
import org.hibernate.Session;
import pojo.Activity;

import java.util.List;

/**
 * Created by mm on 2016/7/11.
 */
public class ActivityDAOImpl extends BaseDAOImpl<Activity> implements ActivityDAO {

    public static void main(String[] args){
        ActivityDAOImpl impl = new ActivityDAOImpl();
        Activity act = impl.findPo(1);
        System.out.println(act.getName());
    }

    @Override
    public boolean addPo(Activity po) {
        return super.addPo(po);
    }

    @Override
    public Activity findPo(int id) {
        Session session= connection.getSession();
        System.out.println("find");
        try {
            Activity activity =(Activity)session.get(Activity.class,id);
            connection.closeSession(session);
            if(activity!=null){
                return activity;
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            connection.closeSession(session);
            return  null;
        }
    }

    @Override
    public boolean updatePo(Activity po) {
        return super.updatePo(po);
    }

    @Override
    public boolean deleteOne(Activity po) {
        return super.deleteOne(po);
    }

    @Override
    public List<Activity> getAll() {
        return super.getAll();
    }
}
