package utilities.tool;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by mm on 2016/7/11.
 */
public class Connection {
    private static Configuration configuration;
    private static SessionFactory sessionFactory;

    private Connection(){

    }


    public static Session getSession(){

        if (sessionFactory==null){
            configuration=new Configuration().configure();
            sessionFactory=configuration.buildSessionFactory();
            return sessionFactory.openSession();
        }else {
            return sessionFactory.openSession();
        }
    }

    public static void closeSession(Session session){
        session.close();
    }
}
