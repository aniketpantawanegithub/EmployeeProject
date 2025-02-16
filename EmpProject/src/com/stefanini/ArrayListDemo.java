package com.stefanini;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("sagar","praful","ajay","vishal","gopal");
		
		Iterator<String> itr = asList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
