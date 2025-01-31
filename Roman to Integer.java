import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> rom = new HashMap<>();
        rom.put('I',1);
        rom.put('V',5);
        rom.put('X',10);
        rom.put('L',50);
        rom.put('C',100);
        rom.put('D',500);
        int total =0;
        for(int i=0;i<s.length()-1;i++){
            if(rom.get(s.charAt(i)) < rom.get(s.charAt(i+1))){
                total = total-rom.get(s.charAt(i));
            }
            else{
                total = total+rom.get(s.charAt(i));
            }
        }
        total = total +rom.get(s.charAt(s.length()-1));
        return total;
    }
}
