// Last updated: 8/14/2026, 12:17:14 PM
1
2class Solution {
3    public String countOfAtoms(String formula) {
4        Deque<Map<String, Integer>> stack = new ArrayDeque<>();
5        stack.push(new HashMap<>());
6        int n = formula.length();
7        for (int i = 0; i < n;) {
8            if (formula.charAt(i) == '(') {
9                stack.push(new HashMap<>());
10                i++;
11            } else if (formula.charAt(i) == ')') {
12                Map<String, Integer> top = stack.pop();
13                i++;
14                int i_start = i;
15                while (i < n && Character.isDigit(formula.charAt(i))) {
16                    i++;
17                }
18                int multiplier = i > i_start ? Integer.parseInt(formula.substring(i_start, i)) : 1;
19                for (String key : top.keySet()) {
20                    stack.peek().put(key, stack.peek().getOrDefault(key, 0) + top.get(key) * multiplier);
21                }
22            } else {
23                int i_start = i;
24                i++;
25                while (i < n && Character.isLowerCase(formula.charAt(i))) {
26                    i++;
27                }
28                String element = formula.substring(i_start, i);
29                i_start = i;
30                while (i < n && Character.isDigit(formula.charAt(i))) {
31                    i++;
32                }
33                int count = i > i_start ? Integer.parseInt(formula.substring(i_start, i)) : 1;
34                stack.peek().put(element, stack.peek().getOrDefault(element, 0) + count);
35            }
36        }
37        Map<String, Integer> counts = stack.peek();
38        List<String> elements = new ArrayList<>(counts.keySet());
39        Collections.sort(elements);
40        StringBuilder result = new StringBuilder();
41        for (String element : elements) {
42            result.append(element);
43            int count = counts.get(element);
44            if (count > 1) {
45                result.append(count);
46            }
47        }
48        return result.toString();
49    }
50}