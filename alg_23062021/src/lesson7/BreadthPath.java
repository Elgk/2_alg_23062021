package lesson7;

import java.util.LinkedList;

public class BreadthPath extends FirstPath{
    public BreadthPath(Graph g, int source){
        super(g, source);
    }

    @Override
    void roundPath(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);
        marked[source] = true;

        while (!queue.isEmpty()){
            int vertex = queue.removeFirst(); // извлечем вершину и запомним
            for (int w : g.getAdjList(vertex)) {
                if(!marked[w]){
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    queue.addLast(w);
                }
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
