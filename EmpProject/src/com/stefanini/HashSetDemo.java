package com.stefanini;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> ht = new HashSet<String>();
		ht.add("Hello World");
		ht.add("Aniket");
		ht.add("sandip");
		ht.add("Ram");
		ht.add("sham");
		
		for(String s : ht) {
			System.out.println(s);
		}
		

	}

}
