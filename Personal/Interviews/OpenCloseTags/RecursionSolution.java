package Personal.Interviews.OpenCloseTags;
import java.util.ArrayList;

public class RecursionSolution {
    
    static ArrayList<String> answer = new ArrayList<>();

    // Create a recursive function that generates the Strings, and takes with 4 inputs:
    // 1. n: number of closed tag pairs ("<>" is a single pair)
    // 2. openCount: count of open tags ("<")
    // 3. closeCount: count of closed tags (">")
    // 4. str: Initially empty, will add an open tag to it at first
    public static void generateClosedStrings(int n, int openCount, int closeCount, String str) {
        
        // if we get to a point where the number of open tags count and the number
        // of closed tags count is equal to the count of pair tags, print the answer
        // and return noting.
        if (openCount == n && closeCount == n) {
            answer.add(str);
        }

        // if we haven't matched the number of open tags to the number of pair tags
        // call the function recursively
        // -- Note: The first n characters in the first string will all be '<'
        // -- -- -- as we are only adding '<' tags until opencount is == n,
        if (openCount < n) {
            generateClosedStrings(n, openCount + 1, closeCount, str + "<");
        }
        
        // We got to a position where we only have opening tags, now we just
        // recursively call the function while adding a closing tag until the 
        // closing tags count is equal to the opening count, and both equal to n
        if (closeCount < openCount) {
            generateClosedStrings(n, openCount, closeCount + 1, str + ">");
        }
    }

    public static void main(String[] args) {
        // Test: 3 tags ("<><><>")
        // Initially count is zero for all tags, and the string is empty
        generateClosedStrings(3, 0, 0, "");
        System.out.println(answer);
    }
}