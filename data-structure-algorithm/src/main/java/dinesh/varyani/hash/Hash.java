package dinesh.varyani.hash;

public class Hash<K, V> {
    private HashNode[] buckets;
    private int size;
    private int numberOfBucket;

    public Hash() {
        this(10);
    }

    public Hash(int capacity) {
        this.size = 0;
        this.numberOfBucket = capacity;
        this.buckets = new HashNode[this.numberOfBucket];
    }

    private static class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public void put(K key, V value) {

        if (null == key || null == value) {
            throw new IllegalArgumentException("Key or Value is null");
        }

        int bucketIndex = getIndex(key);
        HashNode<K, V> head = buckets[bucketIndex];
        while (null != head) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets[bucketIndex];
        HashNode<K, V> newNode = new HashNode<>(key, value);
        newNode.next = head;
        buckets[bucketIndex] = newNode; //New node will be added first to the linked list.
        this.size++;
    }

    private int getIndex(K key) {
        return (int) key % this.numberOfBucket;
    }

    public V get(K key) {
        int bucketIndex = getIndex(key);
        HashNode<K, V> head = this.buckets[bucketIndex];
        while (null != head) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void remove(K key) {
        if (null == key) {
            throw new IllegalArgumentException("Key  is null");
        }

        int bucketIndex = getIndex(key);
        HashNode<K, V> head = this.buckets[bucketIndex];
        HashNode<K, V> previous = null;
        while (null != head) {
            if (head.key.equals(key)) {
                if (null != previous) {
                    previous.next = head.next;
                } else {
                    this.buckets[bucketIndex] = head.next;
                }
                this.size--;
                break;
            }
            previous=head;
            head = head.next;
        }

    }

    public boolean containsKey(K key) {
        int bucketIndex = getIndex(key);
        HashNode<K, V> head = this.buckets[bucketIndex];
        while (null != head) {
            if (head.key.equals(key)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public static void main(String[] args) {
        Hash<Integer, String> hash = new Hash<>();
        hash.put(1, "A");
        hash.put(11, "B");
        hash.put(101, "C");

        System.out.println(hash.get(1));
        System.out.println(hash.get(11));
        System.out.println(hash.get(101));

        hash.remove(11);
        hash.remove(1);
        hash.remove(101);

    }
}
