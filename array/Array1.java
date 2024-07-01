public class Array1{
    public static void main(String a[]){
        // int nums[] = {2,4,6};
        // nums[1] = 10;

        // Another way of creating Array
        int nums[] = new int[4]; // Defaultly All values are zero(o); // We can set the values in the array.
        // Index always starts from the zero.
        nums[0] = 7;
        nums[1] = 33;
        nums[2] = 45;
        nums[3] = 18;

        // we can't print total array by default.
        // We need to loop then print the array.
        for(int i = 0; i<4; i++) {
            System.out.println("Array Value at index " + i + " is " + nums[i]);
        };

        // Enhanced For Loop;
        // Simple than using the For loop
        // We don't get Exception Error by any chances.(Index out of bound Error) Runtime Error.
        for(int n : nums) {
            System.out.println(n);
        }

    };
};