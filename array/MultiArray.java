public class MultiArray{
    public static void main(String a[]){

        int nums[][] = new int[3][4];

        // Assigning Random value to the Multi-dimensional Array
        for(int i=0; i<=2; i++){
            for(int j=0; j<=3; j++) {
                // Random value is from 0.0 to 1.0
                // 0.0 is inclusive
                // 1.0 is Exclusive (0.9 is final)
                nums[i][j] = (int) (Math.random() * 10);
                // System.out.println(nums[i][j]);
            }
        }

        for(int i=0; i<=2; i++){
            for(int j=0; j<=3; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // Enchanced For loop
        // for(single array : total array)
        for(int n[] : nums){
            // for(value in i'th array : i'th array)
            for(int m : n){
                System.out.print(m + " "); // Got the same output;
            }
            System.out.println();
        }

    }
}