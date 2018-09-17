
package model.bean;

import java.util.ArrayList;


public class RatingList {
    
    private ArrayList<Rating> ratings;
    private int totalStars;
    private int totalReviews;

    public RatingList() {
        this.totalStars = 0;
        this.totalReviews = 0;
        this.ratings = new ArrayList<Rating>();        
    }
    
    public boolean addRating(Rating rating){
        return ratings.add(rating);
    }
    
    public boolean addRating(int id, String reviewer, String comment, short stars){
        return ratings.add(new Rating(id, reviewer, comment, stars));
    }
    
    public double getMeanStars(){
        return (double) totalStars/totalReviews;
    }
}
