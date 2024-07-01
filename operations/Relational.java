package operations;

public class Relational {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int a = 2;
        int b = 4;

        boolean res = num1 > num2 && a < b;
        boolean res1 = num1 > num2 || a < b;

        boolean result = num1 > num2;
        System.out.println(result); // false
        System.out.println(res);
        System.out.println(!res1);
    }
}
