class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int min = nums[0] ; 
        int max = min ; 
        for(int x : nums)
        {   
            set.add(x);
            if(x<min)   min = x ; 
            if(x>max)   max = x ; 
        }
        List<Integer> res = new ArrayList<>() ; 
        for(int i = min ; i<max+1 ; i++)
        {
            if(!set.contains(i))    res.add(i);
        }
        return res ;
    }
}