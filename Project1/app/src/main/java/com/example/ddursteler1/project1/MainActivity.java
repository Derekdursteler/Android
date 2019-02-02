package com.example.ddursteler1.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText mInputNumber;
    private TextView mGuessText;
    private Button mRoll;
    private Button mRollPicture;
    private Button mScoreButton;
    private int mGuessNumber = 0;
    private int mRandomNumber = 0;
    List<Integer> guessList = new ArrayList<>();
    List<Integer> rolledList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGuessText = findViewById(R.id.guess_text);

        mRoll = findViewById(R.id.roll);
        mRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                mRandomNumber = rand.nextInt(6) + 1;
                Log.d("Random", Integer.toString(mRandomNumber));
                mRoll.setText("You rolled " + Integer.toString(mRandomNumber));
                checkAnswer();
            }
        });

        mInputNumber = findViewById(R.id.input_number);
        mInputNumber.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    mGuessNumber = Integer.parseInt(mInputNumber.getText().toString());
                    Log.d("EditText", mInputNumber.getText().toString());
                    handled = true;
                    mInputNumber.getText().clear();
                    mGuessText.setText("You guessed " + Integer.toString(mGuessNumber));
                }
                return handled;
            }
        });
        mRollPicture = findViewById(R.id.rollpicture);
        mRollPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mGuessText.setText("Guess Number:");
                mRoll.setText("Roll Dice");
            }
        });

        mScoreButton = findViewById(R.id.score_button);
        mScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go to score layout + activity
                Intent intent = ScoreActivity.newIntent(MainActivity.this, mGuessNumber, mRandomNumber);
                startActivity(intent);
            }
        });
    }
    private void checkAnswer( ) {

        int messageResId;

        if (mGuessNumber == mRandomNumber ) {
            messageResId = R.string.correct_toast;
        } else {
            messageResId = R.string.incorrect_toast;
        }
        Toast toast = Toast.makeText( this, messageResId, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();
    }
}
