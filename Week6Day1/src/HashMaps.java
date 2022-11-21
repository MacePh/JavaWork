import java.io.Console;
import java.util.*;
public class HashMaps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Creates a HashMap with a String as key and Integer as the value it points to
		HashMap<String, String > car = new HashMap<String, String >();
		System.out.println("What car model are you looking for?");
		car.put("Toyota", "tundra");
		car.put("Honda", "Civic");
		car.put("Toyota", "Camry");
		car.put("Subaru", "Impreza");
		car.put("Honda", "Accord");
		car.put("Dodge", "Ram");
		car.put("Dewu", "POS");
		String query = input.nextLine();
		if(car.containsKey(query)) {
			System.out.println("we have that model.");
			System.out.println("the make is "+ car.get(query).toString() );
		
		}
		else {
			System.out.println("we don't have that model");
			
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
