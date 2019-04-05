
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class bus {
    @Id
    private String bid;
    private String did;
    private String dname;
    private String cont;
    private String arival;
    private String time;
    public void setBId(String bid)
    {
        this.bid=bid;
    }
    public void setDId(String did)
    {
        this.did=did;
    }
    public void setName(String dname)
    {
        this.dname=dname;
    }
    public void setContact(String cont)
    {
        this.cont=cont;
    }
    public void setArival(String arival)
    {
        this.arival=arival;
    }
    public void setTime(String time)
    {
        this.time=time;
    }
    public String getDId()
    {
        return this.did; 
    }
     public String getBId()
    {
        return this.bid; 
    }
     public String getName()
    {
        return this.dname; 
    }
      public String getContact()
    {
        return this.cont; 
    }
        public String getArival()
    {
        return this.arival; 
    }
        public String getTime()
    {
        return this.time; 
    }
    public boolean equals(Object o)
    {
        bus d =(bus) o;
      if(bid.equals(d.getBId()) && did.equals(d.getDId()) && dname.equals(d.getName()) && cont.equals(d.getContact()) && arival.equals(d.getArival()) && time.equals(d.getTime()))
        {
           return true;
        }
        else
        {
            return false;
        }
   }
}
