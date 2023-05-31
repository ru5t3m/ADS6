package com.company;

import java.util.HashMap;
import java.util.Map;
public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjVertices;

    public void addAdjacentVertex(Vertex<V> dest, double weight) {
        adjVertices.put(dest, weight);
    }

}
