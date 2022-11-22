//import java.lang.reflect.Array;
import java.util.*;
public class DataStructures3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int power;
		int size;
		System.out.println("Enter Size:");
		size = input.nextInt();
		System.out.println("Enter Power:");
	   power = input.nextInt();
ArrayList<Integer> toPower = new ArrayList<Integer>(size);

for(int i=0; i<size; i++) {
		 toPower.add(i,(int)Math.pow(i,power));
		 
		 }
			System.out.println(toPower);
//		

	}

}
