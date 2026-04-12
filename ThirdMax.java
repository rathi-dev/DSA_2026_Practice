import java.util.Arrays;

public class ThirdMax {
    public static int thirdMax(int[] nums) {

    	   Arrays.sort(nums);
           int count = 1;
           // Walk backward from the largest element
           for (int i = nums.length - 2; i >= 0; i--) {
               if (nums[i] != nums[i + 1]) {
                   count++;
               }
               if (count == 3) {
                   return nums[i];
               }
           }
           // Fewer than 3 distinct values, return the maximum
           return nums[nums.length - 1];
    }
    
    public static void main(String args[]) {
     int [] nums = {2, 3, 4, 6, 2 };
    	System.out.println(thirdMax(nums));
    }
}