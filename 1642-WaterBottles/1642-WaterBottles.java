// Last updated: 8/11/2026, 9:54:03 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int t = numBottles; 
        int e = numBottles;      
        while (e >= numExchange) {
            int n = e / numExchange;
            t += n;                 
            e = e % numExchange + n; 
        }
        return t;
    }
}
