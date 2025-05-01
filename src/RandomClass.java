import java.util.Random;


public class RandomClass {

    public static void main(String[] args) {

        Random random = new Random();

        int number;
        double number2;
        boolean isHeads;

        number = random.nextInt(1, 7);
        System.out.println(number);

        number2 = random.nextDouble(1.1, 10.1);
        System.out.println(number2);

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

    }
}
