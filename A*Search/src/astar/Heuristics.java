package astar;

import java.util.HashMap;

public class Heuristics {

    public HashMap<String, Double> heuristics;

    Heuristics() {
        heuristics = new HashMap<String, Double>();
        heuristics.put("Arad", 366.0);
        heuristics.put("Bucharest", 0.0);
        heuristics.put("Craiova", 160.0);
        heuristics.put("Drobeta", 242.0);
        heuristics.put("Eforie", 161.0);
        heuristics.put("Fagaras", 176.0);
        heuristics.put("Giurgiu", 77.0);
        heuristics.put("Hirsova", 151.0);
        heuristics.put("Iasi", 226.0);
        heuristics.put("Lugoj", 244.0);
        heuristics.put("Mehadia", 241.0);
        heuristics.put("Neamt", 234.0);
        heuristics.put("Oradea", 380.0);
        heuristics.put("Pitesti", 100.0);
        heuristics.put("Rimnicu Vilcea", 193.0);
        heuristics.put("Sibiu", 253.0);
        heuristics.put("Timisoara", 329.0);
        heuristics.put("Urziceni", 80.0);
        heuristics.put("Vaslui", 199.0);
        heuristics.put("Zerind", 374.0);
    }

    public HashMap<String, Double> getHeuristics() {
        return heuristics;
    }
}
