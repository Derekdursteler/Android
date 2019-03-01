package com.example.ddursteler1.workouttracker;

import java.util.Date;
import java.util.UUID;

public class WorkoutPlan {
    private UUID mId;
    private String mTitle;
    private boolean mCompleted;
    private Date mDate;

    public WorkoutPlan( ) {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
    public boolean ismCompleted() {
        return mCompleted;
    }

    public void setmCompleted(boolean mCompleted) {
        this.mCompleted = mCompleted;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }
}
