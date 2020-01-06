package squarelotron;
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
		    int square2[][]=this.square.clone();
		    for(int j=ring-1;j<(n-ring)+1; j++) { 
	    		 if(j==ring-1 || j==n-ring) { 

		    	for(int i=ring-1;i<((n-ring)/2)+1;i++) {
 
		    			 int a=square2[i][j]; 
		    			 int b=square2[n-i-1][j];
		    			 square2[i][j]=b;
		    			 square2[n-i-1][j]=a;
		    		 
		                  	}
  		    		 } else { 
  		    	                 int i=ring-1; 
  				     			 int a=square2[i][j]; 
  				    			 int b=square2[n-i-1][j];
  				    			 square2[i][j]=b;
  				    			 square2[n-i-1][j]=a;
  				    			
                                  
  				                  	}
  		    		 } 
		 return square2;
	 }
	 
	 public int[][] main_diagonal_flip(int ring){ 
		    int square2[][]=this.square.clone();

		 for(int j=ring-1; j<(n-ring)+1; j++) { 
			 if(j==ring-1 || j==n-ring) { 
				 for(int i=ring-1; i<((n-ring)); i++) {
					int a=square2[i][j]; 
					int b=square2[j][i]; 
					square2[i][j]=b;
					square2[j][i]=a;
			 
				 }
				 
			 }
			 
		 }		  
		 return square2;
	 }
	
	 
	 public int[][] RotateRight(int number ){ 
		 int num=0; 
 		 while(num< Math.abs(number)) { 
 		 int[][] square2= square.clone();
		 square=new int[n][n];

		 for(int i=0; i<n; i++) { 
             for(int j=0; j<n;j++) { 
 	    		 
 	    		square[i][n-j-1]=square2[j][i];
 		 }
   		 }
		 num++;
		 
		 }
		 return square; 
	 }
}
