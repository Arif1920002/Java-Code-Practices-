public class stringDemo {

    public static void main(String[] args) {

        String name = "SM. Arif Hasan";

        int length = name.length();

        System.out.println("Length of the string: " + length);

        System.out.println("First character: " + name.charAt(0));
        System.out.println("Last character: " + name.charAt(length - 1));
        System.out.println("Second last character: " + name.charAt(length - 2));
        System.out.println("Third last character: " + name.charAt(length - 3));
        System.out.println("Fourth last character: " + name.charAt(length - 4));
        System.out.println("Fifth last character: " + name.charAt(length - 5));
    }
}
