// Last updated: 9/14/2026, 8:49:51 PM
1class Solution {
2    public String countAndSay(int n) {
3        String current = "1";
4
5        for (int iteration = 2; iteration <= n; iteration++) {
6            StringBuilder next = new StringBuilder();
7
8            int i = 0;
9
10            while (i < current.length()) {
11                char digit = current.charAt(i);
12                int count = 0;
13
14            
15                while (i < current.length() && current.charAt(i) == digit) {
16                    count++;
17                    i++;
18                }
19
20               
21                next.append(count);
22                next.append(digit);
23            }
24
25            current = next.toString();
26        }
27
28        return current;
29    }
30}