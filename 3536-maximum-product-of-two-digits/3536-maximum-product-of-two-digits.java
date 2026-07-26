class Solution {
    public int maxProduct(int n) {
        int arr[] = new int[10] ; 
        while(n!=0)
        {
            arr[n%10]++; n/=10 ; 
        }
        int a = 0 ; 
        int b = 0 ; 
        int cnt = 0 ; 
        for(int i = 9 ; i>=0 ; i--)
        {
            if(arr[i]>=2 && cnt == 0 )   return i*i ;  
            if(arr[i]>=1 && cnt==0)
            { 
                a=i ; 
                cnt++ ; 
            }
            else if(arr[i]>=1 && cnt==1) 
            {
                b=i ; 
                cnt++;
            }
        }
        return a*b ; 
    }
}