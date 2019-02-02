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

    private static final String GUESSED_LIST = "com.example.ddursteler1.project1.guessed_number";
    private static final String ROLLED_LIST = "com.example.ddursteler1.project1.rolled_number";

    private int mGuessList;
    private int mRollList;
    private TextView mGuesses;
    private TextView mRolls;
    private TextView mCorrect;


    public static Intent newIntent(Context packageContext, int mGuessList, int mRollList) {
        Intent intent = new Intent(packageContext, ScoreActivity.class);
        intent.putExtra(GUESSED_LIST, mGuessList);
        intent.putExtra(ROLLED_LIST, mRollList);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        mGuessList = getIntent().getIntExtra(GUESSED_LIST, 0);

        mGuesses = findViewById(R.id.guessed_numbers);
        mGuesses.setText(Integer.toString(mGuessList));

        mRollList = getIntent().getIntExtra(ROLLED_LIST, 0);

        mRolls = findViewById(R.id.rolled_numbers);
        mRolls.setText(Integer.toString(mRollList));

        mCorrect = findViewById(R.id.correct);
        checkAnswer();


    }
    private void checkAnswer( ) {
        if (mGuessList == mRollList ) {
            mCorrect.setText("Correct!");
        } else {
            mCorrect.setText("Incorrect!");
        }
    }
}
