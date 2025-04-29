import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Enter your age : ");
        age = scanner.nextInt();

        if (age >= 18 && age <= 49) {

            System.out.println("You are an adult.");
        } else if (age <= 0) {

            System.out.println("You aren't born yet.");
        } else if (age >= 50) {

            System.out.println("You are a senior citizen.");
        } else {

            System.out.println("You are not an adult.");
        }


        scanner.close();

    }

}
