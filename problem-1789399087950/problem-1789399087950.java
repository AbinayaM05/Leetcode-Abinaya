// Last updated: 9/14/2026, 8:48:07 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4
5        for (int i = 0; i < word.length(); i++) {
6            char ch = word.charAt(i);
7            freq[ch - 'a']++;
8        }
9
10        Arrays.sort(freq);
11
12        int count = 0;
13        int div = 1;
14        int j = 0;
15
16        for (int i = freq.length - 1; i >= 0; i--) {
17            div = j / 8 + 1;
18            count += freq[i] * div;
19            j++;
20        }
21
22        return count;
23    }
24}