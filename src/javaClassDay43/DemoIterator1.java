package javaClassDay43;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator1 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Mili");
		nameList.add("Chris");
		nameList.add("Issam");
		nameList.add("Alena");
		
		
		Iterator<String> it = nameList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
