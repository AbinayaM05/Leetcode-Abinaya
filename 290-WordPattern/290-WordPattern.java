// Last updated: 8/11/2026, 10:03:41 PM
class Solution {
    public boolean wordPattern(String p, String s) {
        String[] a = s.split(" ");
        if (p.length() != a.length) return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            if (!map.containsKey(p.charAt(i))) {
                if (map.containsValue(a[i])) return false;
                map.put(p.charAt(i), a[i]);
            } else if (!map.get(p.charAt(i)).equals(a[i])) {
                return false;
            }
        }

        return true;
    }
}