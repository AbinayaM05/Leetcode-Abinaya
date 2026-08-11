// Last updated: 8/11/2026, 9:56:30 PM
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10001];
        for (int x : deck)
            count[x]++;
        int g = 0;
        for (int x : count)
            if (x > 0)
                g = gcd(g, x);
        return g > 1;
    }
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}