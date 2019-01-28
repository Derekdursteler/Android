package com.example.ddursteler1.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mInputNumber;
    private Button mRoll;
    private Button mRollPicture;
    private String mGuessNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRoll = findViewById(R.id.roll);
        mRollPicture = findViewById(R.id.rollpicture);

        mInputNumber = findViewById(R.id.input_number);
        mInputNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mGuessNumber = "0";
                Log.d("InputNumber", mGuessNumber);

            }
        });
    }
}
