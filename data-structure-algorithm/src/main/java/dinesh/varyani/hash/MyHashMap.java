package dinesh.varyani.hash;

public class MyHashMap<K, V> {

    private int numberOfBucket;
    private Node[] bucket;
    private int size;

    public MyHashMap() {
        this(10);
    }

    public MyHashMap(int capacity) {
        this.numberOfBucket = capacity;
        this.size = 0;
        this.bucket = new Node[this.numberOfBucket];
    }


    public static class Node<K, V> {

        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public void put(K key, V value) {

        if (null == key || null == value) {
            throw new IllegalArgumentException("key or value is null");
        }

        int bucketNumber = getBucket(key);
        Node<K, V> head = bucket[bucketNumber];
        while (null != head) {
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head = head.next;
        }
        head = bucket[bucketNumber];
        Node newNode = new Node<>(key, value);
        newNode.next = head;
        bucket[bucketNumber] = newNode;
        this.size++;
    }

    public V getValue(K key) {

        int bucketNumber = getBucket(key);

        Node head = bucket[bucketNumber];
        while (null != head) {
            if(head.key == key){
                return (V) head.value;
            }
            head = head.next;
        }
        return null;
    }


    private int getBucket(K key) {
        return (int) key % this.numberOfBucket;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, Integer> map = new MyHashMap<>();
        map.put(1, 100);
        map.put(11, 1100);
        map.put(21, 2100);

        int value = map.getValue(1);
        System.out.println(value);
        int value11 = map.getValue(11);
        System.out.println(value11);
        int value21 = map.getValue(21);
        System.out.println(value21);


        //contains key?
        //removeKey
    }
}
