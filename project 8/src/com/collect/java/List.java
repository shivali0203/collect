package com.collect.java;

import java.util.LinkedList;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {
	
	        LinkedList l = new LinkedList();
	        l.add("C");
	        l.add("C++");
	        l.add("JAVA");
	        l.add("PHP");
	        System.out.println(l);
	        ListIterator ltr = l.listIterator();
	        while (ltr.hasNext()) {
	            String s = (String) ltr.next();
	            if (s.equals("C++")) {
	                ltr.add("C plus plus");
	            }
	        }
	        System.out.println(l);

	}

}
