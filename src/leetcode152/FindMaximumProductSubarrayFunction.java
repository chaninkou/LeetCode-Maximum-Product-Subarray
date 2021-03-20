package leetcode152;

public class FindMaximumProductSubarrayFunction {
    public int maxProduct(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        
        // Start from index 0 as placeholder
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int maxResult = nums[0];
        
        // With index 0 as max, go through the end of the array
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= 0){
                // Get the current maximum product
                maxProduct = Math.max(maxProduct * nums[i], nums[i]);
                
                // Keep track of the min product too in case if both negative cancel out
                minProduct = Math.min(minProduct * nums[i], nums[i]);
            } else { // If the value is negative, we gotta multiply the min product to the negative since two negative will become positive
                int temp = maxProduct;
                
                // We multiply the min product (-) * (-) will become positive
                maxProduct = Math.max(minProduct * nums[i], nums[i]);
                
                // No matter what, the min will be maxProduct times (-) since negative is smaller than positive.
                minProduct = Math.min(temp * nums[i], nums[i]);
            }
            
            // Always compare the result since the else statement might be bigger than previous maxResult
            maxResult = Math.max(maxResult, maxProduct);
        }
        
        return maxResult;
	}
}
