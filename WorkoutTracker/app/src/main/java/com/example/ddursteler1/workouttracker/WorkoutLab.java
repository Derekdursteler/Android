package com.example.ddursteler1.workouttracker;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


// This is the singleton

public class WorkoutLab {
    private static WorkoutLab sWorkoutLab;

    private List<WorkoutPlan> mWorkoutPlans;

    public static WorkoutLab get(Context context){
        if (sWorkoutLab == null ) {
            sWorkoutLab = new WorkoutLab(context);
        }
        return sWorkoutLab;
    }

    private WorkoutLab(Context context) {
        mWorkoutPlans = new ArrayList<>();
        int x = 1;
        for (int i = 1; i < 100; i++) {
            WorkoutPlan workoutPlan = new WorkoutPlan();
            if ( x > 3 ) {
                x -= 3;
            }
            if ( x == 1 ) {
                workoutPlan.setmTitle("Day #" + i + " - Push");
            } else if ( x == 2 ) {
                workoutPlan.setmTitle("Day #" + i + " - Pull");
            } else if ( x == 3 ){
                workoutPlan.setmTitle("Day #" + i + " - Legs");
            }
            x += 1;
            workoutPlan.setmCompleted(i % 2 == 1);
            mWorkoutPlans.add(workoutPlan);
        }
    }

    public List<WorkoutPlan> getWorkoutPlans() {
        return mWorkoutPlans;
    }
    public WorkoutPlan getWorkoutPlan(UUID id) {
        for (WorkoutPlan workoutPlan : mWorkoutPlans) {
            if (workoutPlan.getmId().equals(id)) {
                return workoutPlan;
            }
        }
        return null;
    }
}
