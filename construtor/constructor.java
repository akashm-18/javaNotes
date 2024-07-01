class Human {
    int age;
    String name;

    // constructor dpesn't have any return type;
    // same name as the class name;
    // constructor called everytime when an object is created;
    // This is called as parameterized constructor
    public Human(int age, String name) {
        // this represents the object that called the constructor;
        this.age = age;
        this.name = name;
    }

    // We can also use this type of constructor;
    public Human(String name) {
        this.age = 12;
        this.name = name;
    }

    // This is called as the default constructor;
    // Without using the parameters;
    // This is hard assigning to the instance variables;
    // When we doesn't create the default constructor by ourself;
    // Then Java itself creates a constructor for us that is called as the default constructor;
    // But without the data definition (Blank constructor only);
    // public Human() {} // Default constructor created by the Java;
    public Human() {
        age = 36;
        name = "Kohli";
    }
}

public class constructor {
    public static void main(String a[]) {
        // called using the parameterized constructor
        Human obj1 = new Human(21, "Akash");
        // called using the default constructor;
        Human obj2 = new Human();
        // constructor with one parameter
        Human obj3 = new Human("Navin");

        System.out.println(obj1.name + " : " + obj1.age);
        System.out.println(obj2.name + " : " + obj2.age);
        System.out.println(obj3.name + " : " + obj3.age);
    }
}