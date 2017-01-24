/*
 * Given an array of n integers where n > 1, nums, 
 * return an array output such that output[i] is 
 * equal to the product of all the elements of nums 
 * except nums[i].

 * Solve it without division and in O(n).
 * 
 * For example, given [1,2,3,4], return [24,12,8,6].
 * 
 * Follow up:
 * Could you solve it with constant space complexity? 
 * (Note: The output array does not count as extra 
 * space for the purpose of space complexity 
 * analysis.)
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSeft(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = i == 0 ? 1 : result[i - 1] * nums[i - 1];
        }
        int product = 1;
        for (int i = 1; i < nums.length; i++) {
            product *= nums[nums.length - i];
            result[nums.length - 1 - i] *= product;
        }
        return result;
    }

}
