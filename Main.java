import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter Grade 1: ");
        double grade1 = input.nextDouble();

        System.out.print("Enter Grade 2: ");
        double grade2 = input.nextDouble();

        System.out.print("Enter Grade 3: ");
        double grade3 = input.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3;

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Average: " + average);

        if (average >= 75) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}