// Last updated: 8/11/2026, 9:52:34 PM
class Solution {
    public int passThePillow(int n, int time) {
        int i = 1,d = 1;
  while (time > 0) {
    i += d;
    if (i == n || i == 1) 
    d *= -1;
    time--;
  }
      return i;
    }
}
