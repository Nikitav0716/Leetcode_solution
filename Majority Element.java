class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int max = nums.length/2;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>max){
                return nums[i];
            }
        }
        return -1;
    }
}
