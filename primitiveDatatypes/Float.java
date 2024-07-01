public class Float {
    public static void main(String[] args) {
        // float , double
        // float = 4 bytes
        // double = 8 bytes
        // Double is the default one in java
        // Because , double has more precision. Ex: 12.587134
        double num1 = 10.5; // It is ok.
        float num2 = 12.6f; // Here we need to tell java this is float value by adding f at last.Because
                            // double is default
        System.out.println(num1);
        System.out.println(num2);
    }
}
