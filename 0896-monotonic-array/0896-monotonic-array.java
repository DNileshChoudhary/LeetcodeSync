class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length ;
        if(n==1)    return true ; 
        boolean isDec = false , isInc = false ;
        for(int i = 0 ; i<n-1 ; i++)
        {
            if(nums[i]>nums[i+1])   break;
            if(i==n-2)  isInc = true ; 
        }
        if(isInc)   return true ;
        for(int i = 0 ; i<n-1 ; i++)
        {
            if(nums[i]<nums[i+1])   break;
            if(i==n-2)  isDec = true ; 
        }
        return isDec ; 
    }
}