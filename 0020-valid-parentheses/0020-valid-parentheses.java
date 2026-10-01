class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++)
        {
            char c = s.charAt(i);
            if(c=='{' || c=='(' || c=='[')  stk.push(c);
            else if(!stk.isEmpty())
            {
                if(c=='}' && stk.peek()!='{')   return false ;
                else if(c==')' && stk.peek()!='(')  return false ;
                else if(c==']' && stk.peek()!='[')  return false ; 
                else stk.pop();
            }
            else   return false ; 
        }
        return stk.isEmpty();
    }
}