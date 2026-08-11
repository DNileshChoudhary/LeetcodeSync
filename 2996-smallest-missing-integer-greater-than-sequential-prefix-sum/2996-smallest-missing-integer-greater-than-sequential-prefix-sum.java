class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length ;
        int sum = nums[0] ; 
        int last = nums[0] ;
        HashSet<Integer> set = new HashSet<>();
        // 29,30,31,32,33,34,35,36,37
        // 1 3 4 5 13 14 15 
        // 
        for(int x : nums)   set.add(x);
        for(int i = 1 ; i<n ; i++)
        {
            if(nums[i]==last+1)
            {
                sum+=nums[i];
                last = nums[i];
            }
            else 
            {
                break;
            }
        }
        while(true)
        {
            if(!set.contains(sum))  return sum ;
            sum++;
        }

    }
}