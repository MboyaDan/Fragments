package com.example.admin.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    List<String>getWorkouts(String workouttypes){
      List<String>workout= new ArrayList<String>();
      if (workouttypes.equals("chest")){
          workout.add("Bench Press");
          workout.add("Cable fly");
      }
else if(workouttypes.equals("Tricept")){
          workout.add("Tricept Ext");
          workout.add("Tricept PushDowns");
      }
      else if(workouttypes.equals("shoulders"))
      {
          workout.add("Shoulder press");
      }
      else if(workouttypes.equals("bicept")){
          workout.add("Bicept curls");
      }
        return workout;
    }

}
