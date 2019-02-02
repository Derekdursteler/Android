package com.example.ddursteler1.project1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ScoreActivity extends AppCompatActivity {

    private static final String GUESSED_NUMBER = "com.example.ddursteler1.project1.guessed_number";
    private static final String ROLLED_NUMBER = "com.example.ddursteler1.project1.rolled_number";

    private int mGuessedNumber;
    private int mRolledNumber;
    private TextView mGuesses;
    private TextView mRolls;
    private TextView mCorrect;


    public static Intent newIntent(Context packageContext, int mGuessNumber, int mRolledNumber) {
        Intent intent = new Intent(packageContext, ScoreActivity.class);
        intent.putExtra(GUESSED_NUMBER, mGuessNumber);
        intent.putExtra(ROLLED_NUMBER, mRolledNumber);
        Log.d("mGuessNumber", Integer.toString(mGuessNumber));
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        mGuessedNumber = getIntent().getIntExtra(GUESSED_NUMBER, 0);
        Log.d("Guessed number", Integer.toString(mGuessedNumber));

        mGuesses = findViewById(R.id.guessed_numbers);
        mGuesses.setText(Integer.toString(mGuessedNumber));

        mRolledNumber = getIntent().getIntExtra(ROLLED_NUMBER, 0);

        mRolls = findViewById(R.id.rolled_numbers);
        mRolls.setText(Integer.toString(mRolledNumber));

        mCorrect = findViewById(R.id.correct);
        checkAnswer();


    }
    private void checkAnswer( ) {
        if (mGuessedNumber == mRolledNumber ) {
            mCorrect.setText("Correct!");
        } else {
            mCorrect.setText("Incorrect!");
        }
    }
}
