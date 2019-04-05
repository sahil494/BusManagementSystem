
package model;

public class Deleteroute1 {
    public String RouteCode;
    public String RouteName;
    public String DriverName;

    public String getRouteCode() {
        return RouteCode;
    }

    public void setRouteCode(String RouteCode) {
        this.RouteCode = RouteCode;
    }
    public String getRouteName() {
        return RouteName;
    }

    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String DriverName) {
        this.DriverName = DriverName;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Deleteroute1 d = (Deleteroute1)o;
        if (RouteCode.equals(d.getRouteCode()) && RouteName.equals(d.getRouteName()) && DriverName.equals(d.getDriverName()))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
