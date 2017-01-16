package dao.impl;

import dao.BaseDAO;
import org.hibernate.Session;
import pojo.Person;
import pojo.PrivateLetter;
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
        Connection.closeSession(getSession());
    }

    protected Session getSession() {
        return Connection.getSession();
    }

    public void save(T entity) {
        getSession().save(entity);
    }

    public boolean update(T entity) {
        getSession().update(entity);
        return true;
    }

    public void delete(int id) {
        Object obj = getById(id);
        if (obj != null) {
            getSession().delete(obj);
        }
    }

    public T getById(int id) {
        return (T) getSession().get(obj.getClass(), id);
    }

    public List<T> getByIds(Long[] ids) {
        if (ids == null || ids.length == 0) {
            return Collections.EMPTY_LIST;
        } else {
            return getSession().createQuery(//
                    "FROM " + obj.getClass().getSimpleName() + " WHERE id IN (:ids)")//
                    .setParameterList("ids", ids)//
                    .list();
        }
    }

    public List<T> findAll() {
        return getSession().createQuery(//
                "FROM " + obj.getClass().getSimpleName())//
                .list();
    }

}
