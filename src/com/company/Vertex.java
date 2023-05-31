package com.company;

import java.util.HashMap;
import java.util.Map;
public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjVertices;

    public Vertex(V data) {
        this.data = data;
        this.adjVertices = new HashMap<>();
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    public void addAdjacentVertex(Vertex<V> dest, double weight) {
        adjVertices.put(dest, weight);
    }

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjVertices;
    }

    @Override
    public String toString() {
        return "Vertex " + this.data;
    }
}