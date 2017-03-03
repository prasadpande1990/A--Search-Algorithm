package astar;

/**
 * Stores node data which includes following
 * NodeId - Name of the city
 * h - heuristic value
 * g - distance from source
 * f = g + h
 */
public class Node {

    private String nodeId;
    private double h;
    private double g;
    private double f;

    public void setF(double f) {
        this.f = f;
    }

    public double getF() {
        return f;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setG(double g) {
        this.g = g;
    }

    public Node(String nodeId, double h) {
        this.nodeId = nodeId;
        this.h = h;
        this.g = Double.MAX_VALUE;
    }

    public String getNodeId() {
        return nodeId;
    }

    public double getH() {
        return h;
    }

    public double getG() {
        return g;
    }

    public double calculateF(String destinationNodeId, double w) {
        double h = this.h;
        if(w==0)
            return h+g;
        return (w*h) + ((1-w)*g);
    }
}
