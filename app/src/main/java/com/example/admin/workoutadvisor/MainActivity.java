package com.example.admin.workoutadvisor;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends Activity {
private WorkoutExpert expert=new WorkoutExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

public void onClickFIndWorkout(View view){
    TextView workouts=(TextView) findViewById(R.id.workout);
    Spinner workouttype=(Spinner) findViewById(R.id.workoutype);
    String workout = String.valueOf(workouttype.getSelectedItem());
   // workouts.setText(workout);
    List<String>workoutList=expert.getWorkouts(workout);
    StringBuilder workoutsFormatted=new StringBuilder();
    for(String work:workoutList){
workoutsFormatted.append(work).append('\n');
    }
    workouts.setText(workoutsFormatted);
}


}
