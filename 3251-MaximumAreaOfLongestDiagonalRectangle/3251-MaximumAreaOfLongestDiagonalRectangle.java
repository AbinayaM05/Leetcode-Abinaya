// Last updated: 8/11/2026, 9:51:32 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0, d = 0;

        for (int[] a : dimensions) {
            int x = a[0], y = a[1];
            int dia = x * x + y * y;

            if (dia > d || (dia == d && x * y > area)) {
                d = dia;
                area = x * y;
            }
        }

        return area;
    }
}