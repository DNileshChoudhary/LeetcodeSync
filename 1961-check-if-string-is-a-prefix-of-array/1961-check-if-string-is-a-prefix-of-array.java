class Solution {
    public boolean isPrefixString(String s, String[] words) {
        if(s.length()<words[0].length())    return false ; 
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i<words.length ; i++)
        {
            sb.append(words[i]);
            if(sb.length()>s.length())  return false ; 
            if(sb.toString().equals(s)) return true ; 
        }
        return false ;
    }
}