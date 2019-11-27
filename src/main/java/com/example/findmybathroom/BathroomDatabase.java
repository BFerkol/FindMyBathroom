package com.example.findmybathroom;

/*
    Benjamin Ferkol
    C12731268
    4150 HW3
    BathroomDatabase Class
    This class stores information about each city and its location in a list
*/

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

public class BathroomDatabase {

    private static BathroomDatabase sBathroomDatabase;
    private List<Bathroom> mBathrooms;

    public static BathroomDatabase getInstance(Context context) {
        if (sBathroomDatabase == null) {
            sBathroomDatabase = new BathroomDatabase(context);
        }
        return sBathroomDatabase;
    }

    private BathroomDatabase(Context context) {
        mBathrooms = new ArrayList<>();
        Resources res = context.getResources();
        String[] bathrooms = res.getStringArray(R.array.bLocations);
        String[] bLong = res.getStringArray(R.array.bLongitude);
        String[] bLat = res.getStringArray(R.array.bLatitude);
        String[] r1 = res.getStringArray(R.array.rating1);
        String[] r2 = res.getStringArray(R.array.rating2);
        String[] r3 = res.getStringArray(R.array.rating3);
        String[] r4 = res.getStringArray(R.array.rating4);
        String[] r5 = res.getStringArray(R.array.rating5);
        String[] d = res.getStringArray(R.array.desc);

        for (int i = 0; i < bathrooms.length; i++) {
            mBathrooms.add(new Bathroom(i + 1, bathrooms[i], bLong[i], bLat[i], r1[i], r2[i], r3[i], r4[i], r5[i], d[i]));
        }
    }

    public List<Bathroom> getBathrooms() {
        return mBathrooms;
    }

    public Bathroom getBathroom(int bathroomId) {
        for (Bathroom bathroom : mBathrooms) {
            if (bathroom.getId() == bathroomId) {
                return bathroom;
            }
        }
        return null;
    }
}
