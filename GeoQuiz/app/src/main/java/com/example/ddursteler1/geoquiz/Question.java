package com.example.ddursteler1.geoquiz;


// For the MVC - This is the Model layer ( anything data is generally model )
/**
 * Created by ddursteler1 on 1/14/19.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question( int textResId, boolean answerTrue ) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId( int textResId ) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue( boolean answerTrue ) {
        mAnswerTrue = answerTrue;
    }
}
