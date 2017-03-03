package astar;

import java.util.List;

/**
 * Main Class
 */
public class AStartImpl {

    public static void main(String []args) {

        System.out.println("Initiating the input graph for A-star search");
        Graph graph = new Graph();
        Graph graph1 = graph.initiateGraph();

        System.out.println("Applying A-star search algorithm to find shortest path with w = 0");
        AStar aStar = new AStar(graph1);
        List<String> resultingPath = aStar.aStarAlgorithm("Zerind", "Bucharest", 0.0);
        System.out.println("Path -");
        for(int i=0;i<resultingPath.size();i++) {
            System.out.print(resultingPath.get(i));
            System.out.print(" --> ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Applying A-star search algorithm to find shortest path with w = 0.25");
        graph1 = graph.initiateGraph();
        aStar = new AStar(graph1);
        resultingPath = aStar.aStarAlgorithm("Zerind", "Bucharest", 0.25);
        System.out.println("Path -");
        for(int i=0;i<resultingPath.size();i++) {
            System.out.print(resultingPath.get(i));
            System.out.print(" --> ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Applying A-star search algorithm to find shortest path with w = 0.75");
        graph1 = graph.initiateGraph();
        aStar = new AStar(graph1);
        resultingPath = aStar.aStarAlgorithm("Zerind", "Bucharest", 0.75);
        System.out.println("Path -");
        for(int i=0;i<resultingPath.size();i++) {
            System.out.print(resultingPath.get(i));
            System.out.print(" --> ");
        }
    }
}
