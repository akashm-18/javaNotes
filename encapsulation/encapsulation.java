class Human {
    // We can't access the private variables outside the class;
    private int age;
    private String name;

    // Using the getters methods we can give the data to outside the class
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // using the setters methods we can set the data to the private instance variables;
    // Here, int age is local variable;
    public void setAge(int age) {
        // We mention this.age is to mention that this age is an instance variable;
        // Otherwise name will got confilt;
        // this is an keyword which represents the current object;
        // We can identify which object using the object which is calling this method;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class encapsulation{
    public static void main(String a[]){
        Human obj = new Human();


        obj.setAge(21);
        obj.setName("Akash");

        // We cant access the private member directly;
        // System.out.println(obj.name);  // Gives Error
        int humanAge = obj.getAge();
        String humanName = obj.getName();


        System.out.println(humanAge); // 21
        System.out.println(humanName); // Akash
    }
}