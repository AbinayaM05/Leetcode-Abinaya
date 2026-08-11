// Last updated: 8/11/2026, 9:55:06 PM
import java.time.LocalDate;
class Solution {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
}