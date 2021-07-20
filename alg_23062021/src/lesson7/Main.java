package lesson7;

public class Main {
    public static void main(String[] args) {

//        Graph graph = new Graph(10);
//
//        graph.addEdge(1,2);
//        graph.addEdge(0,4);
//        graph.addEdge(1,4);
//        graph.addEdge(3,4);
//        graph.addEdge(7,8);
//        graph.addEdge(1,3);


//        System.out.println(graph.getAdjList(2));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(4));
////        System.out.println(dfp.hasPathTo(7));
//        System.out.println(dfp.pathTo(4));

//        BreadthFirstPath bfp = new BreadthFirstPath(graph, 2);
//        System.out.println(bfp.hasPathTo(4));
//        System.out.println(bfp.pathTo(3));

        Graph graph1 = new Graph(10);
        graph1.addEdge(1,2);
        graph1.addEdge(2,3);
        graph1.addEdge(2,4);
        graph1.addEdge(3,5);
        graph1.addEdge(4,5);
        graph1.addEdge(4,6);
        graph1.addEdge(5,7);
        graph1.addEdge(7,9);
        graph1.addEdge(4,8);
        graph1.addEdge(0,8);
        System.out.println(graph1.getAdjList(4));

        DepthPath dp = new DepthPath(graph1,6);
        System.out.println(dp.pathTo(3));
        BreadthPath bp = new BreadthPath(graph1, 0);
        System.out.println(bp.pathTo(3));
    }
}
