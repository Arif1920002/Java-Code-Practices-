public class mathClass {

    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result1;
        double result2;
        double result3;
        double result4;
        double result5;
        double result6;
        double result7;
        double result8;


        result1 = Math.pow(2, 3); //2^3 = 8
        System.out.println("pow of 2 ^ 3 is " + result1);

        result2 = Math.sqrt(9); //square root of 9
        System.out.println("root of 9 is " + result2);

        result3 = Math.abs(-5); //absolute value of -5
        System.out.println("absolute value of -5 is " + result3);

        result4 = Math.ceil(6.2); //rounds up to next integer
        System.out.println("ceil of 6.2 is " + result4);

        result5 = Math.floor(6.2); //rounds down to next integer
        System.out.println("floor of 6.2 is " + result5);

        result6 = Math.round(6.4); //rounds to nearest integer
        System.out.println("round of 6.4 is " + result6);

        result7 = Math.max(10, 20); //returns the largest number
        System.out.println("max of 10 and 20 is " + result7);

        result8 = Math.min(10, 20); //returns the smallest number
        System.out.println("min of 10 and 20 is " + result8);

    }
}
