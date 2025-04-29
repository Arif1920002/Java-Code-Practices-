import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;
        String name;

        //Name block

        System.out.println("Enter your name : ");
        name = scanner.nextLine();

        if (name.isEmpty()) {

            System.out.println("You didn't enter your name. 😾 ");
        } else {

            System.out.println("Hello 😄" + name);
        }


        //Age block

        System.out.println("Enter your age : ");
        age = scanner.nextInt();

        if (age >= 18 && age <= 49) {
            System.out.println("You are an adult. 👨‍🦱");
        } else if (age <= 0) {
            System.out.println("You aren't born yet. 👶");
        } else {
            System.out.println("You are a senior citizen. .🧓");
        }

        scanner.close();

    }
}


