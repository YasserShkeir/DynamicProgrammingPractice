package Leetcode._748_ShortestCompletingWord.SolutionJava;

import java.util.HashMap;

public class Solution {

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        // Count the frequency of each letter in the licensePlate string
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        // Find the shortest completing word in the words array
        String result = "";
        for (String word : words) {
            // Check if the current word contains all the necessary letters
            boolean isValid = true;
            for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
                char c = entry.getKey();
                int count = entry.getValue();
                if (word.toLowerCase().indexOf(c) == -1 || count(word.toLowerCase(), c) < count) {
                    isValid = false;
                    break;
                }
            }

            // Update the result if necessary
            if (isValid && (result.equals("") || word.length() < result.length())) {
                result = word;
            }
        }

        return result;
    }

    private static int count(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String licensePlate = "1s3 456";
        String[] words = { "looks", "pest", "stew", "show" };
        System.out.println(shortestCompletingWord(licensePlate, words));
    }
}
