class Solution {
    public int minimumPushes(String word) {
        int []freq = new int[26] ;
        int n = word.length() ; 
        for(char c : word.toCharArray())
        {
            freq[c-97]++;
        }
        int dist = 0 ; 
        for(int x: freq)    if(x>0) dist++;
        if(dist<9)  return n ; 
        Arrays.sort(freq);
        int l = 0 , r=25; 
        while(l<r)
        {
            int tem = freq[l];
            freq[l]=freq[r];
            freq[r]=tem ; 
            l++;r--;
        }
        int res = 0 ; 
        int cnt = 0 ; 
        System.out.println(Arrays.toString(freq));
        for(int i = 0 ; i<26 ; i++)
        {
            if(freq[i]!=0 && cnt<8)
            {
                cnt++;
                res += freq[i];
            }
            if(cnt==8)
            {  cnt = i ; break;}
        }
        System.out.println(cnt);
        int cnt1 = 0 , cnt2 = 0 , cnt3 = 0 ; 
        for(int i = cnt+1 ; i<26 ; i++)
        {
            if(freq[i]!=0 && cnt1<8)
            {
                res += (freq[i]*2);
                cnt1++;
            }
            else if(freq[i]!=0 && cnt2<8)
            {
                cnt2++;
                res+=(freq[i]*3);
            }
            else if(freq[i]!=0 && cnt3<8)
            {
                cnt3++;
                res+= freq[i]*4;
            }
        }

        return res; 
    }    // abcdefghabcdijk
        //  aabbccddefghiijk
}

