
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class userDAO {

public boolean check(user a)
{
        boolean flag=false;
        user db = null;
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;   
         cf = new Configuration();
         cf.configure("cfgpackage/hibernate.cfg.xml");
         sf = cf.buildSessionFactory();
         session = sf.openSession();
        Transaction tx = session.beginTransaction();
         db = (user)session.get(user.class, a.getEmail());
         tx.commit();
         session.close();
         sf.close();
         if(db==null)
         {
             return false;
         }
         else 
         {
             return a.equals(db);
         }
}
}
