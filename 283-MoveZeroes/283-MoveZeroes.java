// Last updated: 8/11/2026, 10:03:38 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0; 
        for (int j = 0; j < n; j++) {
            int num = nums[j];
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i < n) {
            nums[i] = 0;
            i++;
        }
    }
}
