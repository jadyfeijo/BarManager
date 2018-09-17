
package model.bean;


public class Rating {
    
    private int id;
    private String reviewer;
    private String comment;
    private short stars;

    public Rating(int id, String reviewer, String comment, short stars) {
        this.id = id;
        this.reviewer = reviewer;
        this.comment = comment;
        this.stars = stars;
    }

    public Rating(int id, String reviewer, short stars) {
        this(id, reviewer, "", stars);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public short getStars() {
        return stars;
    }

    public void setStars(short stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Rating{" + "id=" + id + ", reviewer=" + reviewer + 
                ", comment=" + comment + ", stars=" + stars + '}';
    }
    
}
