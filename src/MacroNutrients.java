import java.util.Scanner;

public class MacroNutrients  {
    public static void main(String[] args) {
        UserInfo user = new UserInfo();
        Scanner info = new Scanner(System.in);
        int tracker = 1;
        int counter = 0;



        while (tracker <= 3) {
            if (tracker == 1) {
                user.ageInfo();
                 user.age = info.nextInt();
                if (user.age > 0) {
                    tracker += 1;
                    counter += 1;
                    user.genderInfo();
                }

                else if (user.age <= 0) {
                   user.invalidAge();
                }
            }


            if (tracker == 2) {
                user.gender = info.nextLine();
                if (user.gender.equals("male") || user.gender.equals("female")) {
                    System.out.println(user.gender);
                    tracker += 1;
                    user.heightInfo();
                }

                else if (user.gender.equals("male") || user.gender.equals("female")) {
                    user.invalidGender();
                    }

                if (counter > 1) {
                    user.invalidGender();
                }
            }

            if (tracker == 3) {
                user.height = info.nextInt();
                if (user.height > 0) {
                    System.out.println(user.height);
                    tracker += 1;
                    user.weightInfo();
                }

            }

            if (tracker == 4) {
                user.weight = info.nextInt();
                if (user.weight >= 0) {
                    System.out.println(user.weight);
                    tracker += 1;
                   user.exerciseInfo();
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
