import java.util.LinkedList;


public class DFS {

    LinkedList<int[]> arr;
    boolean[] visited;

    DFS(LinkedList<int[]> other) {
        this.arr = new LinkedList<>();
        this.arr = other;
        this.visited = new boolean[this.arr.size()];
        for (int i = 0; i < this.arr.size(); i++) {
            this.visited[i] = false;
        }
    }

    void executeDFS(int node) {
        this.visited[node] = true;
        System.out.println("The vertex " + node + " visited");
        int[] currentList = this.arr.get(node);
        for (Integer otherNode: currentList) {
            if (!visited[otherNode]) {
                executeDFS(otherNode);
            }
        }
    }
}
