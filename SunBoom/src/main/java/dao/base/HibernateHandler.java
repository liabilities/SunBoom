package dao.base;

/**
 * Created by zoetx on 2017/1/22.
 */
import org.hibernate.Session;
import java.io.Serializable;

public abstract interface HibernateHandler extends Serializable {
    public abstract Object doInHibernate(Session paramSession);
}