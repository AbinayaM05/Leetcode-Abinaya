// Last updated: 9/14/2026, 7:42:04 PM
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        List<List<Integer>> ans = new ArrayList<>();
4        HashMap<Integer, Integer> hm = new HashMap<>();
5
6        for (int i = 0; i < matches.length; i++) {
7            hm.put(matches[i][1], hm.getOrDefault(matches[i][1], 0) + 1);
8            hm.put(matches[i][0], hm.getOrDefault(matches[i][0], 0));
9        }
10
11        ans.add(new ArrayList<>());
12        ans.add(new ArrayList<>());
13
14        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
15            if (entry.getValue() == 0)
16                ans.get(0).add(entry.getKey());
17            else if (entry.getValue() == 1)
18                ans.get(1).add(entry.getKey());
19        }
20
21        Collections.sort(ans.get(0));
22        Collections.sort(ans.get(1));
23
24        return ans;
25    }
26}