package graph.structure;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    @Test void depthFirst(){
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
        assertEquals("[A, D, F, B, C]",graph.depthFirst("A").toString());
    }
@Test
    void businessTrip(){
    Graph graph = new Graph();
    graph.addVertix("Pa");

    graph.addVertix("Mo");
    graph.addVertix("Nab");
    graph.addVertix("Ar");
    graph.addVertix("Me");
    graph.addVertix("Nar");

    graph.addEdge("Pa", "Ar");
    graph.addweight("Pa", "Ar",150);
    graph.addEdge("Pa", "Me");
    graph.addweight("Pa", "Me",82);
    graph.addEdge("Ar", "Me");
    graph.addweight("Ar", "Me",99);
    graph.addEdge("Ar", "Mo");
    graph.addweight("Ar", "Mo",42);
    graph.addEdge("Me", "Nar");
    graph.addweight("Me", "Nar",37);
    graph.addEdge("Nab", "Nar");
    graph.addweight("Nab", "Nar",250);
    graph.addEdge("Me", "Nab");
    graph.addweight("Me", "Nab",26);
    graph.addEdge("Mo", "Me");
    graph.addweight("Mo", "Me",105);
    graph.addEdge("Mo", "Nab");
    graph.addweight("Mo", "Nab",73);



    graph.toString();
    List newList=new ArrayList();
    newList.add("Nab");
    newList.add("Pa");
    List newList2=new ArrayList();
    newList2.add("Mo");
    newList2.add("Me");
    assertEquals("False, $0",graph.graphbusnisstrip(graph,newList ));
    assertEquals("True, $105",graph.graphbusnisstrip(graph,newList2 ));

}
}