package com.example.ddursteler1.workouttracker;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


// This is the singleton

public class WorkoutLab {
    private static WorkoutLab sWorkoutLab;

    private List<WorkoutPlanPush> mWorkoutPlans;


    public static WorkoutLab get(Context context){
        if (sWorkoutLab == null ) {
            sWorkoutLab = new WorkoutLab(context);
        }
        return sWorkoutLab;
    }

    private WorkoutLab(Context context) {
        mWorkoutPlans = new ArrayList<>();
    }

    public void addWorkout(WorkoutPlanPush workout) {
        mWorkoutPlans.add(workout);
    }

    public List<WorkoutPlanPush> getWorkoutPlans() {
        return mWorkoutPlans;
    }
    public WorkoutPlanPush getWorkoutPlan(UUID id) {
        for (WorkoutPlanPush workoutPlan : mWorkoutPlans) {
            if (workoutPlan.getmId().equals(id)) {
                return workoutPlan;
            }
        }
        return null;
    }
}
