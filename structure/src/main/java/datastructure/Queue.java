package datastructure;

import java.util.Arrays;

public class Queue {


	int[] array=new int[10];
	int front;
	int rear;
	
	public Queue(){
		front=rear= 0;
	}
	
	private void add(int i) {
		array[rear++]=i;
	}
	
	private int remove() {
		int temp= array[front];
		array[front]=0;
		front++;
		return temp;
	}
	
	
	
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(5);
		q.add(6);
		
		System.out.println(q.remove());
		q.add(7);
		System.out.println(q.remove());
		System.out.println(q);
	}

	@Override
	public String toString() {
		return "Queue [array=" + Arrays.toString(array) + "]";
	}
	
}
