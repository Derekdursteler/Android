package com.example.ddursteler1.workouttracker;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
        for (int i = 0; i < 100; i++) {
            WorkoutPlan workoutPlan = new WorkoutPlan();
            workoutPlan.setmTitle("Day #" + i+1 + " - Push");
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
