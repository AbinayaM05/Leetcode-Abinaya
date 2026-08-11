// Last updated: 8/11/2026, 9:51:39 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1)
                ans.add(i);
        }

        return ans;
    }
}