package com.company;

import java.util.*;

public class MyGraph<V> {
    private Map<V, Vertex<V>> vertices;

    public MyGraph() {
        vertices = new HashMap<>();
    }

    public void addVertex(V data) {
        if (!vertices.containsKey(data)) {
            Vertex<V> vertex = new Vertex<>(data);
            vertices.put(data, vertex);
        }
    }

    public void addEdge(V sourceData, V destData, Double weight) {
        Vertex<V> source = vertices.get(sourceData);
        Vertex<V> dest = vertices.get(destData);
        if (source != null && dest != null) {
            Edge<V> edge = new Edge<>(source, dest, weight);
            source.addAdjacentVertex(dest, weight);
        }
    }

    public List<V> breadthFirstSearch(V startData) {
        List<V> visited = new ArrayList<>();
        Queue<Vertex<V>> queue = new LinkedList<>();

        Vertex<V> startVertex = vertices.get(startData);
        if (startVertex != null) {
            queue.add(startVertex);
            visited.add(startData);

            while (!queue.isEmpty()) {
                Vertex<V> currentVertex = queue.poll();
                for (Vertex<V> adjacentVertex : currentVertex.getAdjacentVertices().keySet()) {
                    if (!visited.contains(adjacentVertex.getData())) {
                        queue.add(adjacentVertex);
                        visited.add(adjacentVertex.getData());
                    }
                }
            }
        }

        return visited;
    }

    public Map<V, Double> dijkstraSearch(V startData) {
        Map<V, Double> distances = new HashMap<>();
        PriorityQueue<Vertex<V>> pq = new PriorityQueue<>(Comparator.comparingDouble(v -> distances.getOrDefault(v.getData(), Double.MAX_VALUE)));

        Vertex<V> startVertex = vertices.get(startData);
        if (startVertex != null) {
            distances.put(startData, 0.0);
            pq.add(startVertex);

            while (!pq.isEmpty()) {
                Vertex<V> currentVertex = pq.poll();
                double currentDistance = distances.get(currentVertex.getData());

                for (Map.Entry<Vertex<V>, Double> entry : currentVertex.getAdjacentVertices().entrySet()) {
                    Vertex<V> adjacentVertex = entry.getKey();
                    double weight = entry.getValue();
                    double newDistance = currentDistance + weight;

                    if (newDistance < distances.getOrDefault(adjacentVertex.getData(), Double.MAX_VALUE)) {
                        distances.put(adjacentVertex.getData(), newDistance);
                        pq.add(adjacentVertex);
                    }
                }
            }
        }

        return distances;
    }
}
