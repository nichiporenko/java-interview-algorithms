package com.nichiporenko.algorithms.arrays.easy;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 *
 *
 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 *
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 *
 * Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 * Example 4:
 * Input: str1 = "AAAAAB", str2 = "AAA"
 * Output: ""
 *
 * Constraints:
 *
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 */
public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        for (int i = Math.min(length1, length2); i >= 1; i--) {
            if (valid(str1, str2, i)) {
                return str1.substring(0, i);
            }
        }
        return "";
    }

    private static boolean valid(String str1, String str2, int i) {
        int length1 = str1.length();
        int length2 = str2.length();

        if (length1 % i > 0 || length2 % i > 0) {
            return false;
        } else {
            String base = str1.substring(0, i);
            return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
        }
    }
}
