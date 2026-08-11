// Last updated: 8/11/2026, 9:56:38 PM
class Solution {

    int[] a;
    int sum = 0;

    public Solution(int[] w) {
        a = w;
        for (int n : w)
            sum += n;
    }

    public int pickIndex() {
        int r = (int)(Math.random() * sum) + 1;

        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
            if (r <= s)
                return i;
        }

        return 0;
    }
}