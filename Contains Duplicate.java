class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> same = new HashSet<>();
        for(int num:nums){
            if(same.contains(num)){
                return true;
            }
            same.add(num);
        }
        return false;
    }
}
