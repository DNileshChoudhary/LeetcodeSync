class Solution {
    public int smallestNumber(int n, int t) {
        while(true)
        {
            if(helper(n)%t==0)  return n ; 
            n++;
        }
    }
    private static int helper(int n)
    {
        int mul = 1 ; 
        while(n>0)
        {
            mul*=(n%10);
            n/=10;
        }
        return mul ;
    }
}