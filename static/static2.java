// Class only loads one time;
// class loads => static block loads => object instantited(object created);
class Mobile {
    String brand;
    int price;
    // Static should be initialized only once(When the class created only)(Not when the object created)
    static String name;

    // We can initialize static variables here;
    // Only inititalize once when the class is created;
    // This block is quickly exceuted after the class is created;
    static {
        name = "phone";
        System.out.println("Static block");
    }


    // Constructor
    // This will initialize the object created by this class
    public Mobile () {
        brand = "";
        price = 200;
        // But this is static variable // We dont need to put here;
        // name = "phone";
    }

}


public class static2 {
    public static void main(String a[]) throws ClassNotFoundException {
        // When we doesn't create the object then, class is not executed then static block not executed;
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 12000;
        Mobile.name = "smartphone";

        // If you want to execute class without creating the objects 
        // We can use this ; This will not create object; Only executes Class.
        Class.forName("Mobile");
    }
}