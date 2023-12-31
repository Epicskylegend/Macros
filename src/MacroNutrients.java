import java.util.Scanner;

public class MacroNutrients  {


    public static void main(String[] args) {
        UserInfo user = new UserInfo();
        MacroCalculations macros = new MacroCalculations();
        Scanner info = new Scanner(System.in);
        int tracker = 1;
        int counter = 0;


        while (tracker <= 7) {
            double calories = (user.weight * 0.454) * (9.99) + (6.25 * user.height) - (4.92 * user.age) + 5;
            double femaleCalories = (user.weight * 0.454) * (9.99) + (6.25 * user.height) - (4.92 * user.age) - 116;

            int protein = 0;
            int carbs = 0;
            int fat = 0;
            int sugar = 0;

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
                if (user.gender.equals("male") || user.gender.equals("Male")) {
                    System.out.println(user.gender);
                    tracker += 1;
                    user.heightInfo();
                }
                else if (user.gender.equals("female") || user.gender.equals("Female")) {
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
                if (user.weight > 0) {
                    System.out.println(user.weight);
                    tracker += 1;
                    user.exerciseInfo();
                }

            }
            if (tracker == 5) {
                user.exerciseDays = info.nextInt();
                if (user.exerciseDays >= 0) {
                    System.out.println(user.exerciseDays);
                    tracker += 1;
                    user.weightGoal();
                }

            }

            if (tracker == 6) {
                user.fitnessGoal = info.nextLine();
                if (user.fitnessGoal.equals("lose") || user.fitnessGoal.equals("maintain") || user.fitnessGoal.equals("gain")) {
                    System.out.println(user.fitnessGoal);
                    tracker += 1;
                    user.dietInfo();
                }
            }
            if(tracker == 7) {
                user.diet = info.nextLine();
                if (user.diet.equals("balanced") || user.diet.equals("high protein") || user.diet.equals("low fat") || user.diet.equals("low carb")) {
                    System.out.println(user.diet);
                    tracker += 1;

                }
            }

            if (tracker == 8) {
                if (user.exerciseDays == 0) {
                    calories *= 1.2;
                    femaleCalories *= 1.1;
                }
                if (user.exerciseDays > 0 && user.exerciseDays < 3) {
                    calories *= 1.375;
                    femaleCalories *= 1.2;
                }
                if (user.exerciseDays >= 3 && user.exerciseDays < 6) {
                    calories *= 1.55;
                    femaleCalories *= 1.35;
                }
                if (user.exerciseDays >= 6) {
                    calories *= 1.725;
                    femaleCalories *= 1.5;
                }
                if (user.fitnessGoal.equals("lose")) {
                    calories *= 0.8;
                    femaleCalories *= 0.8;
                }
                if (user.fitnessGoal.equals("gain")) {
                    calories *= 1.2;
                    femaleCalories *= 1.2;
                }
                if (user.diet.equals("balanced")) {
                    protein += (calories * 0.25)/4;
                    carbs += (calories * 0.50)/4;
                    fat += (calories * 0.25)/9;
                }
                if (user.diet.equals("high protein")) {
                    protein += (calories * 0.35)/4;
                    carbs += (calories * 0.40)/4;
                    fat += (calories * 0.25)/9;
                }
                if (user.diet.equals("low fat")) {
                    protein += (calories * 0.30)/4;
                    carbs += (calories * 0.50)/4;
                    fat += (calories * 0.20)/9;
                }
                if (user.diet.equals("low carb")) {
                    protein += (calories * 0.30) / 4;
                    carbs += (calories * 0.40) / 4;
                    fat += (calories * 0.30) / 9;
                }
                if (user.gender.equals("male")) {
                    user.macroInfo();
                    System.out.println("Recommended Daily Calories: " + Math.rint(calories));
                    System.out.println("Recommended Daily Protein Intake: " + protein + "g");
                    System.out.println("Recommended Daily Carb Intake: " + carbs + "g");
                    System.out.println("Recommended Daily Fat Intake: " + fat + "g");
                }
                if (user.gender.equals("female")) {
                    protein *= 0.78;
                    user.macroInfo();
                    System.out.println("Recommended Daily Calories: " + Math.rint(femaleCalories));
                    System.out.println("Recommended Protein Intake: " + protein + "g");
                    System.out.println("Recommended Daily Carb Intake: " + carbs + "g");
                    System.out.println("Recommended Daily Fat Intake: " + fat + "g");
                }


            }

        }

    }
}