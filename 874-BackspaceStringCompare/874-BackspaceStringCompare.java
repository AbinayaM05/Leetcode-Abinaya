// Last updated: 8/11/2026, 9:56:49 PM
import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (!s1.isEmpty()) s1.pop();
            } else {
                s1.push(c);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '#') {
                if (!s2.isEmpty()) s2.pop();
            } else {
                s2.push(c);
            }
        }
        return s1.toString().equals(s2.toString());
    }
}