package astar;

import java.util.HashMap;
import java.util.Map;

/**
 * astar.Graph to store undirected graph structure of cities.
 */
public class Graph {

    private  Map<String, Map<Node, Double>> graph;
    private  Map<String, Node> nodeData;

    Graph() {
        this.graph = new HashMap<String, Map<Node, Double>>();
        this.nodeData = new HashMap<String, Node>();
    }

    public  void setGraph(Map<String, Map<Node, Double>> graph) {
        this.graph = graph;
    }

    public  void setNodeData(Map<String, Node> nodeData) {
        this.nodeData = nodeData;
    }

    public  Map<String, Map<Node, Double>> getGraph() {
        return graph;
    }

    public  Map<String, Node> getNodeData() {
        return nodeData;
    }

    public void addNode(String nodeId) {
        Heuristics heuristics = new Heuristics();
        Node node = new Node(nodeId, heuristics.getHeuristics().get(nodeId));
        graph.put(nodeId, new HashMap<Node, Double>());
        nodeData.put(nodeId, node);
    }

    public void addEdge(String sourceNodeId, String destinationNodeId, double length) {
        graph.get(sourceNodeId).put(nodeData.get(destinationNodeId), length);
        graph.get(destinationNodeId).put(nodeData.get(sourceNodeId), length);
    }

    public static Graph initiateGraph() {
        Graph graph = new Graph();

        //Add City nodes to the graph
        graph.addNode("Arad");
        graph.addNode("Bucharest");
        graph.addNode("Craiova");
        graph.addNode("Drobeta");
        graph.addNode("Eforie");
        graph.addNode("Fagaras");
        graph.addNode("Giurgiu");
        graph.addNode("Hirsova");
        graph.addNode("Iasi");
        graph.addNode("Lugoj");
        graph.addNode("Mehadia");
        graph.addNode("Neamt");
        graph.addNode("Oradea");
        graph.addNode("Pitesti");
        graph.addNode("Rimnicu Vilcea");
        graph.addNode("Sibiu");
        graph.addNode("Timisoara");
        graph.addNode("Urziceni");
        graph.addNode("Vaslui");
        graph.addNode("Zerind");

        //Add Edges to the graph
        graph.addEdge("Arad", "Zerind", 75.0);
        graph.addEdge("Arad", "Sibiu", 140.0);
        graph.addEdge("Arad", "Timisoara", 118.0);
        graph.addEdge("Zerind", "Oradea", 71.0);
        graph.addEdge("Oradea", "Sibiu", 151.0);
        graph.addEdge("Timisoara", "Lugoj", 111.0);
        graph.addEdge("Lugoj", "Mehadia", 70.0);
        graph.addEdge("Mehadia", "Drobeta", 75.0);
        graph.addEdge("Drobeta", "Craiova", 120.0);
        graph.addEdge("Craiova", "Rimnicu Vilcea", 146.0);
        graph.addEdge("Craiova", "Pitesti", 138.0);
        graph.addEdge("Sibiu", "Rimnicu Vilcea", 80.0);
        graph.addEdge("Sibiu", "Fagaras", 99.0);
        graph.addEdge("Rimnicu Vilcea", "Pitesti", 97.0);
        graph.addEdge("Pitesti", "Bucharest", 101.0);
        graph.addEdge("Fagaras", "Bucharest", 211.0);
        graph.addEdge("Bucharest", "Giurgiu", 90.0);
        graph.addEdge("Bucharest", "Urziceni", 85.0);
        graph.addEdge("Urziceni", "Vaslui", 142.0);
        graph.addEdge("Urziceni", "Hirsova", 98.0);
        graph.addEdge("Hirsova", "Eforie", 86.0);
        graph.addEdge("Vaslui", "Lugoj", 92.0);
        graph.addEdge("Lugoj", "Neamt", 87.0);

        return graph;
    }
}
