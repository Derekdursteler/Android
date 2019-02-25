package com.example.ddursteler1.workouttracker;

import java.util.Date;
import java.util.UUID;

public class WorkoutPlan {
    private UUID mId;
    private String mDeadlift;
    private String mPullUps;
    private String mRows;
    private String mBicepCurls;
    private boolean mCompleted;
    private Date mDate;

    public WorkoutPlan( ) {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmDeadlift() {
        return mDeadlift;
    }

    public void setmDeadlift(String mDeadlift) {
        this.mDeadlift = mDeadlift;
    }

    public String getmPullUps() {
        return mPullUps;
    }

    public void setmPullUps(String mPullUps) {
        this.mPullUps = mPullUps;
    }

    public String getmRows() {
        return mRows;
    }

    public void setmRows(String mRows) {
        this.mRows = mRows;
    }

    public String getmBicepCurls() {
        return mBicepCurls;
    }

    public void setmBicepCurls(String mBicepCurls) {
        this.mBicepCurls = mBicepCurls;
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
