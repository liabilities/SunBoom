package dao.base;

import utilities.exceptions.NotExistException;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by zoetx on 2017/1/22.
 * Last changed by charles.
 * Updating time: 2017/1/23.
 */
public interface BaseDAO<T> {

    /*
    这里是真正会使用到的方法
    其中对于删改查三种操作，数据库中可能并不存在其对应项，抛出NotExistException
     */

    /*
    增
     */
    public boolean insertOne(T o);

    public boolean insertList(List<T> list);

    /*
    删
     */
    public boolean deleteOne(Serializable id) throws NotExistException;

    public boolean deleteList(List<T> list) throws NotExistException;

    /*
    改
     */
    public boolean updateOne(T entity) throws NotExistException;

    public boolean updateList(List<T> list) throws NotExistException;

    /*
    查
     */
    public T getById(Serializable id) throws NotExistException;

    public List<T> findByProperty(String name, Object value) throws NotExistException;

    public List<T> findByProperty(Map<String, Object> conditionMap) throws NotExistException;



    //以下是辅助的方法


//    void save(Object entity);
//    void delete(Object entity);
//    void update(Object entity);
//
//    /**
//     * 存在主键则更新，不存在则添加
//     * @param entity
//     */
//     void saveOrUpdate(Object entity);
//
//
//    void saveAll(Collection<?> entities);
//    void deleteAll(Collection<?> entities);
//    void updateAll(Collection<?> entity);
//    void saveOrUpdateAll(Collection<?> entities);
//
//    /**
//     * 获取单个实体，根据实体类及实体的主键获取。
//     * @param entityClass
//     * @param id
//     * @param <T>
//     * @return
//     */
//    @SuppressWarnings("hiding")
//    <T> T get(Class<T> entityClass, Serializable id);
//
//    /**
//     * 获取单个实体，根据查询语句及参数获取。
//     * @param queryString
//     * @param params
//     * @param <T>
//     * @return 单个实体，如果查询结果有多个，则返回第一个实体
//     */
//    @SuppressWarnings("hiding")
//    <T> T get(CharSequence queryString, Map<String, Object> params);
//
//     /**
//     * 获取单个实体，根据查询语句及参数获取。
//     * @param queryString
//     * @param params
//     * @param <T>
//     * @return
//     */
//    @SuppressWarnings("hiding")
//    <T> T get(CharSequence queryString, Object... params);
//
//    /**
//     *
//     * @param queryString
//     * @param params
//     * @param <T>
//     * @return
//     */
//    @SuppressWarnings("hiding")
//    <T> List<T> findList(CharSequence queryString, Object... params);
//
//    /**
//     *
//     * @param queryString
//     * @param params
//     * @param <T>
//     * @return
//     */
//    @SuppressWarnings("hiding")
//    <T> List<T> findList(CharSequence queryString, Map<String, Object> params);
//
//    /**
//     * 分页查询实体
//     *
//     * @param queryString
//     *            查询语句
//     * @param pageIndex
//     *            当前页码，如果pageIndex<1则不分页，且返回pageSize条记录。
//     * @param pageSize
//     *            每页记录数，如果pageSize<1则返回所有记录。
//     * @param params
//     *            可选的查询参数
//     * @return 实体分页对象
//     */
//    @SuppressWarnings("hiding")
//    <T> Pagination<T> findPagination(CharSequence queryString, int pageIndex, int pageSize, Object... params);
//
//    /**
//     * 分页查询实体
//     *
//     * @param queryString
//     *            查询语句
//     * @param params
//     *            可选的查询参数
//     * @param pageIndex
//     *            当前页码，如果pageIndex<2则不分页，且返回pageSize条记录。
//     * @param pageSize
//     *            每页记录数，如果pageSize<1则返回所有记录。
//     *
//     * @return 实体分页对象
//     */
//    @SuppressWarnings("hiding")
//    <T> Pagination<T> findPagination(CharSequence queryString, Map<String, Object> params, int pageIndex, int pageSize);
//
//    /**
//     * 分页查询实体，自定义总条数查询语句，适合复杂的hql分页查询
//     *
//     * @param queryString
//     *            查询语句
//     * @param countString
//     *            查询记录总条数语句
//     * @param pageIndex
//     *            当前页码，如果pageIndex<1则不分页，且返回pageSize条记录。
//     * @param pageSize
//     *            每页记录数，如果pageSize<1则返回所有记录。
//     * @param params
//     *            可选的查询参数
//     * @return 实体分页对象
//     */
//    @SuppressWarnings("hiding")
//    <T> Pagination<T> findPagination(CharSequence queryString, CharSequence countString, int pageIndex, int pageSize,
//                                     Object... params);
//
//    /**
//     * 分页查询实体，自定义总条数查询语句，适合复杂的hql分页查询
//     *
//     * @param queryString
//     *            查询语句
//     * @param countString
//     *            查询记录总条数语句
//     * @param params
//     *            可选的查询参数
//     * @param pageIndex
//     *            当前页码，如果pageIndex<2则不分页，且返回pageSize条记录。
//     * @param pageSize
//     *            每页记录数，如果pageSize<1则返回所有记录。
//     *
//     * @return 实体分页对象
//     */
//    @SuppressWarnings("hiding")
//    <T> Pagination<T> findPagination(CharSequence queryString, CharSequence countString, Map<String, Object> params,
//                                     int pageIndex, int pageSize);
//
//    /**
//     * 分页查询实体，自定义总条数查询语句，适合复杂的sql分页查询
//     *
//     * @param queryString
//     *            查询语句
//     * @param countString
//     *            查询记录总条数语句
//     * @param params
//     *            可选的查询参数
//     * @param pageIndex
//     *            当前页码，如果pageIndex<2则不分页，且返回pageSize条记录。
//     * @param pageSize
//     *            每页记录数，如果pageSize<1则返回所有记录。
//     *
//     * @return 实体分页对象
//     */
//    @SuppressWarnings("hiding")
//    public <T> Pagination<T> findSqlPagination(final CharSequence queryString, final CharSequence countString,
//                                               final Map<String, Object> params, int pageIndex, int pageSize);
//
//    /**
//     * 执行数据库更新操作
//     *
//     * @deprecated 用{@link #executeUpdate(String)}替换
//     * @param hql
//     */
//    void execute(String hql);
//
//    /**
//     * 执行数据库更新操作
//     *
//     * @deprecated 用{@link #executeUpdate(HibernateHandler)}替换
//     * @param handler
//     */
//    void execute(HibernateHandler handler);
//
//    /**
//     * 执行数据库更新操作
//     *
//     * @deprecated 用{@link #executeSqlUpdate(String)}替换
//     * @param sql
//     */
//    void executeSql(String sql);
//
//    /**
//     * 执行数据库查询操作
//     *
//     * @param handler
//     *            处理器
//     * @return
//     * @throws Exception
//     */
//    Object executeQuery(HibernateHandler handler);
//
//    /**
//     * 执行数据库更新操作
//     *
//     * @param sql
//     * @return 更新的记录条数
//     */
//    int executeSqlUpdate(String sql);
//
//    /**
//     * 执行数据库更新操作
//     *
//     * @param hql
//     * @return 更新的记录条数
//     */
//    int executeUpdate(String hql);
//
//    /**
//     * 执行数据库更新操作
//     *
//     * @param handler
//     *            处理器
//     * @return
//     * @throws Exception
//     */
//    Object executeUpdate(HibernateHandler handler);
//
//
//    /**
//     *
//     * 查询实体列表
//     *
//     * @param queryString
//     *            查询语句
//     * @param maxResults
//     *            列表最大数
//     * @param params
//     *            可选的查询参数
//     * @return 实体列表
//     */
//    public <V> List<V> findListByMax(CharSequence queryString, int maxResults, Object... params);
//
//    /**
//     *
//     * 查询实体列表
//     *
//     * @param queryString
//     *            查询语句
//     * @param maxResults
//     *            列表最大数
//     * @param params
//     *            可选的查询参数
//     * @return 实体列表
//     */
//    public <V> List<V> findListByMax(CharSequence queryString, int maxResults, Map<String, Object> params);
}
