package operations;

public class Conditional {
    public static void main(String[] args) {
        int x = 10;

        if (x > 12) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        int a = 20;
        int b = 40;

        if (a > b)
            System.out.println("A is Greater than b");
        else if (b > a) {
            System.out.println("B is Greater than A");
            System.out.println("Thank you");
        } else
            System.out.println("Both are Equal");
    }
}
