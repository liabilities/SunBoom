package DaoImpl;

import Connection.connection;
import Dao.UserDao;
import POJO.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by mm on 2016/7/11.
 */
public class UserDaoImpl implements UserDao {
    public boolean addUser(User po) {
        Session session= connection.getSession();
        try {
            if (findUser(po)==null){
                session.save(po);
                Transaction transaction=session.beginTransaction();
                transaction.commit();
                connection.closeSession(session);
                return true;
            }else {
                connection.closeSession(session);
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            connection.closeSession(session);
            return false;
        }
    }

    public User findUser(User po) {
        Session session= connection.getSession();
        try {
            User user=(User)session.get(User.class,po.getId());
            connection.closeSession(session);
            if(user!=null){
                return user;
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            connection.closeSession(session);
            return  null;
        }
    }

    public boolean update(User po) {
        Session session= connection.getSession();
        try {
            if (findUser(po)!=null){
                session.update(po);
                Transaction transaction=session.beginTransaction();
                transaction.commit();
                connection.closeSession(session);
                return true;
            }else {
                connection.closeSession(session);
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            connection.closeSession(session);
            return false;
        }
    }

    public boolean delete(User po) {
        Session session= connection.getSession();
        try {
            if (findUser(po)!=null){
                User user=new User();
                user.setId(po.getId());
                session.delete(user);
                Transaction transaction=session.beginTransaction();
                transaction.commit();
                connection.closeSession(session);
                return true;
            }else {
                connection.closeSession(session);
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            connection.closeSession(session);
            return false;
        }
    }

    public List getAllUserId(){
        Session session=connection.getSession();
        try {
            String hql="select id from User";
            Query query=session.createQuery(hql);
            List list=query.list();
            connection.closeSession(session);
            return list;
        }catch (Exception e){
            connection.closeSession(session);
            return null;
        }
    }

    public boolean updateHeadPortrait(User po) {
        Session session=connection.getSession();
        try {
            if (findUser(po)!=null){
                String hql="update User u set u.headPortrait=:headPortrait where u.id=:id";
                Query query=session.createQuery(hql);
                query.setParameter("headPortrait",po.getHeadPortrait());
                query.setParameter("id",po.getId());
                query.executeUpdate();
                Transaction transaction=session.beginTransaction();
                transaction.commit();
                connection.closeSession(session);
                return true;
            }else {
                connection.closeSession(session);
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            connection.closeSession(session);
            return false;
        }
    }

    public List getSimilarUser(String name) {
        Session session=connection.getSession();
        try {
            String hql="from User u where u.id like :name";
            String temp="";
            Query query=session.createQuery(hql);

            //transfer to the format of %
            if (!name.trim().equals("")){
                temp+="%";
                for(int i=0;i<name.length();i++){
                    temp+=name.charAt(i)+"%";
                }
            }

            query.setParameter("name",temp);
            List list=query.list();
            connection.closeSession(session);
            return list;
        }catch (Exception e){
            e.printStackTrace();
            connection.closeSession(session);
            return null;
        }
    }
}
