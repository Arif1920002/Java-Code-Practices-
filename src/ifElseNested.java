import java.util.Scanner;

public class ifElseNested {

    public static void main(String[] args) {

        boolean isStudent;
        boolean isSenior;

        double price = 9.99;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a student? (true/false)");
        isStudent = scanner.nextBoolean();
        System.out.println("Are you a senior? (true/false)");
        isSenior = scanner.nextBoolean();

        if (isStudent) {
            System.out.println("You get a 20% student discount!");
            price = price - (price * 20) / 100;
            System.out.println("Your final price is: " + price);

            if (isSenior) {
                System.out.println("You get a 10% senior discount!");
                price = (price) - ((price * 10) + (price * 20)) / 100;
                System.out.println("Your final price is: " + price);
            } else {
                System.out.println("You get only the student discount!");
            }

        } else if (isSenior) {
            System.out.println("You get a 10% senior discount!");
            price = price - (price * 10) / 100;
            System.out.println("Your final price is: " + price);
        } else {
            System.out.println("You get no discount!");
            System.out.println("Your final price is: " + price);
        }


    }
}
