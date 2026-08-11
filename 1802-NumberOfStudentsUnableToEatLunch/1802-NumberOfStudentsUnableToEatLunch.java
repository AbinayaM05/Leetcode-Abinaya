// Last updated: 8/11/2026, 9:53:41 PM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = sandwiches.length - 1; i >= 0; i--)
            st.push(sandwiches[i]);
        for (int stud : students)
            q.add(stud);
        int count = 0;
        while (!q.isEmpty() && !st.isEmpty()) {
            if (q.peek() == st.peek()) {
                q.poll();
                st.pop();
                count = 0;
            } else {
                q.add(q.poll());
                count++;
                if (count == q.size())
                    break;
            }
        }
        return q.size();
    }
}