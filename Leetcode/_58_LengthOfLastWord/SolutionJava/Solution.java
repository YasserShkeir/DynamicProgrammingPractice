package Leetcode._58_LengthOfLastWord.SolutionJava;

public class Solution {

    public static int lengthOfLastWord(String s) {
        // Start from last index and go back until we get a word
        for (int k = s.length() - 1; k > 0; k--) {
            // If we get a word
            if (s.charAt(k) != ' ') {
                // Get length of word
                int len = 0;
                while (k >= 0 && s.charAt(k) != ' ') {
                    k--;
                    len++;
                }

                return len;
            }
        }

        // If 1 letter word case
        return 1;
    }

    public static void main(String[] args) {
        String s = "  fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
