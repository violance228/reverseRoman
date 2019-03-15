package com.violence.reverseRoman;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * created by user violence
 * created on 15.03.2019
 * class created for project reverseRoman
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roman = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$");
        Matcher matcher = pattern.matcher(roman);
        if (matcher.find()) {
            System.out.println(CalculateRoman.getNumber(roman));
        } else {
            System.out.println("incorrect data");
        }
    }
}
