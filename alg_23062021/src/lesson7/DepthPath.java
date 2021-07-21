package lesson7;

import java.util.LinkedList;

public class DepthPath extends FirstPath{
    public DepthPath(Graph g, int source){
        super(g, source);
    }

    @Override
    void roundPath(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                roundPath(g, w);
            }
        }
    }

    public boolean hasPathTo(int v){
        return super.hasPathTo(v);
    }

    public LinkedList<Integer> pathTo(int v){
        return super.pathTo(v);
    }
}
