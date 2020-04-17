/*
 * July 16 2019
 * Exercise35
 * by Lee Jui Chi
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise35 {
    String[] vertices = {"A", "B", "C", "E", "F", "G", "I", "J", "K"};

    public static void main(String[] args) {
        new Exercise35();
    }

    public Exercise35() {
        ArrayList<String> discovered = new ArrayList<String>();
        String startNode = "A";
        Graph gf = new Graph(vertices);

        gf.addEdge("A", "B");
        gf.addEdge("A", "E");
        gf.addEdge("A", "F");
        gf.addEdge("B", "C");
        gf.addEdge("B", "F");
        gf.addEdge("C", "G");
        gf.addEdge("E", "F");
        gf.addEdge("E", "I");
        gf.addEdge("F", "I");
        gf.addEdge("G", "J");
        gf.addEdge("G", "K");
        gf.addEdge("I", "J");
        gf.addEdge("J", "K");

        for (String node : vertices) {
            ArrayList<String> nodes = gf.getNext(node);
            System.out.println(node + " >> " + nodes);
        }

        discovered.add(startNode);
        dfs(gf, startNode, discovered);
    }

    public void dfs(Graph gf, String u, ArrayList<String> discovered) {
        ArrayList<String> level = new ArrayList<String>();
        String vertex;
        level.add(u);
        while (level.size() > 0) {
            System.out.println(level);
            ArrayList<String> next_level = new ArrayList<String>();
            Iterator<String> iteratorL = level.iterator();
            while (iteratorL.hasNext()) {
                ArrayList<String> nodes = gf.getNext(iteratorL.next());
                Iterator<String> iteratorN = nodes.iterator();
                while (iteratorN.hasNext()) {
                    vertex = iteratorN.next();
                    if (!discovered.contains(vertex)) {
                        discovered.add(vertex);
                        next_level.add(vertex);
                    }
                }
            }
            level = next_level;
        }
    }
}