package designpattern.datastructure.stack;

public class Stack {

	int[] a=new int[5];
	int top;
	
	public Stack(){
		this.top=-1;
	}
	
	
	public boolean push(int data){
		if(this.top >=5 ) throw new RuntimeException("overflow exception.");
		a[++this.top]= data;
		return true;
	}
	
	public int pop(){
		if(this.top <=0) throw new RuntimeException("underflow exception."); 
		return a[this.top--];
	}
	
	public int peep(){
		return a[this.top];
	}
	
	public int size(){
		return this.top;
	}
	
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println(stack.pop());
		
	}
}
