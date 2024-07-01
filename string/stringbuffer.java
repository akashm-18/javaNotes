public class stringbuffer{
    public static void main(String a[]){
        // StringBuffer always gives us 16 bytes extra for continuous allocation of data;
        // Inititally we have 16 bytes in capacity.
        // When we give an value, it takes the length of the variable then adds the length with the 16 bytes.To give new length
        // (string length + 16)bytes  => Giving extra buffer(16 bytes)
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        sb.append("Hardik...");
        // Converting the string buffer into the string;
        String name = sb.toString();
        sb.deleteCharAt(1);
        sb.setLength(30);
        sb.insert(0 , "cricket! ");
        System.out.println(name);
        System.out.println(sb);
        System.out.println(sb.capacity());
        StringBuffer sb1 = new StringBuffer("Akash"); // (5 + 16) bytes;
    }
}