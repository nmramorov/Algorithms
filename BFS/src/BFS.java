import java.util.ArrayDeque;
import java.util.LinkedList;


public class BFS {

    LinkedList<int[]> list;
    ArrayDeque<Integer> deque;
    boolean[] visited;
    boolean[] enqueued;

    BFS(LinkedList<int[]> other) {
        this.list = new LinkedList<>();
        this.deque = new ArrayDeque<>();
        this.list = other;
        this.visited = new boolean[this.list.size()];
        this.enqueued = new boolean[this.list.size()];
    }

    public void executeBFS(int node) {

        this.deque.addLast(node);
        this.enqueued[node] = true;

        while (!this.deque.isEmpty()) {
            int otherNode = this.deque.pop();
            this.enqueued[otherNode] = false;
            System.out.println("The node " + otherNode + " visited");
            this.visited[otherNode] = true;
            int[] nodeVertexes = this.list.get(otherNode);
            for (Integer nodeFromList: nodeVertexes) {
                if (!visited[nodeFromList] & !enqueued[nodeFromList]) {
                    this.deque.addLast(nodeFromList);
                    this.enqueued[nodeFromList] = true;
                }
            }
        }
    }
}
