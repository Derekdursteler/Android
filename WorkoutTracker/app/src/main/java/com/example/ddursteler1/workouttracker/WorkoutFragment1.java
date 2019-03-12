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


public class WorkoutFragment1 extends Fragment {

    private static final String ARG_WORKOUT_ID = "workout_id";

    private WorkoutPlanPush mWorkoutPlanPush;
    private EditText mBench;
    private EditText mOverhead;
    private EditText mIncline;
    private EditText mTriceps;
    private EditText mLats;

    public static WorkoutFragment1 newInstance(UUID workoutId) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_WORKOUT_ID, workoutId);

        WorkoutFragment1 fragment = new WorkoutFragment1();
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

        View v = inflater.inflate(R.layout.fragment_workout1, container, false);

        mBench = v.findViewById(R.id.benchpress);
        mOverhead = v.findViewById(R.id.overhead);
        mIncline = v.findViewById(R.id.incline);
        mTriceps = v.findViewById(R.id.triceps);
        mLats = v.findViewById(R.id.lats);

        mBench.setText(mWorkoutPlanPush.getmBenchPress());
        mOverhead.setText(mWorkoutPlanPush.getmOverheadPress());
        mIncline.setText(mWorkoutPlanPush.getmInclineBench());
        mTriceps.setText(mWorkoutPlanPush.getmTriceps());
        mLats.setText(mWorkoutPlanPush.getmLatRaises());

        mBench.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmBenchPress(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mOverhead.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmOverheadPress(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mIncline.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmInclineBench(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mTriceps.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmTriceps(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mLats.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmLatRaises(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return v;
    }
}

