import java.util.HashMap;

public class MapTest {
    HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        MapTest mt = new MapTest();
//        mt.ex21();
//        mt.ex22();
        mt.ex23();
    }

    public void ex21() {
        hashmap = getData();
        TableMap tm = new TableMap(hashmap);
        tm.showMap();
    }

    public void ex22() {
        hashmap = getData();
        TableMap tm = new TableMap(hashmap);
        System.out.println("the size is "  + tm.len());
        tm.showMap();
        tm.set("A", 7);
        tm.showMap();
        tm.set("K", 5);
        tm.showMap();
    }

    public void ex23() {
        hashmap = getData();
        TableMap tm = new TableMap(hashmap);
        tm.showMap();
        System.out.println("the value associated with key U is " + tm.get("U"));
        tm.showMap();
        System.out.println("the value popped with key U is " + tm.pop("U"));
        tm.showMap();
    }

    public HashMap<String, Integer> getData(){
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

        hashmap.put("K", 2);
        hashmap.put("B", 4);
        hashmap.put("U", 2);
        hashmap.put("V", 8);
        return hashmap;
    }
}
