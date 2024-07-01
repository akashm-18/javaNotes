public class string{
    public static void main(String a[]){
        // Basically String is an Class.
        // So if we need to use class. Then we need to use the new Keyword.
        String name = new String();
        // Both string creation is same.We can do any of it.
        // It will create object in behind the scene.
        // String name = "Akash";
        System.out.println(name);  // Doesn't print anything;
        // When we create name with type String .
        // name created in stack with the memory address of the object created in heap using the String class.
        // "Akash" is created in the heap. Then with help of the memory address stack prints the name;
        name = "Akash";
        System.out.println(name); // Takes the name using the memory address and gives the name;
        System.out.println(name.hashCode()); // Do some calculations and given to us.

        // We can only use add operater in the string.
        System.out.println("Hello " + name);
        System.out.println(name.charAt(1)); // Need to give index in the method brackets.
        System.out.println(name.concat(" Full Stack Developer"));

        // Here we are creating two string variables;
        // We think it will create two different objects with different reference.
        // But, here not the case. // They create s1 , s2 in stack with same reference. Because, of same String.
        String s1 = "Akash";
        String s2 = "Akash";
        // Here we got same memory address.
        System.out.println(s1.hashCode()); // 63313388
        System.out.println(s2.hashCode()); // 63313388
        System.out.println(s1 == s2);      // True
        // This happens because in jvm inside the heap.
        // We have String constant Pool(Special Area for the string).
        // So, they are with the same string value.Then they have the same memory address.
        // String constant pool checks for the string while creating the string.
        // If there is any same string, then it doesn't create. Combines with it. So, they have the same memory address.  
    }
}