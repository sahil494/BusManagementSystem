
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class busdao1 {
    public boolean add(bus d)
    {
         boolean flag=false;
        try {
       Configuration cf = new Configuration();
        cf.configure("cfgpackage/hibernate1.cfg.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(d);
        flag=true;
         tx.commit();
        session.close();
        sf.close();
        }
        catch(Exception e)
        {
         e.printStackTrace();   
        }
        return flag;
    }
}
