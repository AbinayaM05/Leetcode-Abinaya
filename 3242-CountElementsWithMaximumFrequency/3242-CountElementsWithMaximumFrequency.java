// Last updated: 8/11/2026, 9:51:34 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {

        int[] a = new int[101];

        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
        }

        int max = 0;

        for (int i = 0; i < 101; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        int sum = 0;

        for (int i = 0; i < 101; i++) {
            if (a[i] == max) {
                sum = sum + a[i];
            }
        }

        return sum;
    }
}