package lesson7;

import java.util.LinkedList;

public abstract class FirstPath {
    boolean[] marked;
    int[] edgeTo;
    int source;

    public FirstPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
        roundPath(g, source);
    }

    boolean hasPathTo(int v) { // есть путь
        return marked[v];
    }

    abstract void roundPath(Graph g, int source);

    LinkedList<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = v;
        while (vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
