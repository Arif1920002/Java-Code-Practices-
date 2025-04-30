import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {

        Random random = new Random();

        int number;
        double number2;

        number = random.nextInt(1, 7);
        System.out.println(number);

        number2 = random.nextDouble(1.1, 10.1);
        System.out.println(number2);

    }
}
