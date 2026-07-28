class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1) return s ; 
        int n = s.length() ; 
        char[] ch = s.toCharArray();
        Arrays.sort(ch,0,n/2);
        for(int i = 0 ; i<n/2 ; i++)
        {
            ch[n-i-1] = ch[i];
        }
        return new String(ch);
    }
}