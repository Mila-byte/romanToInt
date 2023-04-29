package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        int val = 0;
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int prevVal = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentVal = romanValues.get(s.charAt(i));
            if (currentVal >= prevVal) {
                val += currentVal;
            } else {
                val -= currentVal;
            }

            prevVal = currentVal;
        }
        return val;
    }
}
