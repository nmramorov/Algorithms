import java.util.LinkedList;
import java.util.Stack;


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


class DFSWithStack extends DFS {
    Stack<Integer> stack;
    boolean[] inStack;

    DFSWithStack(LinkedList<int[]> other) {
        super(other);
        this.stack = new Stack<>();
    }

    void executeDFSWithStack(int node) {
        this.inStack = new boolean[this.arr.size()];

        for (int i = 0; i < this.arr.size(); i++) {
            this.inStack[i] = false;
        }

        this.stack.push(node);
        this.inStack[node] = true;

        while (!this.stack.isEmpty()) {
            int nodeFromStack = this.stack.pop();
            this.visited[nodeFromStack] = true;
            this.inStack[nodeFromStack] = false;
            System.out.println("The vertex " + nodeFromStack + " visited");
            int[] currentList = this.arr.get(nodeFromStack);
            for (Integer otherNode: currentList) {
                if (!this.visited[otherNode] & !this.inStack[otherNode]) {
                    this.stack.push(otherNode);
                    this.inStack[otherNode] = true;
                }
            }
        }
    }

}
