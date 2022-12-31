package Leetcode._20_ValidParentheses.SolutionJava;

import java.util.Stack;

class Solution {

    public static boolean isValid(String s) {
        // Create a stack to keep track of parentheses
        Stack<Character> stack = new Stack<>();

        // Loop through given parentheses
        for (char c : s.toCharArray()) {
            switch (c) {
                // If it's an opening string, push to stack
                case '(':
                    stack.push('(');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '[':
                    stack.push('[');
                    break;

                // If it's a closing string, pop last parentheses and check if it
                // is a matching opener, if it's not return false
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }

        return stack.isEmpty();
    }
}