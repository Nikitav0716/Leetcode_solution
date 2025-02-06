class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
         for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int ans = nums[i]*nums[j];
                count += map.getOrDefault(ans,0);
                map.put(ans, map.getOrDefault(ans,0)+1);
            }
        }
        return count*8;
    }
}
