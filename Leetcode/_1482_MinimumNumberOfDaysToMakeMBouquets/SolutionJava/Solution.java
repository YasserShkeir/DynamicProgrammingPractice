package Leetcode._1482_MinimumNumberOfDaysToMakeMBouquets.SolutionJava;

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }

        int left = 1;
        int right = 1000000000;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int bouquets = getBouquets(bloomDay, mid, m, k);
            if (bouquets < m) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private static int getBouquets(int[] bloomDay, int days, int m, int k) {
        int bouquets = 0;
        int flowers = 0;
        for (int day : bloomDay) {
            if (day > days) {
                flowers = 0;
            } else {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            }
        }

        return bouquets;
    }
}