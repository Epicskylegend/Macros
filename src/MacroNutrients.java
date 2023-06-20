import java.util.Scanner;
public class MacroNutrients {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);


        while(!info.hasNextInt()) {
            System.out.println("How old are you?");
            String age = info.nextLine();
            System.out.println(age);


        }
    }
}
