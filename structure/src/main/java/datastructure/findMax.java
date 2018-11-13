package datastructure;

public class findMax {

	public static void main(String[] args) {
		
		int[] a=new int[]{5,2,9,7,6,3};
		
		int max=a[0];
		int second=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				second=max;
				max=a[i];
			}
			
			if(a[i]>second && a[i]!=max){
				second=a[i];;
			}
		}
		
		System.out.println(max);
		System.out.println(second);
	}
}
