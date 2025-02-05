class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int max=1;
        int c1 =1, c2=1 ;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                c1++;
                c2=1;
            }
            else if(nums[i-1]>nums[i]){
                c2++;
                c1=1;
            }
            else{
                c1=1;
                c2=1;
            }
            max= Math.max(max,Math.max(c1,c2));
        }
        return max;
    }
}
