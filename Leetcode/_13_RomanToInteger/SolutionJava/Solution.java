package Leetcode._13_RomanToInteger.SolutionJava;

public class Solution {
    public static int romanToInt(String s) {

        // create a variable to store the answer
        int sum = 0;

        // loop through the characters
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            switch (c) {
                case 'I':
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                        // Add 4 and skip one char
                        sum += 4;
                        i++;
                    } else if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                        // Add 9 and skip one char
                        sum += 9;
                        i++;
                    } else {
                        sum += 1;
                    }

                    break;

                case 'V':
                    sum += 5;

                    break;

                case 'X':
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                        // Add 40 and skip one char
                        sum += 40;
                        i++;
                    } else if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                        // Add 90 and skip one char
                        sum += 90;
                        i++;
                    } else {
                        sum += 10;
                    }

                    break;

                case 'L':
                    sum += 50;

                    break;

                case 'C':
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                        // Add 400 and skip one char
                        sum += 400;
                        i++;
                    } else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                        // Add 900 and skip one char
                        sum += 900;
                        i++;
                    } else {
                        sum += 100;
                    }

                    break;

                case 'D':
                    sum += 500;

                    break;

                case 'M':
                    sum += 1000;
                    break;

                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String test = "MCMXCIV";
        System.out.println(romanToInt(test));
    }
}
