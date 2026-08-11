// Last updated: 8/11/2026, 10:06:13 PM
import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String ch : tokens) {
            if (ch.equals("+") || ch.equals("-") ||
                ch.equals("*") || ch.equals("/")) {
                int b = s.pop();
                int a = s.pop();
                if (ch.equals("+")) s.push(a + b);
                if (ch.equals("-")) s.push(a - b);
                if (ch.equals("*")) s.push(a * b);
                if (ch.equals("/")) s.push(a / b);
            } else {
                s.push(Integer.parseInt(ch));
            }
        }
        return s.pop();
    }
}