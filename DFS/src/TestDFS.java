import java.util.Collections;
import java.util.LinkedList;

public class TestDFS {
    public static void main(String[] args) {
        LinkedList<int[]> list = new LinkedList<>();
        int[][] iterables = {{1, 2, 3}, {0, 4}, {0}, {0, 5}, {1 ,5}, {3, 4, 6, 7}, {5}, {5}};
        Collections.addAll(list, iterables);

        System.out.println("DFS with recursion output:");
        DFS dfs = new DFS(list);
        dfs.executeDFS(0);

        System.out.println("DFS with stack and without recursion output:");
        DFSWithStack dfsWithStack = new DFSWithStack(list);
        dfsWithStack.executeDFSWithStack(0);
    }
}
