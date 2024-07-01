package operations;

public class Hello {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 10;
        int add = num1 + num2;
        int sub = num1 - num2;
        int div = num2 / num1;
        int mul = num1 * num2;
        num1++;
        num2 = num2 + 1;
        num2 += 1;
        System.out.println(add);

        int val = 10;
        int result = val++; // o/p => 10, // Initially fetchs the value then only increments
        // So , result contains the val = 10; // This is called as post increment
        result = ++val; // Here pre-increment // While fetching we have ++ as prefix .
        // So , it increments then only gives the val to result
        System.out.println(result);
    }
}
