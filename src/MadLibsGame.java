import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args) {

        //Mad Libs game for practical scanner class practice

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Today I went to a ---- zoo");
        adjective1 = scanner.nextLine();

        System.out.println("In an exhibit, I saw a -----");
        noun1 = scanner.nextLine();

        System.out.println("xxx was --- and xxx ing");
        adjective2 = scanner.nextLine();

        System.out.println("xxx was xxx and --- ing");
        verb1 = scanner.nextLine();

        System.out.println("I was -----");
        adjective3 = scanner.nextLine();


        System.out.println("Today I went to a " + adjective1 + " zoo");
        System.out.println("In an exhibit, I saw a " + noun1);
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "ing");
        System.out.println("I was " + adjective3);


        scanner.close();

    }

}
