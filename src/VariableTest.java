public class VariableTest {

    /* Variable is a container to store data. They are of 2 types: primitive and non-primitive/reference
    * Primitive variables are of 8 types: byte, short, int, long, char, float, double, boolean
    * Non-primitive variables are of 2 types: String, Array, Object*/

    public static void main(String[] args) {
        int age =21;
        double gpa =3.5;
        float gpaInFloat =3.5f; //To declare float we need to write (f) at the end like this (3.5f)
        char grade ='A'; //For a single character we need to use single quotes
        boolean isEngineer =true; //To declare boolean we need to write (true) or (false)
        String name ="ARIF"; //To declare string we need to use double quotes
        String mail ="testmail123@gmail.com";//String can have numbers or special characters


        System.out.println("My age is " + age);
        System.out.println("My gpa is " + gpa);
        System.out.println("My gpa in float is " + gpaInFloat);
        System.out.println("My grade is " + grade);
        System.out.println("Im an engineer? " + isEngineer);
        System.out.println("My name is " + name);
        System.out.println("My email is " + mail);

        System.out.println("My name is " + name + ", and my age is " + age + ", and gpa is " + gpa + ", and my mail is " + mail);
    }
}