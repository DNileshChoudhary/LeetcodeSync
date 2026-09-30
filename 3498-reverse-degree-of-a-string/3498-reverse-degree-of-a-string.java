class Solution {
    public int reverseDegree(String s) {
        int res = 0 , tem = 26 ;
        int deg[] = new int[26];
        for(int i = 0 ; i<26 ; i++)
        {
            deg[i] = tem-- ; 
        }
        for(int i = 0 ; i<s.length() ; i++)
        {
            res += (deg[s.charAt(i)-97]*(i+1)) ; 
        }
        return res ; 
    }
}