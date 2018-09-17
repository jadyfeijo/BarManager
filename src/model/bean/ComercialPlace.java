
package model.bean;

public class ComercialPlace implements Place {
    private int id;
    private String name;
    private Location location;
    private boolean hasParking;
    private Contact contact;

    public ComercialPlace(int id, String name, Location location, 
            boolean hasParking, Contact contact) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.hasParking = hasParking;
        this.contact = contact;
    }
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Location getLocation() {
        return location;
    }
    
    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean hasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ComercialPlace{" + "id=" + id + ", name=" + name + 
                ", location=" + location + ", hasParking=" + hasParking + 
                ", contact=" + contact + '}';
    }
}
