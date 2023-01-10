package Leetcode._70_ClimbingStairs.SolutionJava;

public class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }

        int[] sums = new int[n];
        sums[0] = 1;
        sums[1] = 2;

        for (int i = 2; i < n; i++) {
            sums[i] = sums[i - 1] + sums[i - 2];
        }

        return sums[n - 1];
    }

    public static void main(String[] args) {

    }
}
