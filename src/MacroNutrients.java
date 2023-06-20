import java.util.Scanner;

public class MacroNutrients {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("How old are you?");
        while(!info.equals("Stop")) {
            int age = info.nextInt();
            if ( age > 0) {
                System.out.println(age);
            }
            else if (age <= 0) {
                System.out.println("Please enter in a valid age");
                continue;
            }
            String gender = info.nextLine();
            if (gender == "male" || gender == "female") {
                System.out.println(gender);
            }

        }

    }
}
