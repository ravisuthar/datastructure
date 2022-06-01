package leetcode.must.doo;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

//https://www.allprogrammingtutorials.com/tutorials/implementing-lru-cache-using-linkedhashmap-in-java.php
//https://www.baeldung.com/java-lru-cache
//https://leetcode.com/problems/lru-cache/
public class Solution13 {
    public static void main(String[] args) {
        LRUCache<String, String> cache = new LRUCache<>(3);
        cache.put("1","1");
        cache.put("2","2");
        cache.put("3","3");
        cache.put("4","4");
        System.out.println(cache);
        cache.get("2");
        System.out.println(cache);
        cache.put("5","5");
        System.out.println(cache);
    }
}


class LRUCache<K,V> extends LinkedHashMap<K,V>{
        private int capacity;
        public LRUCache(int capacity){
            super(capacity, 1.0f, true);
            this.capacity=capacity;
        }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>this.capacity;
    }

}
