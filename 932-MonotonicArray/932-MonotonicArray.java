// Last updated: 8/11/2026, 9:56:37 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean up = true;
        boolean down = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                down = false;
            }
            if (nums[i] < nums[i - 1]) {
                up = false;
            }
        }
        return up || down;
    }
}