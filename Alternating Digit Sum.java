class Solution {
    public int alternateDigitSum(int n) {
        String num =Integer.toString(n);
        int sign = 1;
        int sum = 0;

        for(int i=0;i<num.length();i++){
            int digit = (num.charAt(i)-'0');
            sum += digit * sign;

            sign = -sign;
            n /= 10;
        }
        return sum;
    }  
}
