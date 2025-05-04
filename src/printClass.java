public class printClass {
    public static void main(String[] args) {
        //printf can be used instead of println, just like in C

        System.out.printf("Hello %s!%n", "World");

        String name = "Arif";
        int age = 21;
        double salary = 2000.50;
        char grade = 'A';
        boolean isStudent = true;
        float gpa = 3.5f; // without the (f) it will be double by default, writing f is a better practice

        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Salary: %f\n", salary);
        System.out.printf("Grade: %c\n", grade);
        System.out.printf("Is Student: %b\n", isStudent);
        System.out.printf("GPA: %f\n", gpa);


        System.out.printf("I'm %s, %d years old. Currently i'm a Student with gpa %.2f and grade %c. I do a part time and my salary is %.2f $", name, age, gpa, grade, salary);


    }
}
