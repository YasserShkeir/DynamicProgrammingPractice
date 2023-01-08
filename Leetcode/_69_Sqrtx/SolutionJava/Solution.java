package Leetcode._69_Sqrtx.SolutionJava;

public class Solution {
    public static int mySqrt(int x) {

        // Base Case: x is less than 2 ( 1 or 0)
        if (x < 2) {
            return x;
        }

        // Two Pointers with a similar approach to binary search
        int start = 1, end = x / 2;

        // While Ptr 1 didn't meet Ptr 2
        while (start <= end) {
            // Mid Point
            int mid = (start + end) / 2;

            // If mid^2 > x, then we're on the left side
            if ((long) mid * mid > x) {
                end = mid - 1;
            }
            // Else we're on the right side
            else {
                start = mid + 1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(3));
    }
}
