import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int minStep, totalStep;
 private int totalDays, actDays;

 public StepTracker() {
  minStep = goal;
  totalStep = 0;
  totalDays = 0;
  actDays = 0;
 }

 public void addDailySteps(int steps) {
  totalStep += steps;
  totalDays++;
  if(steps >= minStep) {
   actDays++;
  }
 }
 public int activeDays() {
  return actDays;
 }

 public double averageSteps() {
  if(totalDays == 0) {
   return 0.0;
  } else {
   return (double) totalStep/totalDays;
  }
 }
} 
