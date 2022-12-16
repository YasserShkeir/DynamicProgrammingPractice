package Personal.GoogleFooBarSolutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

// Second Exercise: Don't Get Volunteered!
// This is an old solution, I'm not sure if it's the best solution, but it works.

public class DontGetVolunteered {
    private static final int[][] DIRECTIONS = new int[][]{{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};

    public static int solution(int src, int dest) {
        int x_dest = dest % 8, y_dest = dest / 8;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{src % 8, src / 8});
        Set<String> visited = new HashSet<>();
        int result = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.remove();
                int curX = cur[0];
                int curY = cur[1];
                if (curX == x_dest && curY == y_dest) {
                    return result;
                }
                for (int[] d : DIRECTIONS) {
                    int newX = curX + d[0];
                    int newY = curY + d[1];
                    if (!visited.contains(newX + "," + newY) && newX >= -1 && newY >= -1) {
                        queue.add(new int[]{newX, newY});
                        visited.add(newX + "," + newY);
                    }
                }
            }
            result++;
        }
        return -1;
    }
}
