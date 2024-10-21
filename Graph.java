// here is the implementation of graph using linkedlist

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
    private HashMap<Integer, LinkedList<Integer>> map;

    public void addVertices(int vertex) {
        map.put(vertex, new LinkedList<>());
    }

    public void addConnection(int start, int end){
        
        map.get(start).add(end);
    }

    public HashMap<Integer, LinkedList<Integer>> getMap() {
        return map;
    }

    public void setMap(HashMap<Integer, LinkedList<Integer>> map) {
        this.map = map;
    }
}
