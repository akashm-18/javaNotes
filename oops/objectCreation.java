/**
 * Calculator class
 */
class Calculator {
    public int add(int num1,int num2) {
        int r = num1 + num2;
        return r;
    }
}

public class objectCreation {
    public static void main(String[] args) {
        // How to create an object
        // Object is the instance of the class
        int a = 6;
        int b = 6;
        // Creation of object.
        // Class name / reference variable name / new keyword / class name.
        // JVM creates the object for us using the class (blueprint)
        Calculator calc = new Calculator();
        int result = calc.add(a,b);
        System.out.println(result);
    }
}
