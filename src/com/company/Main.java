package com.company;

public class Main {
    public static void main(String[] args) {
        // Create a graph
        MyGraph<String> graph = new MyGraph<>();

        // Add vertices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        // Add weighted edges
        graph.addEdge("A", "B", 2.0);
        graph.addEdge("A", "C", 4.0);
        graph.addEdge("B", "C", 1.0);
        graph.addEdge("B", "D", 7.0);
        graph.addEdge("C", "D", 3.0);
        graph.addEdge("C", "E", 5.0);
        graph.addEdge("D", "E", 2.0);

        // Perform breadth-first search
        System.out.println("Breadth-First Search:");
        System.out.println(graph.breadthFirstSearch("A")); // Output: [A, B, C, D, E]

        // Perform Dijkstra's algorithm
        System.out.println("Dijkstra's Algorithm:");
        System.out.println(graph.dijkstraSearch("A")); // Output: {A=0.0, B=2.0, C=3.0, D=6.0, E=8.0}
    }
}
