// Last updated: 8/14/2026, 12:03:29 PM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> stack = new Stack<>();
4        int res = 0;
5        int curr = 0;
6        int sign = 1;
7        for (char c : s.toCharArray()) {
8            if (Character.isDigit(c)) {
9                curr = curr * 10 + (c - '0');
10            }
11            else if (c == '+') {
12                res += curr * sign;
13                sign = 1;
14                curr = 0;
15            }
16            else if (c == '-') {
17                res += curr * sign;
18                sign = -1;
19                curr = 0;
20            }
21            else if (c == '(') {
22                stack.push(res);  
23                stack.push(sign); 
24                res = 0;
25                sign = 1;
26                curr = 0;
27            }
28            else if (c == ')') {
29                res += curr * sign;
30                curr = 0;
31                res *= stack.pop();
32                res += stack.pop();
33            }
34        }
35        res += curr * sign;
36        return res;
37    }
38}