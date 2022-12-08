package com.project.demo.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class list {
	public static void main(String[]args) {
		List<String> container =new ArrayList<String>();
		container.add("pavan");
		container.add("kumar");
		container.add("sathish");
		container.add("surya");
		container.add("karthi");
		System.out.println(container.contains("pavan"));
		System.out.println(container.get(3));
		System.out.println(container.isEmpty());
		System.out.println(container.hashCode());
		List<String>container2=new ArrayList<String>();
		System.out.println("---------------------------------");
		System.out.println(container.addAll(container2));
		System.out.println("--------------------");	
		for(String str:container) {
			System.out.println(str);
		}
		System.out.println("using iterator");
		Iterator<String> itr=container.iterator();
      while(itr.hasNext()) {
		System.out.println(itr.next());
		}
     ListIterator<String> str2= container.listIterator();
      while(str2.hasNext()) {
      System.out.println(str2.next());
     }
    		  
				
				
	}
	

}
