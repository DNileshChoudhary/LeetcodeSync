class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Character> map = new HashMap<>();
        char strt = 'a';
        for(int i = 0 ; i<key.length() ; i++)
        {
            while(key.charAt(i)==' ')      i++;
            if(i<key.length())
            {
                if(!map.containsKey(key.charAt(i)))
                    map.put(key.charAt(i),strt++);
                if(strt-1=='z')   break;
            }
        }
        for(int i = 0 ; i<message.length() ; i++ )
        {
            if(message.charAt(i)==' ')  sb.append(' ');
            else sb.append(map.get(message.charAt(i)));
        }
        return sb.toString();
    }
}