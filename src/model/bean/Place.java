
package model.bean;

public interface Place {
    
    int getId();
    
    void setId(int id);
    
    String getName();
    
    void setName(String name);
        
    Location getLocation();
    
    void setLocation(Location location);
    
    @Override
    String toString();
    
}
