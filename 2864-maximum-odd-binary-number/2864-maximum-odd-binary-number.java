class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0 ; 
        for(char c : s.toCharArray())
        {
            if(c=='1')  ones++;
        }
        StringBuilder sb = new StringBuilder("");
        if(ones!=1)
        {
            for(int i = 0 ; i<ones-1 ; i++)
            {
                sb.append('1');
            }
            for(int i = ones-1 ; i<s.length()-1 ; i++)
            {
                sb.append('0');
            }
            sb.append('1');
        }
        else    
        {
            for(int i = 0 ; i<s.length()-1 ; i++)   sb.append('0');
            sb.append('1');
        }
        return sb.toString() ; 
    }
}