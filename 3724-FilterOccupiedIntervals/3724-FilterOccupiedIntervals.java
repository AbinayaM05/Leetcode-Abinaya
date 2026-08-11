// Last updated: 8/11/2026, 9:51:15 PM
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals,new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                return a[0]-b[0];
            }
        });
        List<int[]>merged=new ArrayList<>();
        for(int[] x:occupiedIntervals){
            if(merged.isEmpty()||merged.get(merged.size()-1)[1]+1<x[0]){
                merged.add(x);
            }else{
                merged.get(merged.size()-1)[1]=Math.max(merged.get(merged.size()-1)[1],x[1]);
            }
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int[] x:merged){
            int s=x[0],e=x[1];
            if(e<freeStart||s>freeEnd){
                ans.add(Arrays.asList(s,e));
            }else{
                if(s<freeStart)
                    ans.add(Arrays.asList(s,freeStart-1));
                if(e>freeEnd)
                    ans.add(Arrays.asList(freeEnd+1,e));
            }
            }
        return ans;
        }
    }