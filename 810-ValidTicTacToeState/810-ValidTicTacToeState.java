// Last updated: 8/11/2026, 9:57:00 PM
class Solution {
    public boolean validTicTacToe(String[] b) {

        int x = 0, o = 0;

        for (String s : b)
            for (char c : s.toCharArray())
                if (c == 'X') x++;
                else if (c == 'O') o++;

        if (o > x || x - o > 1) return false;

        boolean xw = win(b, 'X'), ow = win(b, 'O');

        return !(xw && ow) && !(xw && x != o + 1) && !(ow && x != o);
    }

    boolean win(String[] b, char p) {
        for (int i = 0; i < 3; i++)
            if (b[i].charAt(0)==p && b[i].charAt(1)==p && b[i].charAt(2)==p) return true;

        for (int j = 0; j < 3; j++)
            if (b[0].charAt(j)==p && b[1].charAt(j)==p && b[2].charAt(j)==p) return true;

        return (b[0].charAt(0)==p && b[1].charAt(1)==p && b[2].charAt(2)==p) ||
               (b[0].charAt(2)==p && b[1].charAt(1)==p && b[2].charAt(0)==p);
    }
}