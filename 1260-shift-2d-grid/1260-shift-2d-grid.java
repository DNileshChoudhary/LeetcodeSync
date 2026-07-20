class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length ; 
        int[] tem = new int[m*n];
        int x = 0 ; 
        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)  tem[x++]=grid[i][j];
        }
        k%=tem.length ; 
        x = tem.length-k ; 
        for(int i = 0 ; i<m ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                if(x>=tem.length)    x%=tem.length ; 
                grid[i][j] = tem[x++];
                
            }
        }
        
        List<List<Integer>> res = new ArrayList<>();
        for(int z[]: grid)
        {
            List<Integer> inn = new ArrayList<>();
            for(int y : z)  inn.add(y);
            res.add(inn);
        }
        return res ; 
    }
}