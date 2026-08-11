// Last updated: 8/11/2026, 9:56:13 PM
import java.util.*;

class Solution {
    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (a, b) -> {
            String[] A = a.split(" ", 2);
            String[] B = b.split(" ", 2);

            boolean isDigitA = Character.isDigit(A[1].charAt(0));
            boolean isDigitB = Character.isDigit(B[1].charAt(0));

            if (!isDigitA && !isDigitB) {
                int cmp = A[1].compareTo(B[1]);
                if (cmp == 0) return A[0].compareTo(B[0]);
                return cmp;
            }

            if (!isDigitA) return -1;
            if (!isDigitB) return 1;

            return 0;
        });

        return logs;
    }
}