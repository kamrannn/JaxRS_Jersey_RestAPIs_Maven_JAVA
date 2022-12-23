package org.example;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Node> nodes = new ArrayList<>();
    public double distance(Node source, Node target, Distance distanceFunction) {
        //if (!source.edges.cointains(target)){
        //
        //}
        return distanceFunction.distance(source, target);
    }
}
