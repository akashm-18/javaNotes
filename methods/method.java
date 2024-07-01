class Computer {
    // Define the behaviour of class
    public void playMusic() {
        // Return type is void . We can do some operations
        // But , not return anything
        System.out.println("Music Playing...");
    }

    public String givePen(int cost){
        // We need to return value with the type of String
        // Here return type is String
        if(cost >= 10) {
            return "Pen";
        }else {
            return "We dont have any pen under Rs.10!";
        }
    }
}


// We need to specify the name of the class as the same name of the file name 
// Outerwise , We getting error in out code . Not sure about it.But i am getting Error.
public class method {
    public static void main(String a[]) {
        // Creating the object to access the above methods
        Computer obj = new Computer();
        obj.playMusic(); // Music Playing...
        String str = obj.givePen(5);
        System.out.println(str); // Pen
    }
}