package com.example.findmybathroom;

/*
    Benjamin Ferkol
    C12731268
    Bathroom Class
    This class contains an id number for the city, the city's name, the coordinates for the API request, the 5
    ratings that the user submits when rating the restroom and the description
*/

import android.content.Context;
import android.widget.TextView;


import org.json.JSONException;
import org.json.JSONObject;

public class Bathroom {
    private int mID; // ID number for the bathroom in the database
    private String bName; // Name of the bathroom (ex. Men's 2nd Floor McAdams Hall)
    String bLong; // Longitude value for the bathroom
    String bLat; // Latitude value for the bathroom
    String rating1; // 1st rating
    String rating2; // 2nd rating
    String rating3; // 3rd rating
    String rating4; // 4th rating
    String rating5; // 5th rating
    String bDescr; // Description of the bathroom

    public Bathroom() {}

    public Bathroom(int id, String n, String lon, String lat, String r1, String r2, String r3, String r4, String r5, String d) {
        mID = id;
        bName = n;
        bLong = lon;
        bLat = lat;
        rating1 = r1;
        rating2 = r2;
        rating3 = r3;
        rating4 = r4;
        rating5 = r5;
        bDescr = d;
    }

    public int getId() {
        return mID;
    }

    public void setId(int id) {
        this.mID = id;
    }

    public String getName() {
        return bName;
    }

    public void setName(String name) {
        this.bName = name;
    }

    public String getLong() {
        return bLong;
    }

    public void setLong(String lon) {
        this.bLong = lon;
    }

    public String getLat() {
        return bLat;
    }

    public void setLat(String lat) {
        this.bLat = lat;
    }

    public String getR1() {
        return rating1;
    }

    public void setR1(String r) {
        this.rating1 = r;
    }

    public String getR2() {
        return rating1;
    }

    public void setR2(String r) {
        this.rating1 = r;
    }

    public String getR3() {
        return rating1;
    }

    public void setR3(String r) {
        this.rating1 = r;
    }

    public String getR4() {
        return rating1;
    }

    public void setR4(String r) {
        this.rating1 = r;
    }

    public String getR5() {
        return rating1;
    }

    public void setR5(String r) {
        this.rating1 = r;
    }

    public String getDescr() {
        return bDescr;
    }

    public void setDescr(String d) {
        this.bDescr = d;
    }

}
