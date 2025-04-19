package dinesh.varyani.hash;

public class HashTable {

    private Node[] buckets;
    private int size;
    private int bucketSize;

    public HashTable(int bucketSize) {
        this.bucketSize = bucketSize;
        this.buckets = new Node[bucketSize];
        this.size = 0;
    }

    private class Node {
        private Integer key;
        private Integer value;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Integer getBucketIndex(Integer key) {
        return key %this.bucketSize; // 10
    }

    public void put(Integer key, Integer value) {

        if (null == key || null == value) {
            throw new RuntimeException("empty");
        }

        int bucketIndex = this.getBucketIndex(key); //5
        Node head = this.buckets[bucketIndex];
        while(null!=head){
            if(head.key == key){
                head.value = value;
                return;
            }
            head = head.next;
        }

        head = this.buckets[bucketIndex];
        Node newNode = new Node(key, value);
        newNode.next = head;
        this.buckets[bucketIndex] = newNode;
        this.size++;
    }

    public Integer get(int key){

        int bucketIndex = this.getBucketIndex(key);
        Node head = this.buckets[bucketIndex];
        while(null!=head){
            if(head.key == key){
                return head.value;
            }
            head= head.next;
        }
        return null;
    }


    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put(1,1);
        table.put(11,11);
        table.put(21,21);
        table.put(2,2);
        table.put(2,2);

        System.out.println(table.size);


        System.out.println(table.get(1));
        System.out.println(table.get(11));
        System.out.println(table.get(21));
        System.out.println(table.get(2));
        System.out.println(table.get(32));
    }
}
