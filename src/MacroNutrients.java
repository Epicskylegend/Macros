import java.util.Scanner;

public class MacroNutrients  {
    public static void main(String[] args) {
        UserInfo user = new UserInfo();
        Scanner info = new Scanner(System.in);
        int tracker = 1;
        int counter = 0;



        int calories = 0;


        while (tracker <= 3) {
            if (tracker == 1) {
                System.out.println("How old are you?");
                 user.age = info.nextInt();
                if (user.age > 0) {
                    tracker += 1;
                    counter += 1;
                    System.out.println("What is your gender?");
                }

                else if (user.age <= 0) {
                    System.out.println("Please enter in a valid age");
                }
            }


            if (tracker == 2) {
                user.gender = info.nextLine();
                if (user.gender.equals("male") || user.gender.equals("female")) {
                    System.out.println(user.gender);
                    tracker += 1;
                    System.out.println("List your height in cm.");
                }

                else if (user.gender.equals("male") || user.gender.equals("female")) {
                    System.out.println("Please enter in a valid gender.");
                    }

                if (counter > 1) {
                    System.out.println("Please enter in a valid gender.");

                }
            }

            if (tracker == 3) {
                user.height = info.nextInt();
                if (user.height > 0) {
                    System.out.println(user.height);
                    tracker += 1;
                    System.out.println("What is your weight in lbs?");
                }

            }

            if (tracker == 4) {
                user.weight = info.nextInt();
                if (user.weight >= 0) {
                    System.out.println(user.weight);
                    tracker += 1;
                    System.out.println("How many days a week do you exercise?");
                }

            }
            if (tracker == 5) {
                user.exerciseDays = info.nextInt();
                if (user.exerciseDays > 0) {
                    System.out.println(user.exerciseDays);
                    tracker += 1;
                }

            }
            if (tracker == 6) {
                user.macroInfo();

    
            }


        }

    }
}
