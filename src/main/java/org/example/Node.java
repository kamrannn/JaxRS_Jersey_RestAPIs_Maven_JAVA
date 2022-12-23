package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Node {

    private double lon;
    private double lat;

    private List<Node> edges = new ArrayList();{
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Node){
            Node otherNode = (Node) obj;
            return this.lon == otherNode.lon && this.lat == otherNode.lat;
        }else{
            return false;
        }
    }

}
