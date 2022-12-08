package com.project.demo.stack;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class collection {
	public static void main(String[]args) {
		Stack<String> names=new Stack<String>();
		names.push("mobile");
		names.add("laptop");
		names.push("desktop");
		names.push("games");
		names.push("chair");
		//names.pop();
		//names.pop();
	
		System.out.println(names);
		for(String str:names) {
			System.out.println(str);
		}
		
		System.out.println(names.peek());
		System.out.println("using iterator ,,,,,,,,,,,,,,,,,");
		Iterator<String> str1=names.iterator();
		while(str1.hasNext()) {
			System.out.println(str1.next());
		}
		System.out.println("using list iterator");
		ListIterator<String> str2=names.listIterator();
		while(str2.hasNext()) {
			System.out.println(str2.next());
		}
		while(str2.hasPrevious()) {
			System.out.println(str2.previous());
		}
		
		
	}

}
