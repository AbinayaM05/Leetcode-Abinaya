// Last updated: 8/11/2026, 9:52:58 PM
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;

        for (String a : words1) {
            int c1 = 0, c2 = 0;

            for (String b : words1)
                if (a.equals(b))
                    c1++;

            for (String b : words2)
                if (a.equals(b))
                    c2++;

            if (c1 == 1 && c2 == 1)
                count++;
        }

        return count;
    }
}