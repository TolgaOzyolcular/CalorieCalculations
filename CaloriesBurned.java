public class CaloriesBurned {
       public static void main(String[] args) {
              double weight = 82.0; //Kilograms (kg)
              //http://www.ucdenver.edu/academics/colleges/medicine/sportsmed/cusm_patient_resources/Documents/Estimating%20Energy%20Expenditure.pdf
              double MET = 7.0; //10.0 (Swimming), 10.0 (Running 6mph), 9.0 (Running 5.2mph), 7.0 (Boxing), 6.0 (Skiing Down hill), 3.5 (Walking 3mph), 1.0 (Watching TV),
              int minutes = 40;
              int numberOfTimes = 1;
             
              System.out.println("Boxing:");
              System.out.println(caloriesBurned(7.0, 82.0, 35, 3));
             
              System.out.println("Walking:");
              System.out.println(caloriesBurned(3.5, 82.0, 60, 5));
             
              System.out.println("Swimming:");
              System.out.println(caloriesBurned(10.0, 82.0, 15, 2));
             
              System.out.println("Total = " + Math.ceil(((caloriesBurned(7.0, 82.0, 35, 3) + caloriesBurned(3.5, 82.0, 60, 5) + caloriesBurned(10.0, 82.0, 15, 2))/7)));
       }
      
       public static double caloriesBurned(double MET, double weight, int minutes, int numberOfTimes) {
              double caloriesPerMinute = 0.0175*MET*weight;
              double caloriesBurned = (Math.ceil(caloriesPerMinute*minutes)) * numberOfTimes;
             
              return caloriesBurned;
       }
}
