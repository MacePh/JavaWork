import java.util.*;
public class StudentsVector {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("Mace");//Adding object in Vector  
		v.add("Claire");  
		v.add("Phi");  
		v.add("Yamba");  
		v.add("James");  
		v.add("Leo");  
		v.add("Richard");
		v.add("Tamira");  
		v.add("Sadik");  
		v.add("Ariana");  
		v.add("Aaron");  
		v.add("Hvey");  
		v.add("Delvon");  
		v.add("Miguel");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
