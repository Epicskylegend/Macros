public class UserInfo {
    String gender = null;
    int age = 0;
    int weight = 0;
    int height = 0;
    int exerciseDays = 0;

    int calories = 0;
    public void macroInfo () {
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Days a week you exercise: " + exerciseDays);
        System.out.println("Weight Goal: ");
        System.out.println("Recommended daily calories: " + calories);

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

}