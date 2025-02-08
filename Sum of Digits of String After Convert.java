class Solution {
    public int getLucky(String s, int k) {
        StringBuilder st = new StringBuilder();
        for(char c: s.toCharArray()){
            st.append(c -'a' +1);
        }
        int sum=0;
        for(char digit: st.toString().toCharArray()){
            sum += digit -'0';
        }
        while(k>1){
            int sum2 =0;
            while(sum>0){
                sum2 += sum%10;
                sum /= 10;
            }
            sum= sum2;
            k--;
        }
        return sum;
    }
}
