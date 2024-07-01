class Calculator {
    // Method Overloading concept 
    // same method name with different no.of parameters
    // same method name with different datatypes.

    int num = 10; // Instance variale.

    // For Two parameters
    public int add(int num1 , int num2) {
        // We can use the instance variable here.
        System.out.println(num); 
        int result = num1 + num2;
        return result;
    }

    // For Three parameters
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // For Different datatypes parameters
    public double add(double num1 , int num2){
        // double + int => returns double value
        return num1 + num2;
    }
}


public class overloading{
    public static void main(String a[]) {
        int value = 33;
        // Here obj is not a variable in Java
        // It is a Reference variable in Java
        Calculator obj = new Calculator(); // New Address in Heap.
        Calculator obj1 = new Calculator(); // New Address in Heap.

        obj.num = 20;
        System.out.println(obj.num); // Prints 20; Because it value changes in above line
        System.out.println(obj1.num);   // Prints 10; Because the obj changes num value for its object only
        // They both have different memory Address.
        // So, obj impact doesnot affect the obj1 num. 

        int result = obj.add(3,6);

        System.out.println(obj.add(2,4,6));
        System.out.println(result);
    }
}