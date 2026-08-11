// Last updated: 8/11/2026, 9:51:51 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while (mainTank > 0) {
            int fuelUsed = Math.min(mainTank, 5);
            distance += fuelUsed * 10;
            mainTank -= fuelUsed;
            if (fuelUsed == 5 && additionalTank > 0) {
                mainTank += 1;
                additionalTank -= 1;
            }
        }
        return distance;
    }
}
