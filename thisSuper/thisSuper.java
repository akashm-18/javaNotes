// Every constructor in Java have the Super method default;
// Every class in java extends the Object class
class A extends Object{
    String name;
    int age;

    public A(String name, int age) {
    super();
    this.name = name;
    this.age = age;
    }
    
    // Default constructot;
    public A(){
        super();
    }
}

class B extends A {
    int birthYear;

    public B() {
    // This super method calls the superclass A's default constructor;
    // Because, this have no parameters;
    super();
    System.out.println("Default constructor...");
    }

    public B(String name, int age, int birthYear) {
    // This calls the superclass A's parameterized constructor;
    // Because, it has the parameters;
    super(name, age);
    this.birthYear = birthYear;
    }
}


public class thisSuper{
    public static void main(String a[]){

    A obj1 = new A("Akash", 21);
    // When we create an object using the B(Which is subClass here);
    // This will load subClass(B) as well as the superClass(A);(Call the constructor of both A(superclass) and B(subclass))
    // When we create object using the parameterized constructor;
    // Then it will only call the parameterized constructor in B only (sub-class) and only default constructor in A(Super class);
    // When we call using the no params. then, it only calls the default constructor in B and all constructor in A.
    B obj2 = new B("Kohli", 36, 1987);

    System.out.println(obj1.name + " : " + obj1.age);
    System.out.println(obj2.name + " : " + obj2.age + " : " + obj2.birthYear);

    }
}