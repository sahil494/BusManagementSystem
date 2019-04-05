
package model;

public class deletebus {
   private String bid;
    private String did;
    private String dname;
    public void setBId(String bid)
    {
        this.bid=bid;
    }
    public void setName(String dname)
    {
        this.dname=dname;
    }
   
   
    public void setDId(String did)
    {
        this.did=did;
    }
    public String getBId()
    {
        return this.bid; 
    }
     public String getName()
    {
        return this.dname; 
    }

        public String getDId()
    {
        return this.did; 
    }
    public boolean equals(Object o)
    {
        deletebus d =(deletebus) o;
      if(bid.equals(d.getBId()) && did.equals(d.getDId()))
        {
           return true;
        }
        else
        {
            return false;
        }
   }   
}
