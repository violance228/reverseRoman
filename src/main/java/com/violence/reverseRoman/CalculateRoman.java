package com.violence.reverseRoman;

/**
 * created by user violence
 * created on 15.03.2019
 * class created for project reverseRoman
 */

public class CalculateRoman {
    public static int getNumber(String roman) {
        int result = 0;
        for (int i = 0; i <= roman.length()-1; i++) {
            int m = i;
            if ((roman.length() > m+1) && (Symbols.getNumberBySymbol(roman.charAt(i)) < Symbols.getNumberBySymbol(roman.charAt(m+1)))) {
                result += Symbols.getNumberBySymbol(roman.charAt(m+1))-Symbols.getNumberBySymbol(roman.charAt(i));
                i++;
            } else {
                result += Symbols.getNumberBySymbol(roman.charAt(i));
            }
        }
        return result;
    }
}
