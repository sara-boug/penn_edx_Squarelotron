package squarelotron;

import java.util.Random;

public class Squarlotron {
    public int n; 
    public int[][] square;
	public Squarlotron(int n ) {
	   this.n=n;
	    square=new int[n][n]; 
	    int number=1; 
	    for(int i=0; i <n; i++) { 
 	    	for(int j=0; j<n; j++) { 
 	    		square[i][j]=number;
  	    		number++;
	    	}
	    	
	    }
 	}
	
	 public int[][] Upside_Down_flip(int ring) { 
		    for(int j=ring-1;j<(n-ring)+1; j++) { 
	    		 if(j==ring-1 || j==n-ring) { 

		    	for(int i=ring-1;i<((n-ring)/2)+1;i++) {
		    	  //	 System.out.print("i"+ i);

		    			 int a=square[i][j]; 
		    			 int b=square[n-i-1][j];
		    			 square[i][j]=b;
		    			 square[n-i-1][j]=a;
		    			 System.out.print(square[i][j]+ " ");  
		    			 System.out.print(square[n-i-1][j]+ " ");  

		                  	}
  		    		 } 
		    	}
 		    
		
		 
		 return square;
	 }
}
