
package model.bean;

import java.util.logging.Logger;

public class Contact {
    public String email;
    public String phone;
    public String site;

    public Contact() {
        this.email = "";
        this.phone = "";
        this.site = "";
    }

    public Contact(String email, String phone, String site) {
        this.email = email;
        this.phone = phone;
        this.site = site;
    }
    
    public boolean sendEmail(String to, String message){
        
        return true;
    }
    
    public static boolean sendEmail(String to, String from, String message){
        
        return true;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "Contact{" + "email=" + email + ", phone=" + phone + ", site=" + site + '}';
    }

}
