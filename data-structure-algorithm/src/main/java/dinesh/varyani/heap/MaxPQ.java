package dinesh.varyani.heap;

import java.util.Arrays;

public class MaxPQ {
    private int[] heap;
    private int size;

    public MaxPQ(int capacity) {
        this.heap = new int[capacity + 1];
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    //Bottom - Up Reheapify (Swim) in Max Heap
    public void insert(int data) {
        if(this.size == this.heap.length-1){
            resize(2*this.heap.length);
        }

        this.size++;
        this.heap[this.size] = data;
        swim(this.size);
    }

    private void resize(int newSize) {
        int[] newHeap = new int[newSize];
        for (int i = 0; i < this.heap.length; i++) {
            newHeap[i]=this.heap[i];
        }
        this.heap=newHeap;
    }

    private void swim(int size) {
        while (size > 1 && this.heap[size / 2] < this.heap[size]) {
            int temp = this.heap[size / 2];
            this.heap[size / 2] = this.heap[size];
            this.heap[size] = temp;
            size = size / 2;
        }
    }

    public int deleteMax(){
        int max = this.heap[1];
        swap(1, this.size); //apply swap with last element
        this.size--;
        sink(1);
        heap[this.size+1]=0;
        if(this.size > 1 && (this.size == (this.heap.length-1)/4)){
            resize(2* (this.heap.length));
        }
        return max;
    }

    private void sink(int i) {
        while(2*i <= this.size){
            int j=2*i;

            if(j<this.size && heap[j] < heap[j+1]){
                j++;
            }

            if(heap[this.size] >=this.heap[j]){
                break;
            }
            swap(i, j);
            this.size=j;
        }
    }

    private void swap(int a, int b) {
        int temp = this.heap[a];
        this.heap[a]=this.heap[b];
        this.heap[b]=temp;
    }

    private void print(){
        System.out.println(Arrays.toString(this.heap));
    }

    public static void main(String[] args) {
        MaxPQ pq = new MaxPQ(3);
        System.out.println(pq.getSize());
        System.out.println(pq.isEmpty());

        pq.insert(4);
        pq.insert(5);
        pq.insert(6);
        pq.insert(2);
        pq.insert(3);

        pq.print();
        pq.deleteMax();

        pq.print();
    }

}
