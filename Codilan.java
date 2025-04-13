import java.util.Scanner;

public class Codilan {
    public static void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! This is Codilan contributing to the project.");
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your current age is: " + age);
        System.out.println("Next year, you will be: " + (age + 1));

        scanner.close();
    }
}
