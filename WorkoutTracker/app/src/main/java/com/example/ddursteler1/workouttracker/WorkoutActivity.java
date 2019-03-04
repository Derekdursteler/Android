package com.example.ddursteler1.workouttracker;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class WorkoutActivity extends SingleFragmentActivity {

    public static final String EXTRA_WORKOUT_ID = "com.example.ddursteler1.workouttracker.workout_id";

    public static Intent newIntent(Context packageContext, UUID workoutId) {
        Intent intent = new Intent(packageContext, WorkoutActivity.class);
        intent.putExtra(EXTRA_WORKOUT_ID, workoutId);
        return intent;
    }
    @Override
    protected Fragment createFragment() {
        UUID workoutId = (UUID) getIntent().getSerializableExtra(EXTRA_WORKOUT_ID);
        return WorkoutFragment.newInstance(workoutId);
    }
}
