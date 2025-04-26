import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //System.in is the standard input stream

        /*nextInt() – reads an int value

        nextLine() – reads an entire line of text

        nextDouble() – reads a double value

        next() – reads a single word*/

        System.out.println("Enter your name: ");
        String name = sc.nextLine(); //for sting

        System.out.println("Enter your age: ");
        int age = sc.nextInt(); //for int

        System.out.println("Enter your gpa: ");
        double gpa = sc.nextDouble(); //for double

        System.out.println("Are you a student? (true or false) ");
        boolean isStudent = sc.nextBoolean(); //for boolean


        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your gpa is " + gpa);
        System.out.println("Are you a student? " + isStudent);


        sc.close(); //Always close the Scanner after use by calling scanner.close() to free resources
    }
}
