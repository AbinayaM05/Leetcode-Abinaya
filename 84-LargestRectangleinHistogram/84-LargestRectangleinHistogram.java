// Last updated: 8/14/2026, 11:58:28 AM
1class Solution {
2    public int largestRectangleArea(int[] arr  ) {
3        Stack<Integer>st=new Stack<>();
4        int maxArea=0;
5        for(int i=0;i<arr.length;i++){
6            while(!st.empty()&& arr[st.peek()]>arr[i]){
7                int element=st.peek();
8                st.pop();
9                int nse=i;
10                int pse=st.empty()?-1:st.peek();
11                maxArea=Math.max(maxArea,(nse-pse-1)*arr[element]);
12            }
13              st.push(i);
14            
15        }
16        int n=arr.length;
17        while(!st.empty()){
18            int nse=n;
19              int element=st.peek();
20            st.pop();
21            int pse=st.empty()?-1:st.peek();
22            maxArea=Math.max(maxArea,(nse-pse-1)*arr[element]);
23        }
24        return maxArea;
25    }
26}
27