public class arithmeticOperation {

    public static void main(String[] args) {

        //Arithmetic Operation

        int x = 10;
        int y = 3;

        /*z = x + y;
        z = x - y;
        z = x * y;
        z = x / y;
        z = x % y;*/



        //Augmented Assignment Operator

        int a = 20;
        int b = 5;

       /* a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b; */

        //Increment and Decrement Operator

        int c = 10;

       /* c++;
        c--;
        ++c;
        --c; */

        //Logical Operator

        int d = 10;
        int e = 20;

        /* boolean f = d < e;
        boolean g = d > e;
        boolean h = d <= e;
        boolean i = d >= e;
        boolean j = d == e;
        boolean k = d != e; */

        //Order of Operations [PEMDAS]
        /* P=Parentheses(), E=Exponent (to the power of), M=Multiplication (*), D=Division (/), A=Addition (+), S=Subtraction (-)   */

        int result;

        // Example expression: (3 + 5) * 2 - 4 / 2
        result = (3 + 5) * 2 - 4 / 2; // This follows PEMDAS

        System.out.println("The result of the expression (3 + 5) * 2 - 4 / 2 is: " + result);


        /*Parentheses: Calculate 3 + 5 first, which equals 8.
        Multiplication: Multiply 8 * 2, resulting in 16.
        Division: Calculate 4 / 2, which equals 2.
        Subtraction: Finally, subtract 2 from 16, giving a final result of 14.*/


    }
}
