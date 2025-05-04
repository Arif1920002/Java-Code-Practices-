import java.util.Scanner;


public class simpleGeometry {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Area of a triangle = 0.5 * base * height
        // Area of a rectangle = length * width
        // Area of a circle = π * radius^2
        // Area of a square = side * side
        // Area of a cylinder = (2 * π * radius * height) + (2 * π * radius^2)


        //triangle
        System.out.println("For triangle");

        double height, base, triangleArea;
        System.out.println("Enter height: ");
        height = scanner.nextDouble();
        System.out.println("Enter base: ");
        base = scanner.nextDouble();

        triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle: " + triangleArea);
        System.out.println();


        //rectangle
        System.out.println("For rectangle");

        double length, width, rectangleArea;
        System.out.println("Enter length: ");
        length = scanner.nextDouble();
        System.out.println("Enter width: ");
        width = scanner.nextDouble();

        rectangleArea = 0.5 * length * width;
        System.out.println("Area of the rectangle: " + rectangleArea);

        scanner.close();
    }
}
