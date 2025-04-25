public class userInput {

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name = System.console().readLine();
        System.out.println("Hello " + name);
    }
}
