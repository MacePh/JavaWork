import java.util.*;

public class StudentsLinkedList {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Mace");//Adding object in Linkedlist  
		al.add("Claire");  
		al.add("Phi");  
		al.add("Yamba");  
		al.add("James");  
		al.add("Leo");  
		al.add("Richard");
		al.add("Tamira");  
		al.add("Sadik");  
		al.add("Ariana");  
		al.add("Aaron");  
		al.add("Haley");  
		al.add("Delvon");  
		al.add("Miguel");  
		//Traversing list through Iterator  
		Iterator<String> itr=al.iterator(); 
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		}
	}

}
