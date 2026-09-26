// Last updated: 9/26/2026, 8:19:35 PM
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3       if(source.length!=target.length){
4           return false;
5       } 
6        if(source.length==1){
7           return source[0]==target[0];
8       } 
9        long s1=0;
10        long s2=0;
11        for(int i=0;i<source.length;i++){
12            s1+=source[i];
13            s2+=target[i];
14            
15        }
16       return s1==s2; 
17    }
18}