package Leetcode._724_FindPivotIndex.SolutionJava;

public class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < len; i++) {
            rightSum += nums[i];
        }

        if (rightSum == 0) {
            return 0;
        }

        for (int i = 1; i < len; i++) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
