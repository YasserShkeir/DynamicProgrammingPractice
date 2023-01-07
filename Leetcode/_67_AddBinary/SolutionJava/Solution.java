package Leetcode._67_AddBinary.SolutionJava;

import java.math.BigInteger;

public class Solution {
    // Given two binary strings a and b, return their sum as a binary string.

    // int ii = a.length() - 1, jj = b.length() - 1, cc = 0;
    // StringBuilder sb = new StringBuilder();

    // while(ii>=0||jj>=0||cc==1)
    // {
    // int aVal = (ii < 0) ? 0 : a.charAt(ii--) - '0';
    // int bVal = (jj < 0) ? 0 : b.charAt(jj--) - '0';

    // sb.insert(0, (char) ('0' + aVal ^ bVal ^ cc)); // Bitwise exclusive OR (^)
    // cc = (aVal + bVal + cc) >> 1;
    // }

    // return sb.toString();

    public static String addBinary(String a, String b) {

        // Create two variables to store the lengths
        int lenA = a.length() - 1, lenB = b.length() - 1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while (lenA >= 0 || lenB >= 0 || carry == 1) {
            int aVal = (lenA < 0) ? 0 : a.charAt(lenA--) - '0';
            int bVal = (lenB < 0) ? 0 : b.charAt(lenB--) - '0';

            ans.insert(0, (char) ('0' + aVal ^ bVal ^ carry));
            carry = (aVal + bVal + carry) >> 1;
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }
}
