import java.util.Scanner;

public class MacroNutrients {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int tracker = 1;

        System.out.println("How old are you?");
        while (tracker <= 3) {
            if (tracker == 1) {
                int age = info.nextInt();
                if (age > 0) {
                    System.out.println(age);
                    tracker += 1;
                    System.out.println(tracker);
                }

                else if (age <= 0) {
                    System.out.println("Please enter in a valid age");
                }
            }


            if (tracker == 2) {
                System.out.println(tracker);
                System.out.println("What is your gender?");
                String gender = info.nextLine();
                if (gender == "male" || gender == "female") {
                    System.out.println(gender);
                    tracker += 1;

                }
            }

        }

    }
}
