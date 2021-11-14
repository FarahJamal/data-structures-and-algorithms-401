package graph.structure;

import graph.data.Vertix;

import java.util.*;

public class Graph<T> {
    Map<Vertix<T>, List<Vertix<T>>>  adjVertices=new HashMap<>();

    public Graph(Map<Vertix<T>, List<Vertix<T>>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public Graph() {

    }

    public Map<Vertix<T>, List<Vertix<T>>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<Vertix<T>, List<Vertix<T>>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public List addVertix(String label) {
        return adjVertices.putIfAbsent(new Vertix(label), new ArrayList<>());
    }
    public void removeVertix(String label) {
        Vertix v = new Vertix(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertix(label));
    }

    public void addEdge(String label1, String label2) {
        if(label1.equals(label2)){
            Vertix v1 = new Vertix(label1);
            adjVertices.get(v1).add(v1);
        }else {
            Vertix v1 = new Vertix(label1);
            Vertix v2 = new Vertix(label2);
            adjVertices.get(v1).add(v2);
            adjVertices.get(v2).add(v1);
        }
    }

    public void removeEdge(String label1, String label2) {
        Vertix v1 = new Vertix(label1);
        Vertix v2 = new Vertix(label2);
        List<Vertix<T>> eV1 = adjVertices.get(v1);
        List<Vertix<T>> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

    public Set<Object> getnodes(){
        Set<Object> set=new HashSet<>();
        for (Vertix n:adjVertices.keySet()){
            set.add( n.getLabel());
            System.out.println(n.getLabel());
        }
        return set;
    }

    public List<Vertix<T>> getAdjVertices(String label) {
        return adjVertices.get(new Vertix(label));
    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjVertices=" + adjVertices +
                '}';
    }
    public int size(){
        System.out.println(adjVertices.size());
        return adjVertices.size();
    }
}