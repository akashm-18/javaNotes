public class Length{
    public static void main(String a[]){
        int nums[] = new int[6];
        nums[0] = 4;
        nums[1] = 6;
        nums[2] = 3;
        nums[3] = 9;

        for(int i=0; i<6; i++) {
            System.out.println(nums[i]); // This will print extra zeros for remaining values.
        }

        for(int i=0; i<7; i++){
            // Index out of bound. // The size of the nums is 6 only. So got Error.
            // System.out.println(nums[i]); // Gives Exception // Exception is Runtime Error.
        }

        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);  // Adds zero at the end.(To match its length)
        }

    }
}