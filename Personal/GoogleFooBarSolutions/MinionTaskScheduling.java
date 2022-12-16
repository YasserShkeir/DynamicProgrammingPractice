package Personal.GoogleFooBarSolutions;

import java.util.Arrays;
import java.util.LinkedList;

// First Exercise: Minion Task Scheduling
// This is an old solution, I'm not sure if it's the best solution, but it works.

public class MinionTaskScheduling {
    public static int occurences(int[] list, int n){
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == n) {
                count++;
            }
        }
        return count;
    }
        
    public static int[] answer(int[] list, int n) {
        LinkedList<Integer> tst = new LinkedList<>();
        
        for (int i = 0; i < list.length; i++) {
            if (occurences(list, list[i]) <= n) {
                tst.add(list[i]);
            }
        }
        Object[] arr = tst.toArray();
        
        int[] res = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            res[i] = (Integer)arr[i];
        }
        
        return res;
    }    

    public static void main(String[] args) {
        int[] list = {1, 2, 3}; int n = 6;
        System.out.println(Arrays.toString(answer(list,n)));
    }
}
