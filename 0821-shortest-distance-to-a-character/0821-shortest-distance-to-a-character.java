class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length() ;
        int[] res = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            int min = n ; 
            for(int j = 0 ; j<n ; j++)
            {
                if(s.charAt(j)==c && Math.abs(i-j)<min)
                {
                    min = Math.abs(i-j);
                }
            }
            res[i] = min ; 
        }
        return res ; 
    }
}