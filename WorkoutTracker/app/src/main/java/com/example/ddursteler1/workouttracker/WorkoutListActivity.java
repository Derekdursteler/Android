package com.example.ddursteler1.workouttracker;

import android.support.v4.app.Fragment;

public class WorkoutListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new WorkoutListFragment();
    }
}
