
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class user {
 @Id
 private String email;
 private String password;
 
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean equals(Object o)
    {
        user a = (user)o;
        if (email.equals(a.getEmail()) && password.equals(a.getPassword()))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
