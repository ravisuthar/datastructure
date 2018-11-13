package datastructure;

public class LinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
	}
	
	public int size(){
		Node top=head;
		int count=0;
		while(null!=top.next){
				++count;
				top=top.next;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head= new Node(1);
		//Node second=new Node(2);
		//Node third=new Node(3);
		//Node four=new Node(4);
		
		//list.head.next=second;
		//second.next=third;
		//third.next=four;
		
		System.out.println(list.size());
		
	}
}
