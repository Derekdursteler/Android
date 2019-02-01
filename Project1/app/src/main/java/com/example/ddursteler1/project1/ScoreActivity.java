package com.example.ddursteler1.project1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private static final String GUESSED_NUMBER = "com.example.ddursteler1.project1.guessed_number";

    private int mGuessedNumber;
    private TextView mGuesses;


    public static Intent newIntent(Context packageContext, int mGuessNumber) {
        Intent intent = new Intent(packageContext, ScoreActivity.class);
        intent.putExtra(GUESSED_NUMBER, mGuessNumber);
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
    }
}
