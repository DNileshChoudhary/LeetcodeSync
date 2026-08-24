class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) 
    {
        int sum = 0  ;
        for(int x : apple)  sum+=x;
        Arrays.sort(capacity);
        int res = 0 ; 
        for(int i = capacity.length-1 ; i>=0 ; i--)
        {
            if(sum<=0)  
            {
                break; 
            }
            sum-=capacity[i];
            res++;
        }
        return res ; 
    }
}