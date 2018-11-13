package datastructure.stack;

public class StackGenerics<T> {

	Node<T> top;
	
	public void push(T t){
		if(null!=top){
			top.data=t;
		}else{
			Node<T> top=new Node<T>();
			top.data=t;
			top.next=null;
		}
		
	}
	
	public static class Node<T>{
			T data;
			Node<T> next;
	}
	
	
	public static void main(String[] args) {
		
		StackGenerics<String> stack=new StackGenerics<String>();
		stack.push("a");
		stack.push("b");
		
	}
}
