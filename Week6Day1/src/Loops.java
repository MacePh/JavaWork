import java.io.Console;
import java.util.*;
public class Loops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = 0;
		int sum = 0;
		int product =1;
		System.out.println("Please enter 5 numbers:");
		for(int i=0; i<5; i++) {
			number = scanner.nextInt();
			sum += number;
			
			product *= number;
		}
		System.out.printf("Sum is = %s!\n", sum);
		System.out.printf("Product is = %s!\n", product);
	}

}
