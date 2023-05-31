# My Graph Implementation

This repository contains the implementation of a weighted graph, breadth-first search, and Dijkstra's algorithm in Java.

## Overview

The implementation is divided into three classes:
- `myGraph`: Implements a weighted graph and provides methods for adding vertices, edges, performing breadth-first search, and Dijkstra's algorithm.
- `Edge`: Represents an edge in the graph with a source, destination, and weight.
- `Vertex`: Represents a vertex in the graph with its associated data and a map of adjacent vertices and their weights.

## Usage

To use the `myGraph` class, follow these steps:

1. Create an instance of the `myGraph` class:

   ```java
   myGraph<String> graph = new myGraph<>();
