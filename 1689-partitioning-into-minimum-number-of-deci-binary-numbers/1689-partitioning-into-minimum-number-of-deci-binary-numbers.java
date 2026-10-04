class Solution {
    public int minPartitions(String n) {
        int res = 0 ; 
        for(char c : n.toCharArray())
        {
            res = Math.max(res,c-48);
            if(res==9)  return res;
        }
        return res ; 
    }
}