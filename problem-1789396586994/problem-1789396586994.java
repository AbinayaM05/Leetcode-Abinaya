// Last updated: 9/14/2026, 8:06:26 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        int n = s.length();
4        String res = "";
5
6        for(int i = 0;i<n;i++){
7            int st = i,end = i;
8            while(st>=0&&end<n&&s.charAt(st)==s.charAt(end)){
9                st--;
10                end++;
11            }
12            String temp = s.substring(st+1,end);
13            if(temp.length()>res.length())res=temp;
14            st = i;
15            end = i+1;
16            while(st>=0&&end<n&&s.charAt(st)==s.charAt(end)){
17                st--;
18                end++;
19            }
20            temp = s.substring(st+1,end);
21            if(temp.length()>res.length())res=temp;
22        }
23
24        return res;
25    }
26}