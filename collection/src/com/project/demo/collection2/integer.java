package com.project.demo.collection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class integer {
	
	public static void main(String[]args) {
		List<Integer > numbers=new ArrayList<Integer>();
		numbers.add(34);
		numbers.add(356);
		numbers.add(789);
		numbers.add(3458938);
		System.out.println(numbers);
		for(Integer in:numbers) {
			System.out.println(in);
			}
		System.out.println("--------------------");
		System.out.println(numbers.isEmpty());
		System.out.println(numbers.hashCode());
		System.out.println(numbers.size());
		System.out.println(numbers.indexOf(34));
		System.out.println(numbers.remove(2));
		System.out.println("using iterator ");
		Iterator<Integer> itr=numbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("using list iterator");
		ListIterator<Integer> itr1=numbers.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("reverse order");
		while(itr1.hasPrevious()) {{
			System.out.println(itr1.previous());
		}
		
		 
	}

}}
