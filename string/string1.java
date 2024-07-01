public class string1 {
    public static void main(String a[]){
        String name = "Akash";
        name = name + "M";
        // Stored in string constant pool
        // not any variable is modified in the string constant pool
        // We can't delete anyone
        // Here when we create name, it created in new memory address
        // But, when we modify it, it doesn't affect the previous one
        // It will create new value in the string constant pool with new memory address.
        // Then the name in the stack will link to the new memory address in the heap.
        // The previous name is collected by the garbage collector for freeing the space;
        // two types -> Mutable and Inmutable string
        // By default strings are immutable.(We can't change);
        // If you want an mutable string then use string buffer or string builder(Both are similar but have one different);
    }
}