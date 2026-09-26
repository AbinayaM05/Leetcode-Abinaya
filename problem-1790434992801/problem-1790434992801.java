// Last updated: 9/26/2026, 8:33:12 PM
1class Solution {
2    public int longestSubarray(int[] nums, int k) {
3     int n=nums.length;
4        int ans=0;
5        for(int i=0;i<n;i++){
6            long sum=0;
7            boolean[]seen=new boolean[k];
8            for(int j=i;j<n;j++){
9                sum+=nums[j];
10                int value=(int)((2L*nums[j])%k);
11                if(value<0){
12                value+=k;
13            }
14                seen[value]=true;
15                int rem=(int)(sum%k);
16                if(rem<0){
17                rem+=k;
18            }
19                if(rem==0){
20                    ans=Math.max(ans,j-i+1);
21                }
22                if(seen[rem]){
23                    ans=Math.max(ans,j-i+1);
24                }
25            }
26        }
27        return ans;
28    }
29}
30                