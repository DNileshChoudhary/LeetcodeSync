class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int res = -1 ; 
        for(int i = 0 ; i<n ; i++ )
        {
            int tem = nums[i];
            int sum = 0 ;
            while(tem>0)
            {
                sum+=(tem%10);
                if(sum>i)   break;
                tem/=10;
            }
            if(sum==i)  
            {
                res = i ; break;
            }
        }
        return res ; 
    }
}