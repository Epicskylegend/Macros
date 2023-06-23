public class UserInfo {
    String gender = "m";
    String fitnessGoal = null;
    String diet = null;
    int age = 1;
    int weight = 1;
    int height = 1;
    int exerciseDays = 0;




    public void macroInfo () {
        System.out.println("User Information");
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Days a week you exercise: " + exerciseDays);
        System.out.println("Weight Goal: " + fitnessGoal + " weight");
        System.out.println("Diet Type: " + diet);
    }

    public void ageInfo () {
        System.out.println("How old are you?");
    }
    public void genderInfo () {
        System.out.println("What is your gender?");
    }

    public void invalidAge () {
        System.out.println("Please enter in a valid age");
    }
    public void heightInfo () {
        System.out.println("List your height in cm.");
    }
    public void invalidGender () {
        System.out.println("Please enter in a valid gender.");
    }
    public void weightInfo () {
        System.out.println("What is your weight in lbs?");
    }
    public void exerciseInfo () {
        System.out.println("How many days a week do you exercise?");
    }
    public void weightGoal () {
        System.out.println("Is your goal to gain, lose, or maintain your current weight?");
    }
    public void dietInfo () {
        System.out.println("Are you pursuing a balanced, high protein, low fat or low carb diet?");
    }


}
