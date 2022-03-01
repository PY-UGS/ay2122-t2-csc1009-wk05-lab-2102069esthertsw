package com.esther.wk05;

import java.time.Instant;
import java.util.Date;

public class GeometricObject {
    private String colour;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        Date currentDate = new Date();
        this.dateCreated = currentDate;
        this.colour = "white";
        this.filled = false;
    }

    public GeometricObject(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
        Date currentDate = new Date();
        this.dateCreated = currentDate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString(){
        Instant instant = dateCreated.toInstant();
        String stringDate = instant.toString();
        return ("created on " + stringDate);
    }
}
