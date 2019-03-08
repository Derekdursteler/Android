package com.example.ddursteler1.workouttracker;

import java.util.Date;
import java.util.UUID;

// workout class for push

public class WorkoutPlanPush {
    private UUID mId;
    private String mTitle;
    private boolean mCompleted;
    private Date mDate;

    private String mDeadlift;
    private String mPullups;
    private String mRows;
    private String mHammer;
    private String mBicep;

    private String mBenchPress;
    private String mOverheadPress;
    private String mInclineBench;
    private String mTriceps;
    private String mLatRaises;

    private String mSquats;
    private String mRomanian;
    private String mLegPress;
    private String mLegCurls;
    private String mCalfRaises;

    public WorkoutPlanPush( ) {
        mId = UUID.randomUUID();
        mDate = new Date();
        mTitle = "Workout";
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
    public String getmBenchPress() {
        return mBenchPress;
    }

    public void setmBenchPress(String mBenchPress) {
        this.mBenchPress = mBenchPress;
    }

    public String getmOverheadPress() {
        return mOverheadPress;
    }

    public void setmOverheadPress(String mOverheadPress) {
        this.mOverheadPress = mOverheadPress;
    }

    public String getmInclineBench() {
        return mInclineBench;
    }

    public void setmInclineBench(String mInclineBench) {
        this.mInclineBench = mInclineBench;
    }

    public String getmTriceps() {
        return mTriceps;
    }

    public void setmTriceps(String mTriceps) {
        this.mTriceps = mTriceps;
    }

    public String getmLatRaises() {
        return mLatRaises;
    }

    public void setmLatRaises(String mLatRaises) {
        this.mLatRaises = mLatRaises;
    }
    public String getmSquats() {
        return mSquats;
    }

    public void setmSquats(String mSquats) {
        this.mSquats = mSquats;
    }

    public String getmRomanian() {
        return mRomanian;
    }

    public void setmRomanian(String mRomanian) {
        this.mRomanian = mRomanian;
    }

    public String getmLegPress() {
        return mLegPress;
    }

    public void setmLegPress(String mLegPress) {
        this.mLegPress = mLegPress;
    }

    public String getmLegCurls() {
        return mLegCurls;
    }

    public void setmLegCurls(String mLegCurls) {
        this.mLegCurls = mLegCurls;
    }

    public String getmCalfRaises() {
        return mCalfRaises;
    }

    public void setmCalfRaises(String mCalfRaises) {
        this.mCalfRaises = mCalfRaises;
    }
}
