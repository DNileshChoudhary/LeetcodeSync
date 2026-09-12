class Solution {
    public String countAndSay(int n) {
        if(n==1)    return "1";
        String s = "1";
        for(int i = 2 ; i<=n ; i++)
        {
            s = helper(s);
        }
        return s;
    }
    private static String helper(String s)
    {
        int j = 0 ; 
        int n = s.length();
        int cnt = 0 ; 
        StringBuilder res = new StringBuilder();
        while(j<n)
        {
            if(j+1<n && s.charAt(j)==s.charAt(j+1))
            {
                cnt++;
            }
            else
            {
                res.append(Integer.toString(cnt+1));
                res.append(s.charAt(j));
                cnt = 0 ; 
            }
            j++;
        }
        return res.toString();
    }
}   