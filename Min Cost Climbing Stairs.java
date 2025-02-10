class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int i = 0, j=0;
        for(int k=2;k<=n;k++){
            int ans = Math.min(i+cost[k-2] , j+cost[k-1]);
            i=j;
            j=ans; 
        }
        return j;
    }
}
