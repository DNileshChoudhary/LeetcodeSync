class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int n = arr.length ; 
        int min[] = new int[n];
        int m = arr[n-1];
        for(int i = n-1 ; i>=0 ; i--)
        {
            if(arr[i]<m)    m = arr[i];
            min[i]=m ; 
        }   
        int max = arr[0];
        for(int i = 0 ; i<n ; i++)
        {
            if(arr[i]>max)  max = arr[i];
            if(max-min[i]<=k)
            {
                return i ; 
            }
        }
        return -1 ; 
    }
}