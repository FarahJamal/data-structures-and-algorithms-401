package graph.structure;

import graph.data.Vertix;

import java.util.*;

public class Graph<T> {
    Map<Vertix<T>, List<Vertix<T>>>  adjVertices=new HashMap<>();

    public Graph(Map<Vertix<T>, List<Vertix<T>>> adjVertices) {
        this.adjVertices = adjVertices;
    }
    Map<Vertix<T>, Map<Vertix<T>,Integer>>  wieghtAdjVertices=new HashMap<>();

    public Graph(Map<Vertix<T>, List<Vertix<T>>> adjVertices, Map<Vertix<T>, Map<Vertix<T>, Integer>> wieghtAdjVertices) {
        this.adjVertices = adjVertices;
        this.wieghtAdjVertices = wieghtAdjVertices;
    }

    public Graph() {

    }

    public Map<Vertix<T>, Map<Vertix<T>, Integer>> getWieghtAdjVertices() {
        return wieghtAdjVertices;
    }
    public Map<Vertix<T>, List<Vertix<T>>> getAdjVertices() {
        return adjVertices;
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
    public List<Vertix<T>> breadthFirst(T data){
        Vertix<T>node=new Vertix<>(data);
        if(node.label==null)return null;
        List<Vertix<T>> nodes=new ArrayList<>();
        Queue<T> breadth=new LinkedList<>();
        Set<Vertix<T>> visited= new HashSet<>();

        breadth.add((T) node);
        visited.add(node);
        while (!breadth.isEmpty()){
            Vertix<T> front= (Vertix<T>) breadth.poll();
            nodes.add(front);
            for (Vertix<T> neighbor:getAdjVertices(front.getLabel().toString())){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    breadth.add((T) neighbor);
                }
            }
        }
        return nodes;
    }
    public void addweight(String label1, String label2,Integer weight) {
        if(label1.equals(label2)){
            Vertix v1 = new Vertix(label1);
            adjVertices.get(v1).add(v1);
        }else {
            Vertix v1 = new Vertix(label1);
            Vertix v2 = new Vertix(label2);
            adjVertices.get(v1).add(v2);
            adjVertices.get(v2).add(v1);
            if(this.adjVertices.containsKey(v1)&&this.adjVertices.containsKey(v2)){
                this.wieghtAdjVertices.putIfAbsent(v1, new HashMap<>());
                this.wieghtAdjVertices.putIfAbsent(v2, new HashMap<>());
                this.wieghtAdjVertices.get(v1).put(v2, weight);
                this.wieghtAdjVertices.get(v2).put(v1, weight);

            }
        }
    }
    public String graphbusnisstrip(Graph graph,List<String> cities){
        Integer cost=0;
        for (int i=0;i<cities.size()-1;i++){
            Vertix<String> source=new Vertix<>(cities.get(i));
            Vertix<String> dest=new Vertix<>(cities.get(i+1));
            if (((Map)graph.getWieghtAdjVertices().get(source)).get(dest)!=null){
                cost+=((Integer)((Map)graph.getWieghtAdjVertices().get(source)).get(dest));
            }
        }
        return cost > 0 ? "True, $" + cost : "False, $" + cost;
    }
    List<Vertix<T>> getNeighbors(String data) {
        Vertix vertex = new Vertix(data);
        return adjVertices.get(vertex);
    }

    public Set<String> depthFirst(String root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);

                for (Vertix v : getNeighbors(vertex)) {
                    stack.push( v.label.toString());
                }
            }
        }
        return visited;
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