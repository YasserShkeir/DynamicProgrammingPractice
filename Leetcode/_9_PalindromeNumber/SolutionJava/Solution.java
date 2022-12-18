package Leetcode._9_PalindromeNumber.SolutionJava;

public class Solution {
    public static boolean isPalindrome(int x) {
        boolean ans = true;
        char[] txtm = String.valueOf(x).toCharArray();
        int i = 0;
        int j = txtm.length - 1;
        for (int k = 0; k < txtm.length / 2; k++) {
            if (txtm[i] == txtm[j]) {
                i++;
                j--;
                ans = true;
            } else {
                ans = false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
