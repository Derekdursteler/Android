package com.example.ddursteler1.project1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ScoreActivity extends AppCompatActivity {

    private static final String GUESSED_LIST = "com.example.ddursteler1.project1.guessed_number";
    private static final String ROLLED_LIST = "com.example.ddursteler1.project1.rolled_number";
    private static final String TOTAL_CORRECT = "com.example.ddursteler1.project1.total_correct";
    private static final String TOTAL_WRONG = "com.example.ddursteler1.project1.total_wrong";

    private int mGuessList;
    private int mRollList;
    private int mTotalCorrectCounter;
    private int mTotalWrongCounter;
    private Button mResetButton;
    private TextView mGuesses;
    private TextView mRolls;
    private TextView mCorrect;
    private TextView mTotalCorrect;
    private TextView mTotalWrong;



    public static Intent newIntent(Context packageContext, int mGuessList, int mRollList, int mTotalCorrectCounter, int mTotalWrongCounter) {
        Intent intent = new Intent(packageContext, ScoreActivity.class);
        intent.putExtra(GUESSED_LIST, mGuessList);
        intent.putExtra(ROLLED_LIST, mRollList);
        intent.putExtra(TOTAL_CORRECT, mTotalCorrectCounter);
        intent.putExtra(TOTAL_WRONG, mTotalWrongCounter);
        //intent.putIntegerArrayListExtra(GUESSED_LIST, mGuessList);
        //intent.putIntegerArrayListExtra(GUESSED_LIST, mRollList);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        mResetButton = findViewById(R.id.resetbutton);
        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTotalCorrectCounter = 0;
                mTotalWrongCounter = 0;
                mTotalCorrect.setText(Integer.toString(mTotalCorrectCounter));
                mTotalWrong.setText(Integer.toString(mTotalWrongCounter));
                Intent intent = MainActivity.NewIntent(ScoreActivity.this, mTotalWrongCounter, mTotalCorrectCounter);
                startActivity(intent);
            }
        });

        mGuessList = getIntent().getIntExtra(GUESSED_LIST, 0);
        mTotalCorrectCounter = getIntent().getIntExtra(TOTAL_CORRECT, 0);
        mTotalWrongCounter = getIntent().getIntExtra(TOTAL_WRONG, 0);
        mRollList = getIntent().getIntExtra(ROLLED_LIST, 0);

        mGuesses = findViewById(R.id.guessed_numbers);
        mGuesses.setText(Integer.toString(mGuessList));

        mRolls = findViewById(R.id.rolled_numbers);
        mRolls.setText(Integer.toString(mRollList));

        mCorrect = findViewById(R.id.correct);
        mTotalCorrect = findViewById(R.id.totalcorrect);
        mTotalWrong = findViewById(R.id.totalwrong);
        checkAnswer();

    }
    private void checkAnswer( ) {
        if (mGuessList == mRollList ) {
            mCorrect.setText("Correct!");
            mTotalCorrect.setText(Integer.toString(mTotalCorrectCounter));
            mTotalWrong.setText(Integer.toString(mTotalWrongCounter));
        } else {
            mCorrect.setText("Incorrect!");
            mTotalCorrect.setText(Integer.toString(mTotalCorrectCounter));
            mTotalWrong.setText(Integer.toString(mTotalWrongCounter));
        }
    }
}
