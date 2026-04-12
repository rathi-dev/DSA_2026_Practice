import java.util.Arrays;

public class findMaxConsecutiveOnes {
	
    public static int findMaxConsecutiveOnes(int[] nums) {

    	int count = 0;
    	int maxCount = 0;
    	for(int num : nums) {
    		if(num == 1) {
    			count++;
    			maxCount = Math.max(count, maxCount);
    		}
    		if(num == 0) {
    			count = 0;
    		}
    	}
    	return maxCount;
    }
    
    public static void main(String args[]) {
     int [] nums = {1, 0, 1, 1, 0, 1};
    	System.out.println(findMaxConsecutiveOnes(nums));
    }
}