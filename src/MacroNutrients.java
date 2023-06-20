import java.util.Scanner;

public class MacroNutrients {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int tracker = 1;
        int counter = 0;


        while (tracker <= 3) {
            if (tracker == 1) {
                System.out.println("How old are you?");
                int age = info.nextInt();
                if (age > 0) {
//                    System.out.println(age);
                    tracker += 1;
                    System.out.println("What is your gender?");
                }

                else if (age <= 0) {
                    System.out.println("Please enter in a valid age");
                }
            }


            if (tracker == 2) {
                String gender = info.nextLine();
                if (gender.equals("male") || gender.equals("female")) {
                    System.out.println(gender);
                    tracker += 1;
                }

                else if (gender.equals("male") || gender.equals("female")) {
                    counter += 1;
                    if (counter >= 1) {
                        System.out.println("Please enter in a valid gender.");
                    }

                }
            }


        }

    }
}
