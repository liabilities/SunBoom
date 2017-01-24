package dao.base;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;
import utilities.exceptions.NotExistException;
import utilities.tool.Connection;
import utilities.tool.ObjectUtil;
import utilities.tool.Pagination;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zoetx on 2017/1/22.
 * Last changed by zoetx.
 * Updating time: 2017/1/24.
 *
 * 添加Transaction的commit
 */


@Repository
public class BaseDAOImpl<T> implements BaseDAO<T> {

    protected Class<T> entityClazz;

    /*
    增
     */
    public boolean saveOne(T o) {
        saveOrUpdate(o);
        return true;
    }

    public boolean saveList(List<T> list) {
        saveOrUpdateAll(list);
        return true;
    }

    public boolean insertOne(T entity) {
        save(entity);
        return true;
    }

    public boolean insertList(List<T> entitys) {
        for (T entity : entitys) {
            save(entity);
        }
        return true;
    }


    /*
    删
     */
    public boolean deleteOne(Serializable id) throws NotExistException{
        T entity = getById(id);
        delete(entity);
        return true;
    }

    public boolean deleteList(List<T> entitys) throws NotExistException{
        for (T entity : entitys) {
            delete(entity);
        }
        return true;
    }


    /*
    改
     */
    public boolean updateOne(T entity) throws NotExistException{
        update(entity);
        return true;
    }

    public boolean updateList(List<T> entitys) throws NotExistException{
        for (T entity : entitys) {
            update(entity);
        }
        return true;
    }


    /*
    查
     */
    public T getById(Serializable id) throws NotExistException{
        if (id == null)
            return null;

        return (T) get(entityClazz, id);
    }

    public List<T> findByProperty(String name, Object value) throws NotExistException{
        String hql = "from  " + entityClazz.getSimpleName() + " where " + name + "=? ";
        return findList(hql, value);
    }

    public List<T> findByProperty(Map<String, Object> conditionMap) throws NotExistException{
        StringBuilder hql = new StringBuilder();
        hql.append("from  " + entityClazz.getSimpleName());
        if (!conditionMap.isEmpty()) {
            Iterator<String> it = conditionMap.keySet().iterator();
            String key = it.next();
            hql.append(" where  " + key + "=:" + key);
            while (it.hasNext()) {
                key = it.next();
                hql.append(" and  " + key + "=:" + key);
            }
        }
        return findList(hql.toString(), conditionMap);
    }






