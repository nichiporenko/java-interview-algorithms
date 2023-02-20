package com.nichiporenko.algorithms.arrays.easy;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using
 * all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] occurences = new int[26];
        for (int i = 0; i < s.length(); i++) {
            occurences[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            occurences[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < occurences.length; i++) {
            if (occurences[i] != 0) return false;
        }
        return true;
    }
}
