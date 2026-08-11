// Last updated: 8/11/2026, 9:50:57 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middle=nums[nums.length/2];
        int c=0;
        for(int num:nums){
            if(num==middle){
                c++;
            }
        }
        return c==1;
    }
}