class Solution {
    public long gcdSum(int[] nums) {
        long prefixGcd[] = new long[nums.length];
        int max = nums[0] ; 
        for(int i = 0 ; i<nums.length ; i++)
        {
            if(nums[i]>max) max = nums[i];
            prefixGcd[i] = gcd(max , nums[i]);
        }
        Arrays.sort(prefixGcd);
        long res = 0 ; 
        int l = 0 , r = nums.length-1; 
        while(l<r)
        {
            res+=gcd(prefixGcd[l],prefixGcd[r]);
            l++;r--;
        }
        return res ; 
    }
    private static long gcd(long a , long b)
    {
        if(b==0)    return a ; 
        return gcd(b,a%b);
    }
}