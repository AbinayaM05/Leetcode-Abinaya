// Last updated: 9/15/2026, 2:30:38 PM
1class Solution {
2    public int sumDistance(int[] nums, String s, int d) {
3        int n = nums.length;
4        long MOD = 1000000007L;
5
6        long[] pos = new long[n];
7
8        for (int i = 0; i < n; i++) {
9            if (s.charAt(i) == 'R') {
10                pos[i] = (long) nums[i] + d;
11            } else {
12                pos[i] = (long) nums[i] - d;
13            }
14        }
15
16        Arrays.sort(pos);
17
18        long ans = 0;
19        long prefix = 0;
20
21        for (int i = 0; i < n; i++) {
22            ans = (ans + pos[i] * i - prefix) % MOD;
23            prefix = (prefix + pos[i]) % MOD;
24        }
25
26        return (int) ans;
27    }
28}