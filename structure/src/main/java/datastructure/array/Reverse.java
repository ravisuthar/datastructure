package datastructure.array;

public class Reverse {

	public static void main(String[] args) {
		
		
		int[] a = new int[]{5,4,12,7,15,9};
		
		int index=a.length-1;
		for(int i=0;i<a.length/2;i++){
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			index--;
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}
}
