# My Graph Implementation

This repository contains the implementation of a weighted graph, breadth-first search, and Dijkstra's algorithm in Java.

## Overview

The implementation consists of three classes: `myGraph`, `Edge`, and `Vertex`.

### `myGraph` Class
The `myGraph` class implements a weighted graph and provides methods for adding vertices, adding weighted edges, performing breadth-first search, and executing Dijkstra's algorithm.

### `Edge` Class
The `Edge` class represents an edge in the graph. It has properties for the source vertex, destination vertex, and weight.

### `Vertex` Class
The `Vertex` class represents a vertex in the graph. It holds the associated data and a map of adjacent vertices along with their weights.

## Usage

To use the `myGraph` class, follow these steps:

1. **Create an Instance of `myGraph` Class**

   ```java
   myGraph<String> graph = new myGraph<>();

2. **Add Vertices**
   ```java
   graph.addVertex("A");
   graph.addVertex("B");
   graph.addVertex("C");
   // ...
   
3. **Add Weighted Edges**
Use the addEdge method to add weighted edges between vertices.
   ```java 
   graph.addEdge("A", "B", 2.0);
   graph.addEdge("B", "C", 1.0);
   // ...

4. **Perform Breadth-First Search**
Use the breadthFirstSearch method to perform a breadth-first search traversal starting from a specified vertex.
   ```java
   List<String> bfsResult = graph.breadthFirstSearch("A");

5. **Perform Dijkstra's Algorithm** 
Use the dijkstraSearch method to perform Dijkstra's algorithm starting from a specified vertex.
   ```java
   Map<String, Double> dijkstraResult = graph.dijkstraSearch("A");

## Example

Here's an example that demonstrates the usage of the `myGraph` class:

```java
import com.company.myGraph;

public class Main {
    public static void main(String[] args) {
        // Create an instance of myGraph
        myGraph<String> graph = new myGraph<>();
        
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
