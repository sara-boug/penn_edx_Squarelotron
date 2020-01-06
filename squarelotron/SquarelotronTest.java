package squarelotron;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquarelotronTest {
  Squarlotron square; 
	@BeforeEach
	void setUp() throws Exception {
		square=new Squarlotron(3);
	}

	@Test
	void squareTest() {
		int[][] array = {{1,2,3},
			             {4,5,6},
		              	 {7,8,9}};
 		assertArrayEquals(square.square,array);
 	}
	
	@Test
	void updsideDownFlip() { 
		int[][] array= {
			           	{7,8,9},
			           	{4,5,6},
			           	{1,2,3} };
		
		assertArrayEquals(square.Upside_Down_flip(1), array);
		
		
	 }
	@Test
	void main_diagonal_flipTest() { 
	     int[][] array={{1,4,7},
			            {2,5,8},
		              	{3,6,9}};
			assertArrayEquals(square.main_diagonal_flip(1), array);

	}
	
	@Test 
	void rotateright() { 
		 int[][] array={{7,4,1},
		                {8,5,2},
	                 	{9,6,3}};
		 
		assertArrayEquals(square.RotateRight(-1), array);

		
	}
	

}
