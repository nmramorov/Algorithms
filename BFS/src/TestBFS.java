import java.util.Collections;
import java.util.LinkedList;

public class TestBFS {
    public static void main(String[] args) {
        LinkedList<int[]> list = new LinkedList<>();
        int[][] iterables = {{1, 2, 3}, {0, 4}, {0}, {0, 5}, {1 ,5}, {3, 4, 6, 7}, {5}, {5}};
        Collections.addAll(list, iterables);

        System.out.println("DFS with recursion output:");
        BFS bfs = new BFS(list);
        bfs.executeBFS(0);
    }

}