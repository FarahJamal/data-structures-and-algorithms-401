/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import graph.structure.Graph;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
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
//        List newList=new ArrayList();
//        newList.add("Nab");
//        newList.add("Pa");
        System.out.println(graph.breadthFirst("Pa"));

        System.out.println(graph.depthFirst("Pa"));

    }
}