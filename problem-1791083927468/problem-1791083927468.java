// Last updated: 10/4/2026, 8:48:47 AM
1class Solution {
2    public int minRotations(int n, String s) {
3      
4            int t=0;
5            int cr=0;
6            for(int i=0;i<n;i++){
7                int d=s.charAt(i)-'0';
8                int df=Math.abs(d-cr);
9                t+=Math.min(df,10-df);
10                cr=d;
11            }
12            int min=t;
13        for(int k=0;k<n;k++){
14            int a=s.charAt(k)-'0';
15            int b=k==0?0:s.charAt(k-1)-'0';
16            int l=s.charAt(n-1)-'0';
17            int o=Math.abs(a-b);
18            o=Math.min(o,10-o);
19            int ne=Math.abs(l-b);
20            ne=Math.min(ne,10-ne);
21            int ans=t-o+ne;
22            min=Math.min(min,ans);
23        }
24        return min;
25    }
26}