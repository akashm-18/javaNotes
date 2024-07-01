
class Mobile {
    String brand;
    int price;
    // By using the static keyword we make variable as class member not as object member;
    static String name;

    // In non-static methods we can use the static variables there is no harm in it;
    public void show() {
        System.out.println(brand + " : " + name);
    }

    // Static method is only accessed by using the class
    // We can't use non-static variables here;
    // We can access the static variables by creating the static method.
    public static void show2() {
        System.out.println(Mobile.name);
    }

    // static method
    // Belongs to class not instance of class
    // called without creating instance of class can access the static variables directly.But not instance variables;
    // You need to pass instance of class to the static method to access the instance variables.
    // we need to give which object we are referring here;(here obj);
    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price);
    }

}


public class static1{
    // Here we mention this main method with static keyword;
    // Because if we don't mark as static, then we need to create object for the class static1.
    // But, main method is the starting point.So, we give static in the main method;
    public static void main(String a[]) {
        // static variable is shared as common for all the objects.
        // If we change one then it affects all objects.
        // In the heap, they have the name as common property for both objects with different address;

        // static value only accessed using the Class name itself only. Avoid it if u are using the object name to refer it; 
        // By using the static variables we are saving memory;

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1200;
        // Use class name to refer the static variables
        Mobile.name = "smartphone1";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1100;
        //Use class name to refer the static variables
        Mobile.name = "smartphone2";

        // Both have the same name because, the name property have the static keyword
        // The lastly assigned value is given to both the objects;
        obj1.show(); // Apple : smartphone2
        obj2.show(); // Apple : smartphone2

        // If i change value for one object it affects the other value;
        obj2.name = "newphone";
        // We need to use class name for static variables
        // Avoid writing code as above line
        Mobile.name = "newphone33";

        // Now both have the name as "new phone";
        obj1.show();
        obj2.show();

        // calling the static method using the class name
        Mobile.show1(obj1);
        Mobile.show1(obj2);

        Mobile.show2();
    }
}