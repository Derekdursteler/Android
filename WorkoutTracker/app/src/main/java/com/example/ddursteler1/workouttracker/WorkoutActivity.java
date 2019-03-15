package com.example.ddursteler1.workouttracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import java.util.List;
import java.util.UUID;

public class WorkoutActivity extends SingleFragmentActivity {

    public static final String EXTRA_WORKOUT_ID = "com.example.ddursteler1.workouttracker.workout_id";

    private static UUID mUUID;


    public static Intent newIntent(Context packageContext, UUID workoutId) {
        Intent intent = new Intent(packageContext, WorkoutActivity.class);
        intent.putExtra(EXTRA_WORKOUT_ID, workoutId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        setTitle(R.string.your_title);
        UUID workoutId = (UUID) getIntent().getSerializableExtra(EXTRA_WORKOUT_ID);

        WorkoutLab workoutLab = WorkoutLab.get(WorkoutActivity.this);
        List<WorkoutPlanPush> workouts = workoutLab.getWorkoutPlans();

        if (workoutId.equals(workouts.get(workouts.size() - (workouts.size() - 1)).getmId())) {
            return WorkoutFragment1.newInstance(workoutId);
        } else if (workoutId.equals(workouts.get(workouts.size() - (workouts.size() - 2)).getmId())) {
            return WorkoutFragment2.newInstance(workoutId);
        } else if (workouts.size() > 3 ) {
            if (workoutId.equals(workouts.get(workouts.size() - 3).getmId())) {
                return WorkoutFragment.newInstance(workoutId);
            } else if (workoutId.equals(workouts.get(workouts.size() - 2).getmId())) {
                return WorkoutFragment1.newInstance(workoutId);
            } else {
                return WorkoutFragment2.newInstance(workoutId);
            }
        } else {
            return WorkoutFragment.newInstance(workoutId);
        }
    }
}
