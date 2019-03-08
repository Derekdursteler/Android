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

public class WorkoutFragment extends Fragment {

    private static final String ARG_WORKOUT_ID = "workout_id";

    private WorkoutPlanPush mWorkoutPlanPush;
    private EditText mDeadlift;
    private EditText mPullups;
    private EditText mRows;
    private EditText mHammer;
    private EditText mBicep;
    private Integer mWorkId;

    public static WorkoutFragment newInstance(UUID workoutId) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_WORKOUT_ID, workoutId);

        WorkoutFragment fragment = new WorkoutFragment();
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
        
        mWorkId = workoutPlans.size();
        mWorkId -= 1;
        Log.v("Which workout: ", Integer.toString(mWorkId));

        View v = inflater.inflate(R.layout.fragment_workout, container, false);

        if (mWorkId % 2 == 0) {
            v = inflater.inflate(R.layout.fragment_workout, container, false);
        } else if (mWorkId % 2 == 1) {
            v = inflater.inflate(R.layout.fragment_workout1, container, false);
        }

        mDeadlift = v.findViewById(R.id.deadlift);
        mPullups = v.findViewById(R.id.pullups);
        mRows = v.findViewById(R.id.rows);
        mHammer = v.findViewById(R.id.hammer);
        mBicep = v.findViewById(R.id.bicep);

        mDeadlift.setText(mWorkoutPlanPush.getmDeadlift());
        mPullups.setText(mWorkoutPlanPush.getmPullups());
        mRows.setText(mWorkoutPlanPush.getmRows());
        mHammer.setText(mWorkoutPlanPush.getmHammer());
        mBicep.setText(mWorkoutPlanPush.getmBicep());

        mDeadlift.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setDeadlift(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mPullups.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmPullups(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mRows.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmRows(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mHammer.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmHammer(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mBicep.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlanPush.setmBicep(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return v;
    }
}
