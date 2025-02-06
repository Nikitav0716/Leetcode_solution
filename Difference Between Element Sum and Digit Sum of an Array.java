class Solution {
    public int differenceOfSum(int[] nums) {
        int ans1=0, ans2=0;
        for(int i=0;i<nums.length;i++){
            ans1 += nums[i];
            while(nums[i]>0){
                ans2 += nums[i]%10;
                nums[i] /= 10;
            }
        }
        return Math.abs(ans1-ans2);
    }
}
