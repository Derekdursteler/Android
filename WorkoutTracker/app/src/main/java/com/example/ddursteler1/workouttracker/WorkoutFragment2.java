package com.example.ddursteler1.workouttracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.List;
import java.util.UUID;


public class WorkoutFragment2 extends Fragment {

    private static final String ARG_WORKOUT_ID = "workout_id";

    private WorkoutPlanPush mWorkoutPlanPush;
    private EditText mSquats;
    private EditText mRomanian;
    private EditText mLegPress;
    private EditText mLegCurl;
    private EditText mCalfRaises;

    public static WorkoutFragment2 newInstance(UUID workoutId) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_WORKOUT_ID, workoutId);

        WorkoutFragment2 fragment = new WorkoutFragment2();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UUID workoutId = (UUID) getArguments().getSerializable(ARG_WORKOUT_ID);
        mWorkoutPlanPush = WorkoutLab.get(getActivity()).getWorkoutPlan(workoutId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        WorkoutLab workoutLab = WorkoutLab.get(getActivity());
        List<WorkoutPlanPush> workoutPlans = workoutLab.getWorkoutPlans();

        View v = inflater.inflate(R.layout.fragment_workout2, container, false);

        mSquats = v.findViewById(R.id.squats);
        mRomanian = v.findViewById(R.id.romanian);
        mLegPress = v.findViewById(R.id.legpress);
        mLegCurl = v.findViewById(R.id.legcurl);
        mCalfRaises = v.findViewById(R.id.calfraises);

        mSquats.setText(mWorkoutPlanPush.getmSquats());
        mRomanian.setText(mWorkoutPlanPush.getmRomanian());
        mLegPress.setText(mWorkoutPlanPush.getmLegPress());
        mLegCurl.setText(mWorkoutPlanPush.getmLegCurls());
        mCalfRaises.setText(mWorkoutPlanPush.getmCalfRaises());

        mSquats.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmSquats(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mRomanian.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmRomanian(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mLegPress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmLegPress(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mLegCurl.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmLegCurls(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mCalfRaises.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmCalfRaises(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return v;
    }
}

