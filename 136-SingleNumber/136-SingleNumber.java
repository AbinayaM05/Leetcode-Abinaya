// Last updated: 8/11/2026, 10:06:29 PM
class Solution {
    public int singleNumber(int[] nums) {

	    int x=0,i;
	    for(i=0;i<nums.length;i++)
	     x=x^nums[i];
	     return x;
      }

	}

   
    