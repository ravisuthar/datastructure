package datastructure;

public class RecursionTest {

	public static void main(String[] args) {
		
		System.out.println(fact2(5));
	}
	
	public static int fact(int i){
		return i==0 ? 1 : i*fact(i-1);
	}
	
	public static int fact2(int i){
		if(i==0) return 1;
		return i*fact2(i-1);
	}
}
