
package model.bean;

import static java.lang.Math.atan2;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class Location extends Coordenates {
    private String adress;

    public Location(String adress, double latitude, double longitude) {
        super(latitude, longitude);
        this.adress = adress;
    }

    public Location(double latitude, double longitude) {
        super(latitude, longitude);
        this.adress = "";
    }
    
    public double distanceTo(Location location){
        
        double d2r = 0.017453292519943295769236;

        double dlong = (location.getLongitude() - this.getLongitude()) * d2r;
        double dlat = (location.getLatitude() - this.getLatitude()) * d2r;

        double temp_sin = sin(dlat/2.0);
        double temp_cos = cos(this.getLatitude() * d2r);
        double temp_sin2 = sin(dlong/2.0);

        double a = (temp_sin * temp_sin) + 
                   (temp_cos * temp_cos) * (temp_sin2 * temp_sin2);
        double c = 2.0 * atan2(sqrt(a), sqrt(1.0 - a));

        return 6368.1 * c;
    }
    
    public static double distanceBetween(Location oneLoc, 
            Location anotherLoc){
        
        double d2r = 0.017453292519943295769236;

        double dlong = (oneLoc.getLongitude() - anotherLoc.getLongitude()) * d2r;
        double dlat = (oneLoc.getLatitude() - anotherLoc.getLatitude()) * d2r;

        double temp_sin = sin(dlat/2.0);
        double temp_cos = cos(anotherLoc.getLatitude() * d2r);
        double temp_sin2 = sin(dlong/2.0);

        double a = (temp_sin * temp_sin) + 
                   (temp_cos * temp_cos) * (temp_sin2 * temp_sin2);
        double c = 2.0 * atan2(sqrt(a), sqrt(1.0 - a));

        return 6368.1 * c;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocation{" + "adress=" + adress + '}';
    }
    
}
