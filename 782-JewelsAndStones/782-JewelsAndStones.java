// Last updated: 8/11/2026, 9:57:24 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1)
                count++;
        }

        return count;
    }
}