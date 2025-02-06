class Solution {
    public int minimumSum(int num) {
        int[] dig = new int[4];
        for(int i=0;i<4;i++){
            dig[i] = num%10;
            num /= 10;
        }
        Arrays.sort(dig);
        int ans1 = dig[0]*10+dig[2];
        int ans2 = dig[1]*10+dig[3];
        return ans1+ans2;
    }
}
