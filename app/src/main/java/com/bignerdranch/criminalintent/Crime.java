package com.bignerdranch.criminalintent;

import java.util.UUID;
import java.util.Date;

public class Crime {
    private UUID mId;  // UUID is a type for producing unique IDs
    private String mTitle;
    private Date mDate;  // the default constructor for Date returns the current date time
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    /* GETTERS AND SETTERS */
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
