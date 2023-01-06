package Leetcode._67_AddBinary.SolutionJava;

import java.math.BigInteger;

public class Solution {
    // Given two binary strings a and b, return their sum as a binary string.

    public static String addBinary(String a, String b) {
        // Parse the strings as BigIntegers and add them + return as binary String
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }

    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }
}
