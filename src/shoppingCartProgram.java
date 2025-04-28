import java.util.Scanner;

public class shoppingCartProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency;
        double total;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine(); //next() only reads one word, doesn't consume new line, nextLine() reads one line, consumes new line.

        System.out.print("Select quantity: ");
        quantity = scanner.nextInt();

        System.out.print("Price per item: ");
        price = scanner.nextDouble();

        System.out.print("Select currency: ");
        currency = scanner.next().charAt(0);

        total = price * quantity;

        System.out.println("You have brought " + quantity + " " + item + " for " + total + " " + currency);


        scanner.close();

    }
}
