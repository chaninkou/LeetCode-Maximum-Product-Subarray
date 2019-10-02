package maximumSubarray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {-2,3,-4};
		
		System.out.println("Nums: " + Arrays.toString(nums));
		
		FindMaximumProductSubarrayFunction solution = new FindMaximumProductSubarrayFunction();
		
		System.out.println("Maximum Product Subarray: " + solution.maxProduct(nums)); 
		
	}
}
