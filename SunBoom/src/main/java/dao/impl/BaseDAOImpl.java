package dao.impl;

import dao.BaseDAO;
import org.hibernate.Session;
import pojo.Person;
import tool.Connection;

import java.util.Collections;
import java.util.List;

/**
 * Created by mm on 2016/7/11.
 */
public class BaseDAOImpl<T> implements BaseDAO<T> {

    public static void main(String[] args){

//        PrivateLetterDAOImpl impl = new PrivateLetterDAOImpl();
//        PrivateLetter obj = impl.getById(1);
//        System.out.print(obj.getContent());
        PersonDAOImpl impl = new PersonDAOImpl();
        Person obj = impl.getById(1);
        System.out.print(obj.getAvatar());
    }

    private Object obj;

    public BaseDAOImpl(Object obj){
        this.obj = obj;
        System.out.print(obj.getClass());
    }


    public void save(T entity) {

        Session session= Connection.getSession();
        session.save(entity);
        Connection.closeSession(session);
    }

    public boolean update(T entity) {
        Session session= Connection.getSession();
        session.update(entity);
        Connection.closeSession(session);
        return true;
    }

    public void delete(int id) {
        Session session= Connection.getSession();
        Object obj = getById(id);
        if (obj != null) {
            session.delete(obj);
        }
        Connection.closeSession(session);
    }

    public T getById(int id) {
        Session session= Connection.getSession();
        T result =  (T)session.get(obj.getClass(), id);
        Connection.closeSession(session);
        return result;

    }

    public List<T> getByIds(Long[] ids) {
        Session session= Connection.getSession();
        if (ids == null || ids.length == 0) {
            return Collections.EMPTY_LIST;
        } else {
            return session.createQuery(//
                    "FROM " + obj.getClass().getSimpleName() + " WHERE id IN (:ids)")//
                    .setParameterList("ids", ids)//
                    .list();
        }
    }

    public List<T> findAll() {
        Session session= Connection.getSession();
        return session.createQuery(//
                "FROM " + obj.getClass().getSimpleName())//
                .list();
    }

}
