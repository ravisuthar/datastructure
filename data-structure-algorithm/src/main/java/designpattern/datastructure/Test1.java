package designpattern.datastructure;


public class Test1 {

	public static void main(String[] args) {
		int[] a=new int[]{1,3,4,4,5};
		
		int sum= a.length*(a[0]+a[a.length-1])/2;
		System.out.println(sum);
		
		int actualsum=0;
		for(int i=0;i<a.length;i++) actualsum+=a[i];
		
		System.out.println(Math.abs(actualsum-sum));
		
	}
}