    @SuppressWarnings("unchecked")
    public BaseDAOImpl() {
        //获得超类的泛型参数的实际类型
        Type type = getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            this.entityClazz = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];
        } else {
            this.entityClazz = null;
        }
    }

    @Resource

    private Session getSession() {
        Session session= Connection.getSession();
        return session;
    }

    private void closeSession(){
        Connection.closeSession();
    }

    private void save(Object entity) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.save(entity);
        tx.commit();
        closeSession();
    }

    private void delete(Object entity) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
        closeSession();
    }

    private void update(Object entity) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
        closeSession();
    }

    private void saveOrUpdate(Object entity) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(entity);
        tx.commit();
        closeSession();
    }

    private void saveAll(Collection<?> entities) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        for (@SuppressWarnings("rawtypes")
             Iterator localIterator = entities.iterator(); localIterator.hasNext();) {
            Object entity = localIterator.next();
            session.save(entity);
            tx.commit();
            closeSession();
        }
    }

    private void deleteAll(Collection<?> entities) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        for (@SuppressWarnings("rawtypes")
             Iterator localIterator = entities.iterator(); localIterator.hasNext();) {
            Object entity = localIterator.next();
            session.delete(entity);
            tx.commit();
            closeSession();
        }
    }

    private void updateAll(Collection<?> entities) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        for (@SuppressWarnings("rawtypes")
             Iterator localIterator = entities.iterator(); localIterator.hasNext();) {
            Object entity = localIterator.next();
            session.update(entity);
            tx.commit();
            closeSession();
        }
    }

    private void saveOrUpdateAll(Collection<?> entities) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        for (@SuppressWarnings("rawtypes")
             Iterator localIterator = entities.iterator(); localIterator.hasNext();) {
            Object entity = localIterator.next();
            session.saveOrUpdate(entity);
            tx.commit();
            closeSession();
        }
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    private <T> T get(Class<T> entityClass, Serializable id) {
        T result = (T) getSession().get(entityClass, id);
        closeSession();
        return result;
    }

    @SuppressWarnings({ "unchecked", "rawtypes", "hiding" })
    private <T> T get(CharSequence queryString, Object... params) {

        Query qry = getSession().createQuery(queryString.toString());
        for (int i = 0; i < params.length; ++i) {
            qry.setParameter(i, params[i]);
        }
        List list = qry.setMaxResults(1).list();
        if (list.isEmpty()) {
            closeSession();
            return null;
        }
        closeSession();
        return (T) list.get(0);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    private <T> T get(CharSequence queryString, Map<String, Object> params) {

        Query qry = getSession().createQuery(queryString.toString());
        setParameter(qry, params);
        @SuppressWarnings("rawtypes")
        List list = qry.setMaxResults(1).list();
        if (list.isEmpty()) {
            closeSession();
            return null;
        }
        closeSession();
        return (T) list.get(0);
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    private <T> List<T> findList(CharSequence queryString, Object... params) {
        Query query = getSession().createQuery(queryString.toString());
        for (int i = 0; i < params.length; ++i) {
            query.setParameter(i, params[i]);
        }
        closeSession();
        return query.list();
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    private <T> List<T> findList(CharSequence queryString, Map<String, Object> params) {
        Query query = getSession().createQuery(queryString.toString());
        setParameter(query, params);
        closeSession();
        return query.list();
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    private <T> Pagination<T> findPagination(CharSequence queryString, int pageIndex, int pageSize, Object... params) {
        Query query = getSession().createQuery(queryString.toString());

        if ((pageSize > 0) && (pageIndex > 0)) {
            query.setFirstResult((pageIndex < 2) ? 0 : (pageIndex - 1) * pageSize);
            query.setMaxResults(pageSize);
        }

        for (int i = 0; i < params.length; ++i) {
            query.setParameter(i, params[i]);
        }
        @SuppressWarnings("rawtypes")
        List items = query.list();
        long rowsCount = 0L;

        if ((pageSize > 0) && (pageIndex > 0)) {
            String hql = parseSelectCount(queryString.toString());
            rowsCount = ((Long) get(hql, params)).longValue();
        } else {
            rowsCount = items.size();
        }

        @SuppressWarnings("rawtypes")
        Pagination pagination = new Pagination(pageIndex, pageSize, rowsCount);
        pagination.setItems(items);
        closeSession();
        return pagination;
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    private <T> Pagination<T> findPagination(CharSequence queryString, Map<String, Object> params, int pageIndex,
                                            int pageSize) {
        Query query = getSession().createQuery(queryString.toString());

        if ((pageSize > 0) && (pageIndex > 0)) {
            query.setFirstResult((pageIndex < 2) ? 0 : (pageIndex - 1) * pageSize);
            query.setMaxResults(pageSize);
        }

        setParameter(query, params);
        @SuppressWarnings({ "rawtypes" })
        List items = query.list();
        long rowsCount = 0L;

        if ((pageSize > 0) && (pageIndex > 0)) {
            String hql = parseSelectCount(queryString.toString());
            rowsCount = ((Long) get(hql, params)).longValue();
        } else {
            rowsCount = items.size();
        }

        @SuppressWarnings("rawtypes")
        Pagination pagination = new Pagination(pageIndex, pageSize, rowsCount);
        pagination.setItems(items);
        closeSession();
        return pagination;
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    private <T> Pagination<T> findPagination(CharSequence queryString, CharSequence countString, int pageIndex,
                                            int pageSize, Object... params) {
        Query query = getSession().createQuery(queryString.toString());

        if ((pageSize > 0) && (pageIndex > 0)) {
            query.setFirstResult((pageIndex < 2) ? 0 : (pageIndex - 1) * pageSize);
            query.setMaxResults(pageSize);
        }

        for (int i = 0; i < params.length; ++i) {
            query.setParameter(i, params[i]);
        }
        @SuppressWarnings("rawtypes")
        List items = query.list();
        long rowsCount = 0L;

        if ((pageSize > 0) && (pageIndex > 0)) {
            rowsCount = ((Long) get(countString, params)).longValue();
        } else
            rowsCount = items.size();

        @SuppressWarnings("rawtypes")
        Pagination pagination = new Pagination(pageIndex, pageSize, rowsCount);
        pagination.setItems(items);
        closeSession();
        return pagination;
    }

    @SuppressWarnings({ "unchecked", "hiding" })
    private <T> Pagination<T> findPagination(CharSequence queryString, CharSequence countString,
                                            Map<String, Object> params, int pageIndex, int pageSize) {
        Query query = getSession().createQuery(queryString.toString());

        if ((pageSize > 0) && (pageIndex > 0)) {
            query.setFirstResult((pageIndex < 2) ? 0 : (pageIndex - 1) * pageSize);
            query.setMaxResults(pageSize);
        }

        setParameter(query, params);
        @SuppressWarnings("rawtypes")
        List items = query.list();
        long rowsCount = 0L;

        if ((pageSize > 0) && (pageIndex > 0)) {
            rowsCount = ((Long) get(countString, params)).longValue();
        } else
            rowsCount = items.size();

        @SuppressWarnings("rawtypes")
        Pagination pagination = new Pagination(pageIndex, pageSize, rowsCount);
        pagination.setItems(items);
        closeSession();
        return pagination;
    }

    @SuppressWarnings({ "serial", "unchecked", "hiding" })
    private <T> Pagination<T> findSqlPagination(CharSequence queryString, final CharSequence countString,
                                               final Map<String, Object> params, int pageIndex, int pageSize) {
        SQLQuery query = getSession().createSQLQuery(queryString.toString());
        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        if ((pageSize > 0) && (pageIndex > 0)) {
            query.setFirstResult((pageIndex < 2) ? 0 : (pageIndex - 1) * pageSize);
            query.setMaxResults(pageSize);
        }
        if ((params != null) && (!(params.isEmpty()))) {
            setParameter(query, params);
        }
        @SuppressWarnings("rawtypes")
        List items = query.list();
        BigInteger rowsCount = BigInteger.valueOf(0L);

        if ((pageSize > 0) && (pageIndex > 0)) {
            rowsCount = (BigInteger) executeQuery(new HibernateHandler() {
                public Object doInHibernate(Session session) {
                    SQLQuery query = session.createSQLQuery(countString.toString());
                    if ((params != null) && (!(params.isEmpty()))) {
                        setParameter(query, params);
                    }
                    return query.uniqueResult();
                }
            });
        }

        @SuppressWarnings("rawtypes")
        Pagination pagination = new Pagination(pageIndex, pageSize, rowsCount.intValue());
        pagination.setItems(items);
        closeSession();
        return pagination;
    }

    private Object executeQuery(HibernateHandler handler) {
        return handler.doInHibernate(getSession());
    }

    private void execute(String hql) {
        executeUpdate(hql);
    }

    private void execute(HibernateHandler handler) {
        executeUpdate(handler);
    }

    private void executeSql(String sql) {
        executeSqlUpdate(sql);
    }

    private int executeSqlUpdate(String sql) {
        int result =  getSession().createSQLQuery(sql).executeUpdate();
        closeSession();
        return result;
    }

    private int executeUpdate(String hql) {
        int result = getSession().createQuery(hql).executeUpdate();
        closeSession();
        return result;
    }

    private Object executeUpdate(HibernateHandler handler) {
        Object obj =  handler.doInHibernate(getSession());
        closeSession();
        return obj;
    }

    private Query setParameter(Query query, Map<String, Object> parameterMap) {
        for (@SuppressWarnings("rawtypes")
             Iterator iterator = parameterMap.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            query.setParameter(key, parameterMap.get(key));
        }
        return query;
    }

    private boolean followWithWord(String s, String sub, int pos) {
        int i = 0;
        for (; (pos < s.length()) && (i < sub.length()); ++i) {
            if (s.charAt(pos) != sub.charAt(i))
                return false;
            ++pos;
        }

        if (i < sub.length()) {
            return false;
        }

        if (pos >= s.length()) {
            return true;
        }
        return (!(isAlpha(s.charAt(pos))));
    }

    private String parseSelectCount(String queryString) {
        String hql = queryString.toLowerCase();
        int noBlankStart = 0;
        for (int len = hql.length(); noBlankStart < len; ++noBlankStart) {
            if (hql.charAt(noBlankStart) > ' ') {
                break;
            }
        }

        int pair = 0;

        if (!(followWithWord(hql, "select", noBlankStart))) {
            pair = 1;
        }
        int fromPos = -1;
        for (int i = noBlankStart; i < hql.length();) {
            if (followWithWord(hql, "select", i)) {
                ++pair;
                i += "select".length();
            } else if (followWithWord(hql, "from", i)) {
                --pair;
                if (pair == 0) {
                    fromPos = i;
                    break;
                }
                i += "from".length();
            } else {
                ++i;
            }
        }
        if (fromPos == -1) {
            throw new IllegalArgumentException("parse count sql error, check your sql/hql");
        }

        String countHql = "select count(*) " + queryString.substring(fromPos);
        return countHql;
    }

    private boolean isAlpha(char c) {
        return ((c == '_') || (('0' <= c) && (c <= '9')) || (('a' <= c) && (c <= 'z')) || (('A' <= c) && (c <= 'Z')));
    }



    private <V> List<V> findListByMax(final CharSequence queryString, final int maxResults, final Object... params) {
        @SuppressWarnings({ "unchecked", "serial" })
        List<V> list = (List<V>) executeQuery(new HibernateHandler() {

            public List<V> doInHibernate(Session paramSession) {
                try {
                    Query query = paramSession.createQuery(queryString.toString());
                    for (int i = 0; i < params.length; ++i) {
                        query.setParameter(i, params[i]);
                    }
                    return query.setMaxResults(maxResults).list();
                } catch (RuntimeException re) {
                    throw re;
                }
            }
        });
        return list;
    }

    private <V> List<V> findListByMax(final CharSequence queryString, final int maxResults,
                                     final Map<String, Object> params) {
        @SuppressWarnings({ "unchecked", "serial" })
        List<V> list = (List<V>) executeQuery(new HibernateHandler() {

            public List<V> doInHibernate(Session paramSession) {
                try {
                    Query query = paramSession.createQuery(queryString.toString());
                    for (Iterator<String> iterator = params.keySet().iterator(); iterator.hasNext();) {
                        String key = iterator.next();
                        query.setParameter(key, params.get(key));
                    }
                    return query.setMaxResults(maxResults).list();
                } catch (RuntimeException re) {
                    throw re;
                }
            }

        });
        return list;
    }

    /**
     * HQL/SQL之数据操作命令(DML)拼接辅助类
     *
     * @author PanJun
     * @deprecated by fu.zhanghua
     *
     */
    public class DmlHelper {

        private ThreadLocal<Calendar> cal = new ThreadLocal<Calendar>() {
            @Override
            protected Calendar initialValue() {
                return Calendar.getInstance();
            }
        };

        /** HQL/SQL参数 */
        public final List<Object> paramList = new ArrayList<Object>();
        /** HQL/SQL语句 */
        public final StringBuilder dmlCmd = new StringBuilder();

        public DmlHelper() {
        }

        public DmlHelper(CharSequence dml, Object... params) {
            if (dml != null) {
                dmlCmd.append(dml);
                for (Object o : params) {
                    paramList.add(o);
                }
            }
        }

        @Override
        public String toString() {
            return "dml=" + dmlCmd + ", params=" + paramList;
        }

        public DmlHelper append(CharSequence dmlPart, Object... params) {
            if (dmlPart != null) {
                dmlCmd.append(" ").append(dmlPart);
                for (Object o : params) {
                    paramList.add(o);
                }
            }
            return this;
        }

        public DmlHelper addEqual(String fieldName, Object value, Object... nullVal) {
            if (value == null || fieldName == null) {
                return this;
            }

            if (value instanceof String) {
                value = value.toString().trim();
                if ("".equals(value)) {
                    return this;
                }
            }

            for (Object NULL : nullVal) {
                if (NULL == value) {
                    return this;
                }

                if (value.equals(NULL)) {
                    return this;
                }
            }

            dmlCmd.append(" and ").append(fieldName).append("=? ");
            paramList.add(value);
            return this;
        }

        public DmlHelper addLikeAll(String name, String value) {
            if (null == value || null == name)
                return this;

            value = "%" + value.trim().toLowerCase() + "%";
            dmlCmd.append(" and lower(").append(name).append(") like ? ");
            paramList.add(value);
            return this;
        }

        /**
         * 清除时间里的时分秒，只留日期
         *
         * @param calendar
         * @return new date
         */
        private void clearTime(Calendar calendar) {
            int y = calendar.get(Calendar.YEAR);
            int m = calendar.get(Calendar.MONTH);
            int d = calendar.get(Calendar.DAY_OF_MONTH);
            calendar.clear();
            calendar.set(Calendar.YEAR, y);
            calendar.set(Calendar.MONTH, m);
            calendar.set(Calendar.DAY_OF_MONTH, d);
        }

        /**
         * 添加开始日期、结束日期(注意时分秒不记入查询条件)查询条件，包含开始日期和结束日期
         *
         * @param fieldName
         *            hbm对象属性名称或字段名
         * @param minDay
         *            开始日期
         * @param maxDay
         *            结果日期
         */
        public DmlHelper addDayRange(String fieldName, Date minDay, Date maxDay) {
            Calendar calendar = cal.get();
            if (minDay != null) {
                calendar.setTime(minDay);
                clearTime(calendar);
                calendar.add(Calendar.SECOND, -1);
                dmlCmd.append(" and ").append(fieldName).append(">? ");
                paramList.add(calendar.getTime());
            }

            if (maxDay != null) {
                calendar.setTime(maxDay);
                clearTime(calendar);
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                dmlCmd.append(" and ").append(fieldName).append("<? ");
                paramList.add(calendar.getTime());
            }
            return this;
        }

        /**
         * 添加开始时间、结束时间查询条件，包含开始时间和结束时间
         *
         * @param fieldName
         *            hbm对象属性名称或字段名
         * @param minTime
         *            开始时间
         * @param maxTime
         *            结果时间
         */
        public DmlHelper addDayRange(String fieldName, String minTime, String maxTime) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date start_ = null, end_ = null;
            if (ObjectUtil.hasText(minTime) && ObjectUtil.hasText(maxTime)) {
                try {
                    start_ = sdf.parse(minTime);
                    end_ = sdf.parse(maxTime);
                } catch (ParseException e) {
                }
            }

            return addTimeRange(fieldName, start_, end_);
        }

        /**
         * 添加开始时间、结束时间查询条件，包含开始时间和结束时间
         *
         * @param fieldName
         *            hbm对象属性名称或字段名
         * @param minTime
         *            开始时间
         * @param maxTime
         *            结果时间
         */
        public DmlHelper addTimeRange(String fieldName, Date minTime, Date maxTime) {
            if (minTime != null) {
                dmlCmd.append(" and ").append(fieldName).append(">? ");
                paramList.add(minTime);
            }

            if (maxTime != null) {
                dmlCmd.append(" and ").append(fieldName).append("<? ");
                paramList.add(maxTime);
            }
            return this;
        }

        public <D> Pagination<D> findPagin(int pageIndex, int pageSize) {
            String hql = dmlCmd.toString();
            Object[] allParams = new Object[paramList.size()];
            int i = 0;
            for (Object o : paramList) {
                allParams[i++] = o;
            }
            return findPagination(hql, pageIndex, pageSize, allParams);
        }

    }

}
