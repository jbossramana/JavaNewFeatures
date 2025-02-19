package demo;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        // Creating a WeakHashMap
        Map<Key, String> weakHashMap = new WeakHashMap<>();

        // Creating objects to use as keys
        Key key1 = new Key(1);
        Key key2 = new Key(2);

        // Adding entries to the WeakHashMap
        weakHashMap.put(key1, "Value associated with key1");
        weakHashMap.put(key2, "Value associated with key2");

        // Checking the content of the WeakHashMap
        System.out.println("WeakHashMap: " + weakHashMap);

        // Removing the strong reference to key1
        key1 = null;
        

        // Running the garbage collector to reclaim unreferenced objects
      System.gc();

        // Checking the content of the WeakHashMap after garbage collection
        System.out.println("WeakHashMap after garbage collection: " + weakHashMap);
    }

    // Key class to be used as keys in the WeakHashMap
    static class Key {
        private int id;

        public Key(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "id=" + id +
                    '}';
        }
    }
}
