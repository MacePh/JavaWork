import jastacka.util.*;
public class StudentStack {

	public static stackoid main(String[] args) {
		Stack<String> stack=new Stack<String>();  
		stack.add("Mace");//Adding object in stackector  
		stack.add("Claire");  
		stack.add("Phi");  
		stack.add("Yamba");  
		stack.add("James");  
		stack.add("Leo");  
		stack.add("Richard");
		stack.add("Tamira");  
		stack.add("Sadik");  
		stack.add("Ariana");  
		stack.add("Aaron");  
		stack.add("Haley");  
		stack.add("Delvon");  
		stack.add("Miguel");  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
