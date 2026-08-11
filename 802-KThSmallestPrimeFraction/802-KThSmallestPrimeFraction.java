// Last updated: 8/11/2026, 9:57:07 PM
import java.util.*;
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<double[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                list.add(new double[]{(double) arr[i] / arr[j], arr[i], arr[j]});
            }
        }
        Collections.sort(list, (a, b) -> Double.compare(a[0], b[0]));
        double[] ans = list.get(k - 1);
        return new int[]{(int) ans[1], (int) ans[2]};
    }
}