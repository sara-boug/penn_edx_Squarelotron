package squarelotron;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

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
	

}
