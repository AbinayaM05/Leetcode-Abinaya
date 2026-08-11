// Last updated: 8/11/2026, 10:02:41 PM
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int n : nums) {
            set.add(n);
            if (set.size() > 3)
                set.pollFirst();
        }

        if (set.size() == 3)
            return set.first();

        return set.last();
    }
}