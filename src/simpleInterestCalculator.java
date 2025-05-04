import java.util.Scanner;

public class simpleInterestCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;


        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        rate = scanner.nextDouble() / 100;

        System.out.println("How many times is the interest compounded per year? ");
        timeCompounded = scanner.nextInt();

        System.out.println("For how many years? ");
        years = scanner.nextInt();


        amount = principal * Math.pow((1 + (rate / timeCompounded)), (timeCompounded * years));
        System.out.println("The final amount after " + years + " years is: " + amount);


        scanner.close();

    }
}
