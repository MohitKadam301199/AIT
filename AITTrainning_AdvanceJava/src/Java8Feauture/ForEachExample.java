package Java8Feauture;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
		
		 List<String> list=new ArrayList<String>();  
	     list.add("ankit");  
	     list.add("mayank");  
	     list.add("Mohit");  
	     list.add("Rushi");  
	          
	     list.forEach((n)->System.out.println(n));  
	}

}
