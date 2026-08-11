// Last updated: 8/11/2026, 10:07:28 PM
import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for (String s : path.split("/")) {
            if (s.equals("") || s.equals(".")) 
            continue;
            if (s.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(s);
            }
        }
        String ans = "";
        for (String s : st) {
            ans += "/" + s;
        }
        return ans.equals("") ? "/" : ans;
    }
}