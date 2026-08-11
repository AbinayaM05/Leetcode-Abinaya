// Last updated: 8/11/2026, 9:55:19 PM
import java.util.*;
class Solution {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int cost = 0;
        for (int num : arr) {
            while (!stack.isEmpty() && stack.peek() <= num) {
                int mid = stack.pop();
                if (stack.isEmpty()) {
                    cost += mid * num;
                } else {
                    cost += mid * Math.min(stack.peek(), num);
                }
            }
            stack.push(num);
        }
        while (stack.size() > 1) {
            cost += stack.pop() * stack.peek();
        }
        return cost;
    }
}