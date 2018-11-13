package datastructure;

public class Occurance {

	public static void main(String[] args) {
		
		int[] a=new int[]{1, 2, 3, 4, 1};
		
		int search=1;
		int index=0;
		for(int i=0;i<a.length;i++){
			if(search==a[i]){
				index=i;
			}
		}
		
		System.out.println(index);
	}
}
