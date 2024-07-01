// Casting is explicityly type converting
// Conversion is automatic conversion

class Type {
    public static void main(String[] args) {
        byte b = 127;
        int a = 257;
        // byte range -> 256
        // 257 % 256 = 1

        // b = a; // Cannot comvert into byte // Because the byte has range.
        b = (byte) a; // Now the a is converted into byte.But the value is changed according to its
                      // range

        System.out.println(b); // output is 1.

        byte c = 10;
        byte d = 30;

        int result = c * d; // Type Promotion . Because two byte variables is promoted into int.
        System.out.println(result); // We can do this.
    }
}