/*
 * Given an array of integers and an integer k, return true if and 
 * only if there are two distinct indices i and j in the array such 
 * that nums[i] = nums[j] and the difference between i and j is at 
 * most k.
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], i);
            else if (i - map.get(nums[i]) <= k)
                return true;
        }
        return false;
    }

}
