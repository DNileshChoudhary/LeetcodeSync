class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int a = 0 ; 
        for(int i = 0 ; i<patterns.length ; i++)
        {
            if(word.contains(patterns[i]))  a++;
        }
        return a ; 
    }
}