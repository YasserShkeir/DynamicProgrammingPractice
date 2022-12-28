package Leetcode._1018_BinaryPrefixDivisibleBy5.SolutionJava;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        // Create the list of answers
        List<Boolean> ans = new ArrayList<>();

        // Create a variable to store our decimals
        int var = 0;
        for (int i = 0; i < nums.length; i++) {
            var = (var * 2 + nums[i]) % 5;
            if (var == 0)
                ans.add(true);
            else
                ans.add(false);

        }
        return ans;
    }
}
