public class Jagged{
    public static void main(String a[]){
        // If we need different number of elements in the inner arrays
        // Then use the Jagged Array
        // We have different sizes of Array in an bigger Array itself;
        int nums[][] = new int[3][]; // Jagged Array;

        nums[0] = new int[3];
        nums[1] = new int[5];
        nums[2] = new int[2];

        // How to Assign value for that Jagged Array
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // How to print that Jagged Array
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // Using the Enchanced for loop is same as for the Normal Array
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}