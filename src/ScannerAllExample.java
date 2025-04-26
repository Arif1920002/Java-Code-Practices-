import java.util.Scanner;

public class ScannerAllExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String Input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Integer Input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Float Input
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();

        // Double Input
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        // Long Input
        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();

        // Short Input
        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort();

        // Byte Input
        System.out.print("Enter a byte value: ");
        byte byteValue = scanner.nextByte();

        // Boolean Input
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = scanner.nextBoolean();

        // Character Input (there's no nextChar(), so we read a String and take first char)
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);

        // Output everything
        System.out.println("\n--- Output ---");
        System.out.println("String: " + str);
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Long: " + longValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("Character: " + charValue);

        scanner.close();
    }
}

/*Data Type | Example Input | Output Example | Short Detail
String | Hello World | String: Hello World | A sequence of characters (words or sentences).
int | 25 | Integer: 25 | Whole number, positive or negative.
float | 3.14 | Float: 3.14 | Decimal number (less precision than double).
double | 123.456789 | Double: 123.456789 | High-precision decimal number.
long | 9876543210 | Long: 9876543210 | Very large whole numbers.
short | 1000 | Short: 1000 | Smaller range integer (-32,768 to 32,767).
byte | 100 | Byte: 100 | Very small integer (-128 to 127).
boolean | true | Boolean: true | Logical value (true or false).
char | A | Character: A | Single character (letter, digit, symbol).*/