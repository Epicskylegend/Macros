import java.util.Scanner;

public class MacroNutrients {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int tracker = 1;
        int counter = 0;

        String gender;
        int age = 0;
        int weight;
        int height;
        int exerciseDays;


        while (tracker <= 3) {
            if (tracker == 1) {
                System.out.println("How old are you?");
                 age = info.nextInt();
                if (age > 0) {
                    tracker += 1;
                    counter += 1;
                    System.out.println("What is your gender?");
                }

                else if (age <= 0) {
                    System.out.println("Please enter in a valid age");
                }
            }


            if (tracker == 2) {
                gender = info.nextLine();
                if (gender.equals("male") || gender.equals("female")) {
                    System.out.println(gender);
                    tracker += 1;
                    System.out.println("List your height in cm.");
                }

                else if (gender.equals("male") || gender.equals("female")) {
                    System.out.println("Please enter in a valid gender.");
                    }

                if (counter > 1) {
                    System.out.println("Please enter in a valid gender.");

                }
            }

            if (tracker == 3) {
                height = info.nextInt();
                if (height > 0) {
                    System.out.println(height);
                    tracker += 1;
                    System.out.println("What is your weight in lbs?");
                }

            }

            if (tracker == 4) {
                weight = info.nextInt();
                if (weight >= 0) {
                    System.out.println(weight);
                    tracker += 1;
                    System.out.println("How many days a week do you exercise?");
                }

            }
            if (tracker == 5) {
                exerciseDays = info.nextInt();
                if (exerciseDays > 0) {
                    System.out.println(exerciseDays);
                    tracker += 1;
                }

            }
            if (tracker == 6) {
                System.out.println("Age: " + age);
    
            }


        }

    }
}
