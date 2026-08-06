class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length ; 
        k%=n ; 
        if(k==0)    return ; 
        int l = 0 , r = n-1 ; 
        while(l<r)  
        {
            int tem = arr[l];
            arr[l] = arr[r];
            arr[r] = tem ; 
            l++; r--;
        }
        l = 0 ; r = k-1;
        while(l<r)  
        {
            int tem = arr[l];
            arr[l] = arr[r];
            arr[r] = tem ; 
            l++; r--;
        }
        l = k ; r = n-1 ; 
        while(l<r)  
        {
            int tem = arr[l];
            arr[l] = arr[r];
            arr[r] = tem ; 
            l++; r--;
        }
    }
}