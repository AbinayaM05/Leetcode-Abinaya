// Last updated: 8/11/2026, 9:51:03 PM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
    int mLeft=nums[0];
        int a=Integer.MIN_VALUE;
        for(int j=k;j<nums.length;j++){
            mLeft=Math.max(mLeft,nums[j-k]);
            a=Math.max(a,mLeft+nums[j]);
        }
        return a;
    }
}