package com.example.ddursteler1.workouttracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class WorkoutListFragment extends Fragment {

    private RecyclerView mWorkoutRecyclerView;
    private WorkoutAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workout_list, container, false);

        mWorkoutRecyclerView = view.findViewById(R.id.workout_recycler_view);
        mWorkoutRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        updateUI();
    }

    private void updateUI() {
        WorkoutLab workoutLab = WorkoutLab.get(getActivity());
        List<WorkoutPlan> workoutPlans = workoutLab.getWorkoutPlans();

        if (mAdapter == null) {
            mAdapter = new WorkoutAdapter(workoutPlans);
            mWorkoutRecyclerView.setAdapter(mAdapter);
        } else {
            mAdapter.notifyDataSetChanged();
        }
    }
    private class WorkoutHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mTitleTextView;
        private TextView mDateTextView;
        private WorkoutPlan mWorkoutPlan;

        public WorkoutHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_workout, parent, false));
            itemView.setOnClickListener(this);

            mTitleTextView = itemView.findViewById(R.id.workout_title);
            mDateTextView = itemView.findViewById(R.id.workout_date);
        }
        public void bind(WorkoutPlan workoutPlan) {
            mWorkoutPlan = workoutPlan;
            mTitleTextView.setText(mWorkoutPlan.getmTitle());
            mDateTextView.setText(DateFormat.format("EEEE, MMM dd, yyyy", mWorkoutPlan.getmDate()));
        }
        @Override
        public void onClick(View view) {
           Intent intent = WorkoutActivity.newIntent(getActivity(), mWorkoutPlan.getmId());
           startActivity(intent);
        }
    }
    private class WorkoutAdapter extends RecyclerView.Adapter<WorkoutHolder> {
        private List<WorkoutPlan> mWorkoutPlans;
        public WorkoutAdapter(List<WorkoutPlan> workoutPlans) {
            mWorkoutPlans = workoutPlans;
        }
        @Override
        public WorkoutHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new WorkoutHolder(layoutInflater, parent);
        }
        @Override
        public void onBindViewHolder(WorkoutHolder holder, int position) {
            WorkoutPlan workoutPlan = mWorkoutPlans.get(position);
            holder.bind(workoutPlan);
        }
        @Override
        public int getItemCount() {
            return mWorkoutPlans.size();
        }
    }
}
