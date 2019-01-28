package com.example.ddursteler1.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mInputNumber;
    private Button mRoll;
    private Button mRollPicture;
    private int mGuessNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRoll = findViewById(R.id.roll);
        mRollPicture = findViewById(R.id.rollpicture);

        mInputNumber = findViewById(R.id.input_number);
        mInputNumber.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    mGuessNumber = Integer.parseInt(mInputNumber.getText().toString());
                    Log.d("EditText", mInputNumber.getText().toString());
                    handled = true;
                }
                return handled;
            }
        });
        Log.d("EditTextOutside", Integer.toString(mGuessNumber));
    }
}
