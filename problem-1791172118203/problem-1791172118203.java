// Last updated: 10/5/2026, 9:18:38 AM
1class Solution {
2    public int minRotations(int n, String s) {
3     int t=0;
4        int cr=0;
5        for(int i=0;i<n;i++){
6            int d=s.charAt(i)-'0';
7            int df=Math.abs(d-cr);
8            t+=Math.min(df,10-df);
9            cr=d;
10        }
11        int m=t;
12        for(int k=0;k<n;k++){
13            int a=s.charAt(k)-'0';
14            int b=k==0?0:s.charAt(k-1)-'0';
15            int l=s.charAt(n-1)-'0';
16            int o=Math.abs(a-b);
17            o=Math.min(o,10-o);
18            
19            int ne=Math.abs(l-b);
20            ne=Math.min(ne,10-ne);
21            
22            int an=t-o+ne;
23            m=Math.min(m,an);
24            
25        }
26        return m;
27    }
28}