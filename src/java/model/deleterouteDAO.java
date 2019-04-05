
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deleterouteDAO {
       public boolean check1(Deleteroute1 d)
    {
        boolean flag=false;
        try 
        {
            Configuration cf=new Configuration();
            cf.configure("cfgpackage/hibernate1.cfg.xml");
            SessionFactory sf = cf.buildSessionFactory();
            Session session1 =sf.openSession();
            session1 =sf.openSession();
            Transaction tx = session1.beginTransaction();
            String sql = "delete from route1 where rcode='"+d.getRouteCode()+"' and rname='"+d.getRouteName()+"'";
            Query query = session1.createQuery(sql);
           int i= query.executeUpdate();
            tx.commit();
           if(i!=0)
           {
               flag=true;
           }
        session1.close();
        sf.close();
        
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
      
        return flag;
    }
}
