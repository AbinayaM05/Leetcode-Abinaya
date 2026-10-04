// Last updated: 10/4/2026, 9:16:37 AM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        long a=nums[0];
4        long b=Long.MIN_VALUE/4;
5        long c=Long.MIN_VALUE/4;
6        long d=Long.MIN_VALUE/4;
7        long an=nums[0];
8        for(int i=1;i<nums.length;i++){
9            long x=nums[i];
10            long na=Math.max(x,b+x);
11            long nb=a-x;
12            long nc=Math.max(a,d+x);
13            long nd=Math.max(b,c-x);
14            a=na;
15            b=nb;
16            c=nc;
17            d=nd;
18            an=Math.max(an,Math.max(Math.max(a,b),Math.max(c,d)));
19        }
20        return an;
21    }
22}