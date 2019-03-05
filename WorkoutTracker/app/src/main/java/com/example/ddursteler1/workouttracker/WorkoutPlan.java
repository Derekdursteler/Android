package com.example.ddursteler1.workouttracker;

import java.util.Date;
import java.util.UUID;

// workout class for push

public class WorkoutPlan {
    private UUID mId;
    private String mTitle;
    private boolean mCompleted;
    private Date mDate;
    private String mDeadlift;
    private String mPullups;
    private String mRows;
    private String mHammer;
    private String mBicep;

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

    public void setDeadlift(String mDeadlift) {
        this.mDeadlift = mDeadlift;
    }
    public String getmDeadlift() {
        return mDeadlift;
    }

    public String getmPullups() {
        return mPullups;
    }

    public void setmPullups(String mPullups) {
        this.mPullups = mPullups;
    }

    public String getmRows() {
        return mRows;
    }

    public void setmRows(String mRows) {
        this.mRows = mRows;
    }

    public String getmHammer() {
        return mHammer;
    }

    public void setmHammer(String mHammer) {
        this.mHammer = mHammer;
    }

    public String getmBicep() {
        return mBicep;
    }

    public void setmBicep(String mBicep) {
        this.mBicep = mBicep;
    }
}
