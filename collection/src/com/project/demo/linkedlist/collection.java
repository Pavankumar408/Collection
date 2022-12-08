package com.project.demo.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class collection {
	public static void main(String[]args) {
	List<String> names=new LinkedList<String>();
		names.add("pavan");
		names.add("kumar");
		names.add("suriya");
		names.add("karthi");
		names.add("naveen");
		System.out.println(names);
		for(String str:names) {
			System.out.println(str);
			System.out.println("--------------------------");
			System.out.println(names.isEmpty());
			System.out.println(names.size());
			System.out.println(names.hashCode());
			System.out.println(names.lastIndexOf(names));
			System.out.println(names.contains("naveen"));
		}
		System.out.println("using iterator,,,,,,,,,,,,,,,,");
	Iterator<String> name1=names.iterator() ;
	while(name1.hasNext()) {
		System.out.println(name1.next());
	}
	System.out.println("using list iterator,,,,,,,,,,,,,,,,,,,,");
	ListIterator<String> name2=names.listIterator();
	while(name2.hasNext()) {
		System.out.println(name2.next());
	}
	System.out.println("reverse method,,,,,,,,,,,,,,");
	
	while(name2.hasPrevious()) {
		System.out.println(name2.previous());
		
	}
	}

}
