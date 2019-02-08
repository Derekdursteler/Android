package com.example.ddursteler1.project1;

public class Numbers {

    private int mGuessList;
    private int mRollList;
    private int mTotalCorrectCounter;
    private int mTotalWrongCounter;

    public Numbers(int guessList, int rollList, int totalCorrectCounter, int totalWrongCounter ) {
        mGuessList = guessList;
        mRollList = rollList;
        mTotalCorrectCounter = totalCorrectCounter;
        mTotalWrongCounter = totalWrongCounter;
    }
    public int getmGuessList() {
        return mGuessList;
    }

    public void setmGuessList(int mGuessList) {
        this.mGuessList = mGuessList;
    }

    public int getmRollList() {
        return mRollList;
    }

    public void setmRollList(int mRollList) {
        this.mRollList = mRollList;
    }

    public int getmTotalCorrectCounter() {
        return mTotalCorrectCounter;
    }

    public void setmTotalCorrectCounter(int mTotalCorrectCounter) {
        this.mTotalCorrectCounter = mTotalCorrectCounter;
    }

    public int getmTotalWrongCounter() {
        return mTotalWrongCounter;
    }

    public void setmTotalWrongCounter(int mTotalWrongCounter) {
        this.mTotalWrongCounter = mTotalWrongCounter;
    }

}
