class Solution {
    public int maxDepth(String s) {
        int ans = 0 ; 
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)=='(')    stk.push(s.charAt(i));
            if(s.charAt(i)==')')    stk.pop();
            ans = Math.max(ans,stk.size());
        }
        return ans;
    }
}