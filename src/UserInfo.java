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
        System.out.println("Height: " + height + " cm.");
        System.out.println("Weight: " + weight + " lbs.");
        System.out.println("Days a week you exercise: " + exerciseDays);
        System.out.println("A: " + age);
        System.out.println("Recommended daily calories: " + calories);

    }
}
