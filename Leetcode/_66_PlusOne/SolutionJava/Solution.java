package Leetcode._66_PlusOne.SolutionJava;

import java.util.Arrays;

public class Solution {

    // You are given a large integer represented as an integer array digits, where
    // each digits[i] is the ith digit of the integer. The digits are ordered from
    // most significant to least significant in left-to-right order. The large
    // integer does not contain any leading 0's.

    // Increment the large integer by one and return the resulting array of digits.

    public static int[] plusOne(int[] digits) {
        // If the first (rightmost) integer isn't a nine, we simply add one
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        // If we get here, means we have a 9, adding one will carry a one to left int
        boolean carry = true;

        // Loop from right to left
        for (int i = digits.length - 1; i >= 0; i--) {
            // If we still have a carry
            if (carry) {
                // If new digit is also a nine
                if (digits[i] == 9) {
                    // Change to zero
                    digits[i] = 0;
                    // Carry is true
                    carry = true;
                }
                // If new digit isn't a nine
                else {
                    // Add one which is basically what was carried
                    digits[i]++;
                    // No more carry
                    carry = false;
                }
            }
            // If we don't have a carry
            else {
                break;
            }
        }

        // If we don't have a carry by the end of the loop
        if (!carry) {
            // Return the array as it is with the added one (same length arr)
            return digits;
        }
        // If we still have a carry by the end
        else {
            // New array that simply imitates this: 999 -> 1000
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = digits[i - 1];
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        int[] test = { 9 };
        System.out.println(Arrays.toString(plusOne(test)));
    }
}
