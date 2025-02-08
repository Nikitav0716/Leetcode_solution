class Solution {
    public int minElement(int[] nums) {
        if(nums == null || nums.length == 0)
        return -1;

        int min = Integer.MAX_VALUE;
        for(int num:nums){
            int sum=0;
            while(num>0){
            sum = sum+(num%10);
            num = num/10;
        }
            min = Math.min(min,sum);
        }
        return min;
    }
}
