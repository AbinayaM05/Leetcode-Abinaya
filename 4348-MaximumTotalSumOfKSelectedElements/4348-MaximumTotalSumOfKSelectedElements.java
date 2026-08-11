// Last updated: 8/11/2026, 9:51:04 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int n=nums.length;
        int idx=n-1;
        for(int i=0;i<k;i++){
            long x=nums[idx--];
            long curMul=mul-i;
            ans+=Math.max(x,x*curMul);
        }
      return ans;  
    }
}