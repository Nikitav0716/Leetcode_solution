class Solution {
    public long countBadPairs(int[] nums) {
        long n =nums.length;
        long total = (n*(n-1))/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        long good = 0;
        for(int i=0;i<n;i++){
            int key = nums[i]-i;
            good += map.getOrDefault(key,0);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return total-good;
    }
}
