class Solution {
    public int digitFrequencyScore(int n) {
        int mul = 0 ; 
        while(n!=0)
        {
            mul+=(n%10);
            n/=10;
        }
        return mul ; 
    }
}