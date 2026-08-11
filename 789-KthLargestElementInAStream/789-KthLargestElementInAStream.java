// Last updated: 8/11/2026, 9:57:12 PM
import java.util.*;

class KthLargest {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;

        for (int ele : nums) {
            if (pq.size() < k) {
                pq.add(ele);
            } else if (ele > pq.peek()) {
                pq.poll();
                pq.add(ele);   // corrected
            }
        }
    }

    public int add(int val) {
        if (pq.size() < k) {
            pq.add(val);
        } else if (val > pq.peek()) {
            pq.poll();
            pq.add(val);
        }

        return pq.peek();
    }
}