// Last updated: 8/11/2026, 9:55:01 PM

     class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001];

        for (int n : arr) {
            count[n + 1000]++;
        }

        for (int i = 0; i < 2001; i++) {
            if (count[i] == 0) continue;

            for (int j = i + 1; j < 2001; j++) {
                if (count[i] == count[j])
                    return false;
            }
        }

        return true;
    }
}   