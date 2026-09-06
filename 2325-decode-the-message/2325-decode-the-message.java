class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        int j = 0 ; 
        for(int i = 0 ; i<key.length() ; i++)
        {
            while(key.charAt(i)==' ')      i++;
            if(i<key.length())
            {
                if(!map.containsKey(key.charAt(i)))
                    map.put(key.charAt(i),j++);
                if(j==26)   break;
            }
        }
        for(int i = 0 ; i<message.length() ; i++ )
        {
            if(message.charAt(i)==' ')  sb.append(' ');
            else sb.append((char)(map.get(message.charAt(i)).intValue()+97));
        }
        return sb.toString();
    }
}