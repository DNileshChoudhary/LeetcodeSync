class Solution {
    public int largestAltitude(int[] gain) {
        int init = 0 ; 
        int res = 0 ;
        for(int x : gain)   
        {
            res = Math.max(init+x,res);
            init = init+x;
        }
        return res ; 
    }
}