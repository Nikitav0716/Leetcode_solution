class Solution {
    public int countDigits(int num) {
        int same =num;
        int count = 0;
        while(num>0){
            int digit = num%10;
            if(same%digit == 0 && digit!=0){
            count++;
            }
            num = num/10;
        }
        return count;
    }
}
