class Solution {
    public int minimumPushes(String word) {
        int n = word.length(); 
        if(n<9) return n ; 
        int x = n/8 ; 
        int res = 4*(x*(x+1)); 
        res+=(n%8)*(x+1);
        return res ; 
    }
}

// sum = 1*8 + 2*8 + 