/*
 * July 9 2019
 * Exercise33
 * Graph
 * by Lee Jui Chi
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    HashMap<String, ArrayList<String>> vertex = new HashMap<String, ArrayList<String>>();

    public Graph(String[] nodes) {
        for (String node : nodes) {
            vertex.put(node, new ArrayList<String>());
        }
    }

    public void addEdge(String v, String w) {

        if(v != null && w != null){
            vertex.get(v).add(w);
            vertex.get(w).add(v);

        }




    }

    public ArrayList<String> getNext(String node) {
        return vertex.get(node);
        /* Compete this part */
    }
}