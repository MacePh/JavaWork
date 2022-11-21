import java.util.*;
public class StudentsArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Mace");//Adding object in arraylist  
		list.add("Claire");  
		list.add("Phi");  
		list.add("Yamba");  
		list.add("James");  
		list.add("Leo");  
		list.add("Richard");
		list.add("Tamira");  
		list.add("Sadik");  
		list.add("Ariana");  
		list.add("Aaron");  
		list.add("Haley");  
		list.add("Delvon");  
		list.add("Miguel");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
