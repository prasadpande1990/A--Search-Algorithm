package astar;

import java.util.*;

/**
 * Class to implement A-star algorithm
 */
public class AStar {

    public AStar(Graph graph) {
        this.graph = graph;
    }

    private Graph graph;

    public List<String> aStarAlgorithm(String sourceNodeId, String destinationNodeId, double w) {
        Queue<Node> queue = new PriorityQueue<Node>(11, new NodeComparator());
        int nodesExpanded = 0;
        Node source = graph.getNodeData().get(sourceNodeId);
        source.setG(0);
        source.setF(source.calculateF(destinationNodeId, w));
        queue.add(source);

        final Map<Node, Node> path = new HashMap<Node, Node>();
        final Set<Node> isVisited = new HashSet<Node>();

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            //System.out.println(" astar.Node = " + node.getNodeId()+" f = "+ node.getF());
            if (node.getNodeId().equals(destinationNodeId)) {
                System.out.println("Final Cost = " + node.calculateF(destinationNodeId, w));
                System.out.println("Number of nodes expanded = " + nodesExpanded);
                return path(path, graph.getNodeData().get(destinationNodeId));
            }

            isVisited.add(node);
            Map<Node, Double> sourceNeighbours = graph.getGraph().get(node.getNodeId());
            nodesExpanded++;

            for (Map.Entry<Node, Double> neighborEntry : sourceNeighbours.entrySet()) {
                Node neighborNode = neighborEntry.getKey();

                if (isVisited.contains(neighborNode))
                    continue;

                double distanceBetweenCurrentNodes = neighborEntry.getValue();
                double totalDistance = distanceBetweenCurrentNodes + node.getG();

                if (totalDistance < neighborNode.getG()) {
                    neighborNode.setG(totalDistance);
                    neighborNode.setF(neighborNode.calculateF(destinationNodeId, w));

                    path.put(neighborNode, node);
                    if (!queue.contains(neighborNode)) {
                        queue.add(neighborNode);
                    }
                }

            }
        }
        return null;
    }

    private List<String> path(Map<Node, Node> pathMap, Node destination) {

        final List<String> path = new ArrayList<String>();
        path.add(destination.getNodeId());
        while (pathMap.containsKey(destination)) {
            destination = pathMap.get(destination);
            path.add(destination.getNodeId());
        }
        Collections.reverse(path);
        return path;
    }

    /**
     * Main Class
     */
    public static class AStartImpl {

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
}
