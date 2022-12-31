package Leetcode._14_LongestCommonPrefix.SolutionJava;

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

public class Solution {
    public static String longestCommonPrefix(String[] strs) {

        // Set the first str as our base case
        String result = strs[0];

        // Loop through all the other strings
        for (int i = 1; i < strs.length; i++) {
            // We keep removing the last char from our res as much as it is not shared
            // with our current string
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty())
                    return "";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        longestCommonPrefix(strs);
    }
}
