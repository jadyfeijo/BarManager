
package model.bean;

import java.util.ArrayList;
import java.util.Set;

public class Bar extends ComercialPlace{
    
    private RatingList ratings;
    private Set<String> targetAudiences;
    private ArrayList<OperationHours> operationHoursWeek;
    private ArrayList<Product> products;
    
    /**
     *
     * @param id
     * @param name
     * @param location
     * @param hasParking
     * @param contact
     */
    public Bar(int id, String name, Location location, boolean hasParking, 
            Contact contact) {
        super(id, name, location, hasParking, contact);
    }
    
}
