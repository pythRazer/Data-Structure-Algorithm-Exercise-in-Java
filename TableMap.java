/*
 * June 11 2019
 * Exercise 23, TableMap.java
 * by Lee Jui Chi
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TableMap {
    HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

    public TableMap(HashMap<String, Integer> hashmap_) {
        hashmap = hashmap_;
    }

    public void showMap() {
        String key;
        int value;
        Set<String> set = hashmap.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            key = iterator.next();
            value = hashmap.get(key);
            System.out.print(key + ":" + value + " ");
        }
        System.out.println("");

    }

    public int len() {
        return hashmap.size();
    }

    public void set(String key, int value) {
        if(hashmap.containsKey(key)){
            hashmap.replace(key, value);

        }else{
            hashmap.remove(key);
            hashmap.put(key, value);

        }
    }

    public int get(String key) {
        return hashmap.get(key);
    }

    public int pop(String key) {


        return hashmap.remove(key);
    }
}
