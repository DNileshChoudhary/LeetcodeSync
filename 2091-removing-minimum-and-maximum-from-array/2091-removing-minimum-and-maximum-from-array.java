class Solution {
    public int minimumDeletions(int[] nums) {
        int min = 0 , max = 0 ; 
        int n = nums.length ; 
        if(n==1)    return 1 ; 
        if(n==2)    return 2 ; 
        for(int i = 0 ; i<n ; i++)
        {
            if(nums[i]<nums[min])   min = i ; 
            if(nums[i]>nums[max])   max = i ; 
        }
        if(min<=(n/2) && max<=(n/2))  return Math.max(min,max)+1 ; 
        if(min>=(n/2) && max>=(n/2))  return n-Math.min(min,max) ; 
        int a = Math.max(min,max)+1;
        int b = n-Math.min(min,max) ; 
        int c = n-min+max+1 ; 
        int d = n-max+min+1 ; 
        return Math.min(Math.min(a,b),Math.min(c,d));
    }
}