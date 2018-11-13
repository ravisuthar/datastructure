package datastructure;

import java.io.IOException;
import java.util.Arrays;

public class Solutio {

    public static void main(String[] args) throws IOException {
        
    	
    	int[] grades=new int[]{73,67,38,33};
    	
    	 // x + (5-(x%5));  73+ 5-3
    	
    	int[] finalGrade=new int[grades.length];
    	for(int i=0;i<grades.length;i++){
    		
    		int count=grades[i];
    		
    		if( grades[i] >=38   &&( 5 - grades[i]%5 )  < 3 ){
    			count=grades[i] + ( 5 - grades[i]%5 );
    		}
    		
    		finalGrade[i]=count;
    	}
    	
    	System.out.println(Arrays.toString(finalGrade));
    	
    }
}