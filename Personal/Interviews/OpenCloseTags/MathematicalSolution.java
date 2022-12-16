package Personal.Interviews.OpenCloseTags;

public class MathematicalSolution {
    
    // After some research, I found that the sequence of the strings matches the Catalan Numbers sequence (https://en.wikipedia.org/wiki/Catalan_number)

    // To implement this, we need to create a function that returns the nth Catalan Number
    
    // We first create a factorial function
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Then we create a function that returns the nth Catalan Number
    public static int catalanNumber(int n) {
        return factorial(2 * n) / (factorial(n + 1) * factorial(n));
    }

    // We can now test the function
    public static void main(String[] args) {
        System.out.println(catalanNumber(3));
    }

}
