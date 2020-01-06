public class CalorieCalculator{
       public static void main(String[] args) {
              double height = 186.0; //Centimeters (cm)
              double weight = 82.0; //Kilograms (kg)
              int age = 27;
              char gender = 'M';
              int activityLevel = 1; //1 (Sedentary), 2 (Lightly Active), 3 (Moderately Active), 4 (Very Active), 5 (Extra Active)
             
              System.out.println(TDEE(height, weight, age, gender, activityLevel));
             
       }
      
       public static double TDEE(double height, double weight, int age, char gender, int activityLevel) {
              double BMR, TDEE, activityFactor;
              BMR = TDEE = activityFactor = 0.0;
             
              switch(gender) {
                     case 'M': BMR = 66.47 + (13.75*weight) + (5.0*height) - (6.75*age);
                     	break;
                     case 'F': BMR = 665.09 + (9.56*weight) + (1.84*height) - (4.67*age);
                     	break;
                     default: System.out.println("Incorrect Gender Selected");
                     	System.exit(0);
              }
             
              switch (activityLevel) {
                     case 1: activityFactor = 1.34;
                     	break;
                     case 2: activityFactor = 1.42;
                     	break;
                     case 3: activityFactor = 1.57;
                     	break;
                     case 4: activityFactor = 1.62;
                     	break;
                     case 5: activityFactor = 1.81;
                     	break;
                     default: System.out.println("Incorrect Activity Level Selected");
                     	System.exit(0);
              }
             
              TDEE = Math.ceil(BMR * activityFactor);
             
              return TDEE;
       }
 
}