package squarelotron;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Square Size : ");
	    int number=scanner.nextInt();
		System.out.println("Ring number : "); 
	    int ring_num= scanner.nextInt();  
	    
	    Squarlotron square=new Squarlotron(number);
     
		System.out.println("Square : " + Arrays.deepToString( square.square)); 
		System.out.println("UpsideDown Flip : "+ Arrays.deepToString( square.Upside_Down_flip(ring_num)));
		System.out.println("Main Diagonal Flip : "+Arrays.deepToString( square.main_diagonal_flip(ring_num)));
		System.out.println("UpsideDown Flip : "+ Arrays.deepToString( square.RotateRight(ring_num)));
		scanner.close();
 }

}