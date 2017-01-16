package dao;

import java.util.List;

/**
 * Created by mm on 2016/7/10.
 */
public interface BaseDAO<T> {

    public void save(T entity);
    public boolean update(T entity);
    public void delete(int id);
    public T getById(int id);
    public List<T> getByIds(Long[] ids);
    public List<T> findAll();


}
