package com.project.demo.vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class lists {
	public static void main(String[]args) {
		Vector<String> str=new Vector<String>();
		str.add("pavan");
		str.add("kumar");
		str.add("karthi");
		str.add("sekar");
		str.add("raju");
		System.out.println(str);
		for(String str1:str) {
			System.out.println(str1);
		}
		System.out.println("---------------------.......,,,,,,,,,,,,,");
		
		System.out.println(str.contains("pavan"));
		System.out.println(str.capacity());
		System.out.println(str.hashCode());
		System.out.println(str.indexOf("pavan"));
		System.out.println(str.isEmpty());
		System.out.println(str.remove(0));
		System.out.println(str.lastElement());
		
		
		
		
		
		
		System.out.println("using iterator,,,,,,,,,,,,,,,,,,,,,,,,");
		
		Iterator<String> str2=str.iterator();
		while(str2.hasNext()) {
			System.out.println(str2.next());
		}
		System.out.println("list iterator,,,,,,,,,,,,,,,,");
		
		ListIterator<String> str3=str.listIterator();
		while(str3.hasNext()) {
			System.out.println(str3.next());
		}
		System.out.println("reverse order,,,,,,,,,,,,,,,,");
		
		while(str3.hasPrevious()) {
			System.out.println(str3.previous());
		}
		
	}

}
