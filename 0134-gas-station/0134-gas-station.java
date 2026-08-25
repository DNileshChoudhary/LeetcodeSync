class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totGas = 0 , totCost = 0 , currGas = 0 , strtIdx = 0 ; 
        for(int i = 0 ; i<cost.length ; i++)
        {
            totGas+=gas[i] ; totCost+=cost[i] ; 
            currGas += gas[i]-cost[i];
            if(currGas<0)
            {
                currGas=0 ; 
                strtIdx=i+1;
            }
        }
        return (totGas<totCost)?-1:strtIdx;
    }
}