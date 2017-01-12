package Dao;

import java.util.List;

/**
 * Created by mm on 2016/7/10.
 */
public interface BaseDao<T> {

    public boolean addPo(T po);
    public T findPo(int id);
    public boolean updatePo(T po);
    public boolean deleteOne(T po);
    public List<T> getAll();

}
