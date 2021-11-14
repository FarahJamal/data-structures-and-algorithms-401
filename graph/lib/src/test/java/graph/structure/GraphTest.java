package graph.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void added() {
        Graph graph = new Graph();
        graph.addVertix("A");
        graph.addVertix("B");
        graph.addVertix("C");
        graph.addVertix("D");
        graph.addVertix("F");
        assertNotNull(graph);
    }

    //An edge can be successfully added to the graph
    @Test
    void addEdges() {
        Graph graph = new Graph();
        graph.addVertix("A");
        graph.addVertix("B");
        graph.addVertix("C");
        graph.addVertix("D");
        graph.addVertix("F");
        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("B", "C");
        graph.addEdge("D", "C");
        graph.addEdge("B", "F");
        graph.addEdge("D", "F");
        assertNotNull(graph);
    }

    // A collection of all nodes can be properly retrieved from the graph
    @Test
    void collectionOfAllNodes() {
        Graph graph = new Graph();
        graph.addVertix("A");
        graph.addVertix("B");
        graph.addVertix("C");
        graph.addVertix("D");
        graph.addVertix("F");
        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("B", "C");
        graph.addEdge("D", "C");
        graph.addEdge("B", "F");
        graph.addEdge("D", "F");
        assertEquals("[A, B, C, D, F]", graph.getnodes().toString());
    }

    //All appropriate neighbors can be retrieved from the graph
    @Test
    void neighbors() {
        Graph graph = new Graph();
        graph.addVertix("A");
        graph.addVertix("B");
        graph.addVertix("C");
        graph.addVertix("D");
        graph.addVertix("F");
        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("B", "C");
        graph.addEdge("D", "C");
        graph.addEdge("B", "F");
        graph.addEdge("D", "F");
        assertEquals("{A=[B, D], B=[A, C, F], C=[B, D], D=[A, C, F], F=[B, D]}", graph.getAdjVertices().toString());

        //6.The proper size is returned, representing the number of nodes in the graph
        assertEquals(5, graph.size());
    }
    // 7.A graph with only one node and edge can be properly returned
    @Test
    void returnedwithonlyEdge() {
        Graph graph = new Graph();
        graph.addVertix("A");
        graph.addEdge("A", "A");
        assertEquals("{A=[A]}",graph.getAdjVertices().toString());
    }



    // An empty graph properly returns null
    @Test
    void graphIsNull() {
        Graph graph = new Graph();
        assertEquals("{}",graph.getAdjVertices().toString());
    }

    // Code Challenge 36
    //HappyPAth
    @Test void breadthFirst(){
        Graph graph = new Graph();
        graph.addVertix("A");
        graph.addVertix("B");
        graph.addVertix("C");
        graph.addVertix("D");
        graph.addVertix("F");
        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("B", "C");
        graph.addEdge("D", "C");
        graph.addEdge("B", "F");
        graph.addEdge("D", "F");
        assertEquals("[A, B, D, C, F]",graph.breadthFirst("A").toString());
    }

}