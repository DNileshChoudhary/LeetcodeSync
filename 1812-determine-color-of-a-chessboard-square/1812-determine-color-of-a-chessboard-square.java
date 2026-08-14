class Solution {
    public boolean squareIsWhite(String s) {
        if((s.charAt(0)-'a'+1)%2==0)
        {
            if((s.charAt(1)-'0')%2==0)  return false ; 
            return true ; 
        }
        return (s.charAt(1)-'0')%2==0 ; 
    }
}