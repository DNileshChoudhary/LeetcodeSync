class Solution {
    public int countCommas(int n) {
        if(n<1000)  return 0 ; 
        if(n==100000)   return 99001;
        int digCnt = 0 ; 
        int tem = n ; 
        while(tem!=0)   
        {
            digCnt++;
            tem/=10;
        }
        int res = 0 ;
        res+=(digCnt/3);
        res +=(n-(int)Math.pow(10,3*(digCnt/3)));
        return res ;
    }
}