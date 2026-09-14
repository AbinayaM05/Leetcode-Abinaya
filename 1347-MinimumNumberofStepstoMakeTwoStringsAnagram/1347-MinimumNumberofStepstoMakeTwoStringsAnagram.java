// Last updated: 9/14/2026, 8:11:29 PM
1class Solution {
2    public int minSteps(String s, String t) {
3         int[] carr = new int[26]; 
4        for (int i = 0;i<s.length();i++) {
5            carr[s.charAt(i) - 'a']++;
6        }
7        for (int i = 0;i<t.length();i++) {
8            carr[t.charAt(i) - 'a']--;
9        }
10        int steps = 0;
11        for (int c:carr) {
12            if (c > 0) {
13                steps += c;
14            }
15        }
16        return steps;
17    }
18}