// Last updated: 8/11/2026, 10:06:00 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums); 
        return nums[nums.length / 2]; 
    }
}
