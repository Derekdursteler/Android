package com.example.ddursteler1.workouttracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.UUID;

public class WorkoutFragment extends Fragment {

    private static final String ARG_WORKOUT_ID = "workout_id";

    private WorkoutPlan mWorkoutPlan;
    private EditText mDeadlift;
    private EditText mPullups;
    private EditText mRows;
    private EditText mHammer;
    private EditText mBicep;

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
        mWorkoutPlan = WorkoutLab.get(getActivity()).getWorkoutPlan(workoutId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_workout, container, false);

        mDeadlift = v.findViewById(R.id.deadlift);
        mPullups = v.findViewById(R.id.pullups);
        mRows = v.findViewById(R.id.rows);
        mHammer = v.findViewById(R.id.hammer);
        mBicep = v.findViewById(R.id.bicep);

        mDeadlift.setText(mWorkoutPlan.getmDeadlift());
        mPullups.setText(mWorkoutPlan.getmPullups());
        mRows.setText(mWorkoutPlan.getmRows());
        mHammer.setText(mWorkoutPlan.getmHammer());
        mBicep.setText(mWorkoutPlan.getmBicep());

        mDeadlift.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mWorkoutPlan.setDeadlift(s.toString());
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
                mWorkoutPlan.setmPullups(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return v;
    }
}
