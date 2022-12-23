package org.example;

public class EuclideanDistance implements Distance{
    @Override
    public double distance(Node source, Node target) {
        return Math.sqrt(Math.pow(source.getLat()-target.getLat(), 2)
                + Math.pow(source.getLon()-target.getLon(), 2));
    }
}
