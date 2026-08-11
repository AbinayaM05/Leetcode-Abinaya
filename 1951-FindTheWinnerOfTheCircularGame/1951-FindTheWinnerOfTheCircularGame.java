// Last updated: 8/11/2026, 9:53:23 PM
class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        while (q.size() > 1) {
            for (int j = 0; j < k - 1; j++) {
                q.add(q.remove());
            }
            q.remove();
        }
        return q.peek();
    }
}